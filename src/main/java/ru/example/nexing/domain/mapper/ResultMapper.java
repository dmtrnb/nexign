package ru.example.nexing.domain.mapper;

import org.mapstruct.Mapper;
import ru.example.nexing.domain.dto.ResultDto;
import ru.example.nexing.domain.entity.Result;

@Mapper
public interface ResultMapper extends SuperMapper<Result, ResultDto> {
}
