package com.github.thecoolersuptelov.aikamsoftjavajunior.Services;

import org.springframework.stereotype.Service;

@Service
public class Search implements CliActions{
    @Override
    public void prepareAnswer(String inputPath, String outputPath) {
        System.out.println("Search working");
    }
}
