package ru.example.nexing.domain.mapper;

import org.mapstruct.Mapper;
import ru.example.nexing.domain.dto.ResultDto;
import ru.example.nexing.domain.entity.Result;

@Mapper(uses = {ParticipantMapper.class})
public interface ResultMapper extends SuperMapper<Result, ResultDto> {
}
