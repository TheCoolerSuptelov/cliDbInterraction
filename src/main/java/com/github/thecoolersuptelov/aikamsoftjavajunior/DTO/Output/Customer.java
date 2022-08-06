package com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Output;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name", "purchases", "totalExpenses"})
@Generated("jsonschema2pojo")
public class Customer implements Serializable {

    private final static long serialVersionUID = 3136332436861305455L;
    @JsonProperty("name")
    public String name;
    @JsonProperty("purchases")
    public List<Purchase> purchases = null;
    @JsonProperty("totalExpenses")
    public int totalExpenses;
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
