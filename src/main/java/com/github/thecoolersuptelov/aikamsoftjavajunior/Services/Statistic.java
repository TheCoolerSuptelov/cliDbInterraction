package com.github.thecoolersuptelov.aikamsoftjavajunior.Services;

import com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Input.StatsInput;
import com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Output.StatsOutput;
import org.springframework.stereotype.Service;

@Service
public class Statistic implements CliActions<StatsInput, StatsOutput> {

    @Override
    public void doStuff(String inputPath, String outputPath) {
        serilizeOutputData(outputPath, prepareAnswer(deserializeInputValue(inputPath)));
    }

    @Override
    public StatsOutput prepareAnswer(StatsInput inputDeserializeData) {
        return null;
    }

    @Override
    public StatsInput deserializeInputValue(String inputPath) {
        return null;
    }

    @Override
    public void serilizeOutputData(String outputPath, StatsOutput dataToSerialize) {

    }
}
