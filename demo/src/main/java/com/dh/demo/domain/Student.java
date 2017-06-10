package com.dh.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Richard on 10/06/2017.
 */
@Document
public class Student {

    @Id
    private String id;
    private String name;
    private Long ci;
    private Long codsis;

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

    public Long getCi() {
        return ci;
    }

    public void setCi(Long ci) {
        this.ci = ci;
    }

    public Long getCodsis() {
        return codsis;
    }

    public void setCodsis(Long codsis) {
        this.codsis = codsis;
    }
}
