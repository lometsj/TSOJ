package com.mith.tsoj.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Date register_date;
    private String user_name;
    private String password;
    


}
