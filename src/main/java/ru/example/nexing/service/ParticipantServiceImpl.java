package ru.example.nexing.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.example.nexing.domain.dto.ParticipantDto;
import ru.example.nexing.domain.entity.Participant;
import ru.example.nexing.domain.mapper.ParticipantMapper;
import ru.example.nexing.repository.CityRepository;
import ru.example.nexing.repository.ParticipantRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ParticipantServiceImpl implements ParticipantService {

    private final CityRepository cityRepository;
    private final ParticipantRepository participantRepository;
    private final ParticipantMapper participantMapper;

    @Override
    @Transactional
    public ParticipantDto add(ParticipantDto participantDto) {
        Participant participant = participantMapper.fromDto(participantDto);
        if (cityRepository.existsByName(participant.getCity().getName())) {
            participant.setCity(cityRepository.findByName(participant.getCity().getName()));
        }

        Participant savedParticipant = participantRepository.save(participant);
        return participantMapper.toDto(savedParticipant);
    }

    @Override
    public List<ParticipantDto> findAll() {
        return participantRepository.findAll().stream()
                .map(participantMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public long count() {
        return participantRepository.count();
    }

    @Override
    public Participant getWinner(long offset) {
        return participantRepository.getWinner(offset);
    }

    @Override
    public void clear() {
        participantRepository.deleteAll();
    }
}
