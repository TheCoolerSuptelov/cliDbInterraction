package com.github.thecoolersuptelov.aikamsoftjavajunior.DAO;

import com.github.thecoolersuptelov.aikamsoftjavajunior.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}