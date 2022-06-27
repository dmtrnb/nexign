package ru.example.nexing.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultDto {

    private ParticipantDto winner;
    private int sum;
}
