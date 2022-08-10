package com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.annotation.Generated;
import java.io.Serializable;

/**
 * Используем класс как контракт для валидации json"а
 * */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"lastName", "productName", "minTimes", "minExpenses", "maxExpenses", "badCustomers"})
@Generated("jsonschema2pojo")
public class Criteria implements Serializable {

    private final static long serialVersionUID = -3496711984289681000L;
    @JsonProperty("lastName")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    public String lastName;
    @JsonProperty("productName")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    public String productName;
    @JsonProperty("minTimes")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    public long minTimes;
    @JsonProperty("minExpenses")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    public float minExpenses;
    @JsonProperty("maxExpenses")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    public float maxExpenses;
    @JsonProperty("badCustomers")
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    public int badCustomers;
}
