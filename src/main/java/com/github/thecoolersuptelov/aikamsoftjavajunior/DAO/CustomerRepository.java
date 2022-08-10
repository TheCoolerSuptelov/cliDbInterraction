package com.github.thecoolersuptelov.aikamsoftjavajunior.DAO;

import com.github.thecoolersuptelov.aikamsoftjavajunior.Entities.Customer;
import com.github.thecoolersuptelov.aikamsoftjavajunior.Entities.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.lang.annotation.Native;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastNameEquals(String lastName);

    @Query(nativeQuery = true,
    value = "select customer.* from customer " +
            "inner join Receipt as rec on rec.customer_id = customer.id " +
            "inner join product as product on rec.product_id = product.id where product.product_name = ?1 " +
            "group by customer.id, customer.first_name, customer.last_name having count(rec.id) > ?2")
    List<Customer> findByProduct_ProductNameEqualsAndIdGreaterThan(String productName, Long id);

/*"select c from Receipt r inner join customer as c on c.id = r.customer_id" +
        " where r.product.productName = ?1 group by c.id having count(r.id) > ?2"*/
}