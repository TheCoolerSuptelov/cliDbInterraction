package com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "expenses"
})
@Generated("jsonschema2pojo")
public class Purchase implements Serializable {

    private final static long serialVersionUID = 8312196504942393280L;
    @JsonProperty("name")
    public String name;
    @JsonProperty("expenses")
    public int expenses;


}