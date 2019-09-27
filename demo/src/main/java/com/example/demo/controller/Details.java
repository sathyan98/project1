package com.example.demo.controller;
import com.example.demo.model.Patient;
import com.example.demo.repository.Patientrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController

public class Details<patient1>
{
    @Autowired
    private  Patientrepository patientrepository;

    @PostMapping("/post")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
        patient.setId(patient.getId());
        patient.setFirst_name(patient.getFirst_name());
        patient.setLast_name(patient.getLast_name());
        patient.setRegion(patient.getRegion());
        patient.setNo_of_children(patient.getNo_of_children());
        patient.setNo_of_pregnancy(patient.getNo_of_pregnancy());
        patient.setAge_at_pregnancy(patient.getAge_at_pregnancy());
        patient.setPregnance(patient.isPregnance());
        patient.setNumber_of_children(patient.getNumber_of_children());
        patient.setLast_menstrual_period(patient.getLast_menstrual_period());
        patient.setBirth_control(patient.isBirth_control());
        patient.setLong_birth_control(patient.getLong_birth_control());
        patient.setOther_harmones_replacement(patient.isOther_harmones_replacement());
        patient.setPrevious_breat_surgery(patient.isPrevious_breat_surgery());
        patient.setBreast(patient.isBreast());
        patient.setPrevious_breast_radiation(patient.isPrevious_breast_radiation());
        patient.setWhich_breast(patient.isWhich_breast());
        patient.setPre_Chemo(patient.isPre_Chemo());
        patient.setCondition(patient.getCondition());
        patient.setRoutine_checkup(patient.isRoutine_checkup());
        patient.setPresent_breast_complaint(patient.getPresent_breast_complaint());
        patient.setSkin_dimpling(patient.isSkin_dimpling());
        patient.setNipple_retraction(patient.isNipple_retraction());
        patient.setDischarge(patient.isDischarge());
        patient.setColor(patient.getColor());
        patient.setHistory(patient.getHistory());
        patient.setMother(patient.isMother());
        patient.setDaughter(patient.isDaughter());
        patient.setSister(patient.isSister());
        patient.setFathers_side(patient.isFathers_side());
        patient.setMothers_side(patient.isMothers_side());
        patient.setGrand_mother(patient.isGrand_mother());
        patient.setAunts(patient.isAunts());
        final Patient patient1 = patientrepository.save(patient);
        return ResponseEntity.ok(patient);
    }
}
