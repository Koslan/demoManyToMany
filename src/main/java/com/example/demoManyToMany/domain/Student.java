package com.example.demoManyToMany.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class Student
{
    @Id
    @Column(name = "student_id")
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name="student_university",
            joinColumns=@JoinColumn(name="student_id"),
            inverseJoinColumns=@JoinColumn(name="university_id"))
    private List<University> universities;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<University> getUniversities() {
        return universities;
    }

    public void setUniversities(List<University> universities) {
        this.universities = universities;
    }
}