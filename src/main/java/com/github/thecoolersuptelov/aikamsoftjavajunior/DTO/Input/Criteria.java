package com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"lastName", "productName", "minTimes", "minExpenses", "maxExpenses", "badCustomers"})
@Generated("jsonschema2pojo")
public class Criteria implements Serializable {

    private final static long serialVersionUID = -3496711984289681000L;
    @JsonProperty("lastName")
    public String lastName;
    @JsonProperty("productName")
    public String productName;
    @JsonProperty("minTimes")
    public int minTimes;
    @JsonProperty("minExpenses")
    public int minExpenses;
    @JsonProperty("maxExpenses")
    public int maxExpenses;
    @JsonProperty("badCustomers")
    public int badCustomers;
}
