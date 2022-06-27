package ru.example.nexing.domain.mapper;

import org.mapstruct.Mapper;
import ru.example.nexing.domain.dto.NameDto;
import ru.example.nexing.domain.entity.Name;

@Mapper
public interface NameMapper extends SuperMapper<Name, NameDto> {
}
