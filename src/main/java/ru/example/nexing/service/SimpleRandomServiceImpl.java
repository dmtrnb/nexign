package ru.example.nexing.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class SimpleRandomServiceImpl implements RandomService {

    @Override
    public long getWinning(long min, long max) {
        return ThreadLocalRandom.current().nextLong(min, max + 1);
    }
}
