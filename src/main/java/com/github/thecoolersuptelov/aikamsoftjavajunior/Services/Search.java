package com.github.thecoolersuptelov.aikamsoftjavajunior.Services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.thecoolersuptelov.aikamsoftjavajunior.DAO.CustomerRepository;
import com.github.thecoolersuptelov.aikamsoftjavajunior.DAO.ProductRepository;
import com.github.thecoolersuptelov.aikamsoftjavajunior.DAO.ReceiptRepository;
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

    @Autowired
    private ReceiptRepository receiptRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void doStuff(String inputPath, String outputPath) throws IOException {
        serilizeOutputData(outputPath, prepareAnswer(deserializeInputValue(inputPath)));
    }

    @Override
    public SearchOutput prepareAnswer(SearchInput inputDeserializeData) {
        var searchOutput = new SearchOutput();

        for (int i = 0; i < inputDeserializeData.criterias.size(); i++) {
            var curCriteria = inputDeserializeData.criterias.get(i);
            if (curCriteria.lastName != null && !curCriteria.lastName.isEmpty()) {
                searchOutput.getResults().add(new SearchOutputResultRows(curCriteria, customerRepository.findByLastNameEquals(curCriteria.lastName)));
            }

            if ((curCriteria.productName != null && !curCriteria.productName.isEmpty()) && curCriteria.minTimes > 0) {
               searchOutput.getResults().add(new SearchOutputResultRows(curCriteria, customerRepository.findByProduct_ProductNameEqualsAndIdGreaterThan(curCriteria.productName, curCriteria.minTimes)));
            }
            if ((curCriteria.productName != null && !curCriteria.productName.isEmpty()) && curCriteria.minTimes > 0) {
                searchOutput.getResults().add(new SearchOutputResultRows(curCriteria, customerRepository.findByProduct_ProductNameEqualsAndIdGreaterThan(curCriteria.productName, curCriteria.minTimes)));
            }

            if(curCriteria.maxExpenses > 0){
                searchOutput.getResults().add(new SearchOutputResultRows(curCriteria, customerRepository.findCustomersWithExpensesInRange(curCriteria.minExpenses, curCriteria.maxExpenses)));
            }
            if(curCriteria.badCustomers > 0){
                searchOutput.getResults().add(new SearchOutputResultRows(curCriteria, customerRepository.findBadCustomers(curCriteria.badCustomers)));
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
        // TODO document why this method is empty
    }
}
