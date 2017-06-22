package com.richard.lopez.final_exam.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by rlopez on 21-06-17.
 */
@Document
public class RegistryCarSold {

    @Id
    private String id;
    @DBRef
    private Seller seller;
    @DBRef
    private Car car;
    @DBRef
    private Buyer buyer;

    private Date dateOfSell;

    public RegistryCarSold() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateOfSell() {
        return dateOfSell;
    }

    public void setDateOfSell(Date dateOfSell) {
        this.dateOfSell = dateOfSell;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}
