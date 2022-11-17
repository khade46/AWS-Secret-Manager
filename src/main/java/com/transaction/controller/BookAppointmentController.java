package com.transaction.controller;

import com.transaction.controller.dto.AppointmentForm;
import com.transaction.model.Appointment;
import com.transaction.service.BookAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookAppointmentController {
    @Autowired
    private BookAppointmentService bookAppointmentService;

    @PostMapping("/book")

    public ResponseEntity bookAppointment (@RequestBody AppointmentForm appointmentForm) {
        try{
            return ResponseEntity.ok(bookAppointmentService.bookAppointment(appointmentForm));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(e.getMessage());
        }

    }

}
