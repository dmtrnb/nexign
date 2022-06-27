package ru.example.nexing.domain.mapper;

import org.mapstruct.Mapper;
import ru.example.nexing.domain.dto.ParticipantDto;
import ru.example.nexing.domain.entity.Participant;

@Mapper
public interface ParticipantMapper extends SuperMapper<Participant, ParticipantDto> {
}
