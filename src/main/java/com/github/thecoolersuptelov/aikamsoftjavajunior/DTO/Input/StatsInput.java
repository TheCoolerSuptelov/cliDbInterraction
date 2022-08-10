package com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Input;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"startDate", "endDate"})
@Generated("jsonschema2pojo")
public class StatsInput implements Serializable {

    @JsonProperty("startDate")
    public String startDate;
    @JsonProperty("endDate")
    public String endDate;

}