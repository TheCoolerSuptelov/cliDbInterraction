package com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Input;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"criterias"})
@Generated("jsonschema2pojo")
public class SearchInput implements Serializable {

    private final static long serialVersionUID = 7137462991151256464L;
    @JsonProperty("criterias")
    public List<Criteria> criterias = null;
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