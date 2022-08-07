package com.github.thecoolersuptelov.aikamsoftjavajunior.Services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.thecoolersuptelov.aikamsoftjavajunior.DAO.CustomerRepository;
import com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Input.SearchInput;
import com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Output.SearchOutput;
import com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Output.SearchOutputResultRows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class Search implements CliActions<SearchInput, SearchOutput> {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void doStuff(String inputPath, String outputPath) throws IOException {
        serilizeOutputData(outputPath, prepareAnswer(deserializeInputValue(inputPath)));
    }

    @Override
    public SearchOutput prepareAnswer(SearchInput inputDeserializeData) {
        var searchOutput = new SearchOutput();

        for (int i = 0; i < inputDeserializeData.criterias.size(); i++) {
            var curCriteria = inputDeserializeData.criterias.get(i);
            if (!curCriteria.lastName.isEmpty()) {
                searchOutput.getResults().add(new SearchOutputResultRows(curCriteria, customerRepository.findByLastNameEquals(curCriteria.lastName)));
            }
        }
        return searchOutput;
    }

    @Override
    public SearchInput deserializeInputValue(String inputPath) throws IOException {

        return new ObjectMapper().readValue(Files.readString(Path.of(inputPath)), SearchInput.class);
    }

    @Override
    public void serilizeOutputData(String outputPath, SearchOutput dataToSerialize) {

    }
}
