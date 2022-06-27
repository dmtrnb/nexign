package ru.example.nexing.service;

import ru.example.nexing.domain.dto.ParticipantDto;
import ru.example.nexing.domain.entity.Participant;

import java.util.List;

public interface ParticipantService {

    ParticipantDto add(ParticipantDto participant);

    List<ParticipantDto> findAll();

    long count();

    Participant getWinner(long offset);

    void clear();
}
