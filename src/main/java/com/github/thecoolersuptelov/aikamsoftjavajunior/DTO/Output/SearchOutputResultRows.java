package com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Output;

import com.github.thecoolersuptelov.aikamsoftjavajunior.DTO.Input.Criteria;
import com.github.thecoolersuptelov.aikamsoftjavajunior.Entities.Customer;

import java.util.List;

public class SearchOutputResultRows {
    private Criteria criteria;
    private List<Customer> customerList;

    public SearchOutputResultRows(Criteria criteria, List<Customer> customerList) {
        this.criteria = criteria;
        this.customerList = customerList;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
