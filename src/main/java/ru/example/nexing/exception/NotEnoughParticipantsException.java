package ru.example.nexing.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NotEnoughParticipantsException extends RuntimeException {

    public NotEnoughParticipantsException(String message) {
        super(message);
    }
}
