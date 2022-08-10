package com.github.thecoolersuptelov.aikamsoftjavajunior.DAO;

import com.github.thecoolersuptelov.aikamsoftjavajunior.Entities.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {

}