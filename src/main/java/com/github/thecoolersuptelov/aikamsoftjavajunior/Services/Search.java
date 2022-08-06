package com.github.thecoolersuptelov.aikamsoftjavajunior.Services;

import com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Input.SearchInput;
import com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Output.SearchOutput;
import org.springframework.stereotype.Service;

@Service
public class Search implements CliActions<SearchInput, SearchOutput> {

    @Override
    public void doStuff(String inputPath, String outputPath) {
        serilizeOutputData(outputPath, prepareAnswer(deserializeInputValue(inputPath)));
    }

    @Override
    public SearchOutput prepareAnswer(SearchInput inputDeserializeData) {
        return null;
    }

    @Override
    public SearchInput deserializeInputValue(String inputPath) {
        return null;
    }

    @Override
    public void serilizeOutputData(String outputPath, SearchOutput dataToSerialize) {

    }
}
