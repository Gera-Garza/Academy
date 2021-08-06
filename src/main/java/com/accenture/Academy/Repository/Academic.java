package com.accenture.Academy.Repository;

import java.util.Date;

public class Academic {

    int id_academic;
    String name;
    String lastName;
    int phone;
    String email;
    Date birthdate;
    String resume;
    Date createdDate;
    Date UpdateDate;

    public Academic() {
    }

    public Academic(String name, String last_name, int phone, String email, Date birthdate, String resume, Date createdDate, Date updateDate) {
        this.name = name;
        this.lastName = last_name;
        this.phone = phone;
        this.email = email;
        this.birthdate = birthdate;
        this.resume = resume;
        this.createdDate = createdDate;
        this.UpdateDate = updateDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(Date updateDate) {
        UpdateDate = updateDate;
    }
}
