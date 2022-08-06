package com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Output;

import com.fasterxml.jackson.annotation.*;
import com.github.thecoolersuptelov.aikamsoftjavajunior.Entities.Customer;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "totalDays",
        "customers",
        "totalExpenses",
        "avgExpenses"
})
@Generated("jsonschema2pojo")
public class StatsOutput implements Serializable {

    private final static long serialVersionUID = -7984867636108599233L;
    @JsonProperty("type")
    public String type;
    @JsonProperty("totalDays")
    public int totalDays;
    @JsonProperty("customers")
    public List<Customer> customers = null;
    @JsonProperty("totalExpenses")
    public int totalExpenses;
    @JsonProperty("avgExpenses")
    public double avgExpenses;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}