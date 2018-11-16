package com.mith.tsoj.entity;

import javax.persistence.*;

@Entity
@Table(name = "Chanllenge")
public class ChanllengeEntity {
    private enum Catetigory{
        Pwn,Reverse,Crypto,Misc,Web;

    }

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @Enumerated(EnumType.STRING)
    private Catetigory catetigory;
    private String message;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catetigory getCatetigory() {
        return catetigory;
    }

    public void setCatetigory(Catetigory catetigory) {
        this.catetigory = catetigory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
