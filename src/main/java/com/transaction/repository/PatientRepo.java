package com.transaction.repository;

import com.transaction.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
}
