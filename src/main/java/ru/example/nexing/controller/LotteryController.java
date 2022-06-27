package ru.example.nexing.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.nexing.domain.dto.ResultDto;
import ru.example.nexing.service.LotteryService;

import java.util.List;

@RestController
@RequestMapping("/lottery")
@RequiredArgsConstructor
public class LotteryController {

    private final LotteryService lotteryService;

    @GetMapping("/start")
    public ResultDto start() {
        return lotteryService.start();
    }

    @GetMapping("/winners")
    public List<ResultDto> winners() {
        return lotteryService.winners();
    }
}
