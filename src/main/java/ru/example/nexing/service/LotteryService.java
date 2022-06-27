package ru.example.nexing.service;

import ru.example.nexing.domain.dto.ResultDto;
import ru.example.nexing.exception.NotEnoughParticipantsException;

import java.util.List;

public interface LotteryService {

    ResultDto start() throws NotEnoughParticipantsException;

    List<ResultDto> winners();
}
