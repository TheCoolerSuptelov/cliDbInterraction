package com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Output;

import java.util.ArrayList;
import java.util.List;

public class SearchOutput {
    private final String type = "Search";
    private List<SearchOutputResultRows> results = new ArrayList<>();

    public String getType() {
        return type;
    }

    public List<SearchOutputResultRows> getResults() {
        return results;
    }

    public void setResults(List<SearchOutputResultRows> results) {
        this.results = results;
    }
}
