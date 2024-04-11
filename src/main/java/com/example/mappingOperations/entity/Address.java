package com.example.mappingOperations.entity;

import javax.persistence.*;

@Entity
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String cityname;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "sid")//(, referencedColumnName = "sid")
    private StudentData studentData;

    public Address()
    { }

    public Address( int id, String cityname,StudentData studentData)
    {
        this.id = id;
        this.cityname = cityname;
        this.studentData = studentData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public StudentData getStudentData() {
        return studentData;
    }

    public void setStudentData(StudentData studentData)
    {
        this.studentData = studentData;
    }
}


