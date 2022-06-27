package ru.example.nexing.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParticipantDto {

    private NameDto name;
    private CityDto city;
    private int age;
}
