package com.accenture.academy.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Academic {
    @Id
    @GeneratedValue
    private Long id;
    private String fName;
    private String lName;
    private int phone;
    private String email;
    private Date birthday;
    private String resume;
    private Date cDate; //create date
    private Date uDate; //update date
}
