package com.accenture.academy.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="ACADEMIC")
public class Academic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "academic" , cascade = CascadeType.ALL)
    Set<Enrolled> coursesEnrolled;

    public Academic() {
    }

    public Academic(String fName, String lName, int phone, String email, Date birthday, String resume, Date cDate, Date uDate) {
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.resume = resume;
        this.cDate = cDate;
        this.uDate = uDate;
    }

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
