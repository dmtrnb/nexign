package ru.example.nexing.domain.mapper;

import org.mapstruct.Mapper;
import ru.example.nexing.domain.dto.CityDto;
import ru.example.nexing.domain.entity.City;

@Mapper
public interface CityMapper extends SuperMapper<City, CityDto> {
}
