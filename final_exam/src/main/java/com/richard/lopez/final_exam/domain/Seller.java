package com.richard.lopez.final_exam.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rlopez on 21-06-17.
 */
@Document
public class Seller {

    @Id
    private String id;
    private String name;
    private long age;
    private long ci;
    private long num_cars_sold;

    public Seller() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public long getNum_cars_sold() {
        return num_cars_sold;
    }

    public void setNum_cars_sold(long num_cars_sold) {
        this.num_cars_sold = num_cars_sold;
    }
}
