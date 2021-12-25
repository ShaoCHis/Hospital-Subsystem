package com.example.sebackend.controller;/**
 * Created By ShaoCHi
 * Date 2021/12/24 9:35 PM
 * Tongji University
 */

import com.example.sebackend.model.Patient;
import com.example.sebackend.repository.PatientRepository;
import com.example.sebackend.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * author ShaoCHi
 * Date 2021/12/24 9:35 PM
 * Tongji University
 */

@RestController
@RequestMapping(path = "/api/patients")
public class PatientController {
  @Autowired
  PatientRepository patientRepository;

  @GetMapping(path = "/{id}")
  public Result<Integer> getPatient(@PathVariable String id){
    System.out.println("dada");
    Optional<Patient> patient=patientRepository.findById(id);
    if(!patient.isPresent()){
      return Result.wrapErrorResult("Patient doesn't exist");
    }
    return Result.wrapSuccessfulResult(patient.get().getBalance());
  }
}
