package com.github.thecoolersuptelov.aikamsoftjavajunior.DAO;

import com.github.thecoolersuptelov.aikamsoftjavajunior.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastNameEquals(String lastName);
}