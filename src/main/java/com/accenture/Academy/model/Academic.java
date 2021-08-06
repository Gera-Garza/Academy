package com.accenture.academy.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="academic")
public class Academic {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "first_name")
    private String fName;
    @Column(name="last_name")
    private String lName;
    private int phone;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date birthday;
    private String resume;
    @Temporal(TemporalType.DATE)
    @Column(name="created_date")
    private Date cDate; //create date
    @Temporal(TemporalType.DATE)
    @Column(name="update_date")
    private Date uDate; //update date

    @OneToMany
    Course course;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public Date getuDate() {
        return uDate;
    }

    public void setuDate(Date uDate) {
        this.uDate = uDate;
    }
}
