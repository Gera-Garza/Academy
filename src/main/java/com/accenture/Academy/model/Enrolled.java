package com.accenture.academy.model;

import javax.persistence.*;

@Entity
public class Enrolled {
    @Id
    int id;

    @ManyToOne
    @JoinColumn(name = "academic_id")
    Academic academic;


    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;

    double timeDedicated;
    String status;

    public Enrolled(int id, Academic academic, Course course, double timeDedicated, String status) {
        this.id = id;
        this.academic = academic;
        this.course = course;
        this.timeDedicated = timeDedicated;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Academic getAcademic() {
        return academic;
    }

    public void setAcademic(Academic academic) {
        this.academic = academic;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getTimeDedicated() {
        return timeDedicated;
    }

    public void setTimeDedicated(double timeDedicated) {
        this.timeDedicated = timeDedicated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
