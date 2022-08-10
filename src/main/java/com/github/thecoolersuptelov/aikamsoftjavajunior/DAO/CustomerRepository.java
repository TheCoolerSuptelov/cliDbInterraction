package com.github.thecoolersuptelov.aikamsoftjavajunior.DAO;

import com.github.thecoolersuptelov.aikamsoftjavajunior.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastNameEquals(String lastName);

    @Query(nativeQuery = true,
            value = "select customer.* from customer " +
                    "inner join Receipt as rec on rec.customer_id = customer.id " +
                    "inner join product as product on rec.product_id = product.id where product.product_name = ?1 " +
                    "group by customer.id, customer.first_name, customer.last_name having count(rec.id) > ?2")
    List<Customer> findByProductProductNameEqualsAndIdGreaterThan(String productName, Long id);


    @Query(nativeQuery = true, value = "select customer.* from customer inner join receipt as rec on rec.customer_id = customer.id " +
            "group by customer.id, customer.first_name, customer.last_name having sum(amount) between ?1 AND ?2")
    List<Customer> findCustomersWithExpensesInRange(Float min, Float max);

    @Query(nativeQuery = true, value = "select customer.* from customer inner join receipt as rec on rec.customer_id = customer.id " +
            "group by customer.id, customer.first_name, customer.last_name order by sum(amount) ASC limit ?1")
    List<Customer> findBadCustomers(Integer limit);

}