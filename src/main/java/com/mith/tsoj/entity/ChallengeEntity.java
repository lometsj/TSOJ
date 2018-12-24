package com.mith.tsoj.entity;

import javax.persistence.*;

@Entity
@Table(name = "Challenge")
public class ChallengeEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String category;
    private String filepath;
    private int point;
    private String flag;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

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
        return category;
    }

    public void setCatetigory(String catetigory) {
        this.category = catetigory;
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
