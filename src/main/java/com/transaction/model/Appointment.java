package com.transaction.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appointmentNumber;
    private Date date;
    private Long doctorNumber;
    private Long patientNumber;

    public Appointment() {
        super();
    }

    public Appointment(Date date, Long doctorNumber, Long patientNumber) {
        this.date = date;
        this.doctorNumber = doctorNumber;
        this.patientNumber = patientNumber;
    }

    public Long getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(Long appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getDoctorNumber() {
        return doctorNumber;
    }

    public void setDoctorNumber(Long doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    public Long getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(Long patientNumber) {
        this.patientNumber = patientNumber;
    }
}
