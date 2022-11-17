package com.transaction.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long patientNumber;
    private String name;
    private String gender;
    private String mobile;
    private int age;

    public Patient() {
        super();
    }

    public Patient(Long patientNumber, String name, String gender, String mobile, int age) {
        this.patientNumber = patientNumber;
        this.name = name;
        this.gender = gender;
        this.mobile = mobile;
        this.age = age;
    }

    public Long getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(Long patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
