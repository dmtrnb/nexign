package ru.example.nexing.domain.mapper;

import org.mapstruct.Mapper;
import ru.example.nexing.domain.dto.ParticipantDto;
import ru.example.nexing.domain.entity.Participant;

@Mapper(uses = {CityMapper.class, NameMapper.class})
public interface ParticipantMapper extends SuperMapper<Participant, ParticipantDto> {
}
