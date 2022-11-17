package com.transaction.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.transaction.controller.dto.AppointmentForm;
import com.transaction.model.Appointment;
import com.transaction.model.Patient;
import com.transaction.repository.AppointmentRepo;
import com.transaction.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
@Service
public class BookAppointmentService {
    @Autowired
    private AppointmentRepo appointmentRepo;

    @Autowired
    private PatientRepo patientRepo;

    public String bookAppointment(AppointmentForm appointmentForm) throws Exception{
        if(appointmentForm.getName()==null){
            throw new Exception("Enter your name");
        } else if (appointmentForm.getGender()==null) {
            throw new Exception("Enter your gender");
        }else if(appointmentForm.getAge()==0){
            throw new Exception("Enter your age");
        }else if(appointmentForm.getMobile()==null){
            throw new Exception("Enter your mobile no.");
        }
        else{
            Patient patient = new ObjectMapper().convertValue(appointmentForm, Patient.class);

            Long patientNumber = patientRepo.save(patient).getPatientNumber();

            System.out.println("patient saved successfully");

            Appointment appointment = new Appointment(new Date(System.currentTimeMillis()), 101L, patientNumber);

            Long appointmentNumber = appointmentRepo.save(appointment).getAppointmentNumber();

            return "Appointment Confirmed."+appointmentNumber;
        }

    }
    /*public String bookAppointment1(Appointment appointment){
        appointmentRepo.save(appointment);
        Long appointmentNumber = appointment.getAppointmentNumber();
        return "Appointment Confirmed. "+appointmentNumber;
    }*/

}
