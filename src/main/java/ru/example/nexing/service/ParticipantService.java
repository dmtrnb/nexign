package ru.example.nexing.service;

import ru.example.nexing.domain.dto.ParticipantDto;

import java.util.List;

public interface ParticipantService {

    ParticipantDto add(ParticipantDto participant);

    List<ParticipantDto> findAll();
}
