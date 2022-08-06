package com.github.thecoolersuptelov.aikamsoftjavajunior.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Receipt {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "amount")
    private Float amount;

    @Column(name = "price")
    private Float price;

    @Column(name = "quantity")
    private Float quantity;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "transaction_date")
    private Date transactionDate;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "product_id")
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
