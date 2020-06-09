package com.bigdata.blog.model;

import javax.persistence.*;

@Entity
@Table(name= "interest")
public class Interest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
