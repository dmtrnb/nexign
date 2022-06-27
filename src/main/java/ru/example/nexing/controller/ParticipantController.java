package ru.example.nexing.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.nexing.domain.dto.ParticipantDto;
import ru.example.nexing.service.ParticipantService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lottery/participant")
public class ParticipantController {

    private final ParticipantService participantService;

    @PostMapping
    public ParticipantDto add(ParticipantDto participantDto) {
        return participantService.add(participantDto);
    }

    @GetMapping
    public List<ParticipantDto> findAll() {
        return participantService.findAll();
    }
}
