package com.example.mappingOperations.entity;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name="StudentData")
public class StudentData
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    private String name;
    private String email;
    private String gender;

    @OneToMany(cascade = CascadeType.ALL)//(cascade = CascadeType.ALL)mappedBy = "id of another table"
    @JoinColumn(name = "sid")
    private List<Address> address;

    public StudentData()
    { }

    public StudentData(String name, String email, String gender, List<Address> address) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public int getsid() {
        return sid;
    }

    public void setsid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
