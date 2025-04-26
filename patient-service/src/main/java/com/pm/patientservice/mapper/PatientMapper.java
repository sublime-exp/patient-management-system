package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {
        return new PatientResponseDTO()
                .setId(patient.getId().toString())
                .setAddress(patient.getAddress())
                .setName(patient.getName())
                .setDateOfBirth(patient.getDateOfBirth().toString())
                .setEmail(patient.getEmail());
    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
        return new Patient()
                .setName(patientRequestDTO.getName())
                .setAddress(patientRequestDTO.getAddress())
                .setEmail(patientRequestDTO.getEmail())
                .setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()))
                .setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
    }
}
