package com.dh.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Richard on 03/06/2017.
 */
@Document
public class Teacher {

    @Id
    //@Transient //PREGUNTA DE ENTREVISTA: Sirve para ignorar la persistencia de una columna //Java's transient keyword is used to denote that a field is not to be serialized, whereas JPA's @Transient annotation is used to indicate that a field is not to be persisted in the database, i.e. their semantics are different
    private String id;
    private String name;
    private long ci;
    private String profession;

    public Teacher(){} //Swagger utiliza este constructor

    public Teacher(String id, String name, long ci, String profession){
        this.id = id;
        this.name = name;
        this.ci = ci;
        this.profession = profession;
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

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
