package com.mith.tsoj.entity;

import javax.persistence.*;

@Entity
@Table(name = "Chanllenge")
public class ChanllengeEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String catetigory;
    private String filepath;
    private int point;

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCatetigory() {
        return catetigory;
    }

    public void setCatetigory(String catetigory) {
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
