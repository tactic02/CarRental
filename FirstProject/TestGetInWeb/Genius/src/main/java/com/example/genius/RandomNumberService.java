package com.example.genius;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomNumberService {
    private final Random random = new Random();

    int generateNumberInRange(int from, int to){
        int range = to - from + 1;
        int randomNumber = random.nextInt(range);
        return from + randomNumber;
    }
}
