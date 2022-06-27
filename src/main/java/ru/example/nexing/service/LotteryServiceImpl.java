package ru.example.nexing.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.example.nexing.domain.dto.ResultDto;
import ru.example.nexing.domain.entity.Participant;
import ru.example.nexing.domain.entity.Result;
import ru.example.nexing.domain.mapper.ResultMapper;
import ru.example.nexing.exception.NotEnoughParticipantsException;
import ru.example.nexing.repository.ResultRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LotteryServiceImpl implements LotteryService {

    private static final int MIN_PLAYERS = 2;
    private static final int MIN_WIN = 1;
    private static final int MAX_WIN = 1000;

    private final ResultRepository resultRepository;
    private final ParticipantService participantService;
    private final RandomService randomService;
    private final ResultMapper resultMapper;

    @Override
    @Transactional
    public ResultDto start() {
        long count = participantService.count();
        if (count < MIN_PLAYERS) {
            throw new NotEnoughParticipantsException();
        }

        long winner_num = randomService.getWinning(0, count - 1);
        long winning = randomService.getWinning(MIN_WIN, MAX_WIN);
        Participant winner = participantService.getWinner(winner_num);

        Result result = new Result(winner.getName().getName(), winner.getCity().getName(), winner.getAge(), winning);
        resultRepository.save(result);
        participantService.clear();

        return resultMapper.toDto(result);
    }

    @Override
    public List<ResultDto> winners() {
        return resultRepository.findAll().stream()
                .map(resultMapper::toDto)
                .collect(Collectors.toList());
    }
}
