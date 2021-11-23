package com.example.sebackend.service;/**
 * Created By ShaoCHi
 * Date 2021/11/18 8:20 下午
 * Tongji University
 */

import com.example.sebackend.error.HospitalAlreadyJoinedError;
import com.example.sebackend.error.HospitalNotExistedError;
import com.example.sebackend.error.PatientNotExistedError;
import com.example.sebackend.model.*;
import com.example.sebackend.repository.HospitalRepository;
import com.example.sebackend.repository.PatientRepository;
import com.example.sebackend.request.Economy;
import com.example.sebackend.utils.Result;
import com.example.sebackend.views.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Optional;
import java.util.Set;

/**
 * author ShaoCHi
 * Date 2021/11/18 8:20 下午
 * Tongji University
 */

@Service
public class HospitalService {

  @Autowired
  private HospitalRepository hospitalRepository;

  @Autowired
  private PatientRepository patientRepository;

  public Result<HospitalInfo> getHospitalInfo(String id) {
    Optional<Hospital> hospitalOption=hospitalRepository.findById(id);
    if(!hospitalOption.isPresent()){
      return Result.wrapErrorResult(new HospitalNotExistedError());
    }
    if(hospitalOption.get().getStatus()==1)
      return Result.wrapErrorResult(new HospitalAlreadyJoinedError());
    HospitalInfo hospitalInfo=new HospitalInfo(hospitalOption.get());
    hospitalOption.get().setStatus(1);
    hospitalRepository.save(hospitalOption.get());
    Set<Department> departmentSet=hospitalOption.get().getDepartmentSet();
    /**
     * 将患者就诊卡信息加入返回内容
     */
    Set<Patient> patientSet=hospitalOption.get().getPatientSet();
    for(Patient patient:patientSet){
      hospitalInfo.getPatientInfoList().add(new PatientInfo(patient));
    }
    /**
     * 将科室与医生信息加入返回内容
     */
    for(Department department:departmentSet){
      hospitalInfo.getDepartmentWithDoctors().add(new DepartmentWithDoctors(department));
    }
    /**
     * 将医生与科室对应加入相应返回内容
     */
    Set<Doctor> doctorSet=hospitalOption.get().getDoctorSet();
    for(DepartmentWithDoctors departmentWithDoctors:hospitalInfo.getDepartmentWithDoctors()){
      for(Doctor doctor:doctorSet){
        if(doctor.getDepartment().getId()==departmentWithDoctors.getId()) {
          DoctorInfo doctorInfo=new DoctorInfo(doctor);
          Set<Schedule> scheduleSet=doctor.getScheduleSet();
          for(Schedule schedule:scheduleSet){
            doctorInfo.getScheduleInfoList().add(new ScheduleInfo(schedule));
          }
          departmentWithDoctors.getDoctorList().add(doctorInfo);
        }
      }
    }
    return Result.wrapSuccessfulResult(hospitalInfo);
  }

  public Result<String> updatePatient(Economy body) {
    Optional<Patient> patientOptional=patientRepository.findById(body.getId());
    if(!patientOptional.isPresent())
      return Result.wrapErrorResult(new PatientNotExistedError());
    if(patientOptional.get().getHospital().getId()!= hospitalRepository.findById(body.getHospitalId()).get().getId())
      return Result.wrapErrorResult(new PatientNotExistedError());
    patientOptional.get().setBalance(patientOptional.get().getBalance()-body.getEconomy());
    patientRepository.save(patientOptional.get());
    return Result.wrapSuccessfulResult("updateSuccess!");
  }

    public Result<HospitalInfo> updateHospitalInfo(String id) {
      Optional<Hospital> hospitalOption=hospitalRepository.findById(id);
      if(hospitalOption.get().getStatus()==0||!hospitalOption.isPresent()){
        return Result.wrapErrorResult(new HospitalNotExistedError());
      }
      HospitalInfo hospitalInfo=new HospitalInfo(hospitalOption.get());
      hospitalRepository.save(hospitalOption.get());
      Set<Department> departmentSet=hospitalOption.get().getDepartmentSet();
      /**
       * 将患者就诊卡信息加入返回内容
       */
      Set<Patient> patientSet=hospitalOption.get().getPatientSet();
      for(Patient patient:patientSet){
        hospitalInfo.getPatientInfoList().add(new PatientInfo(patient));
      }
      /**
       * 将科室与医生信息加入返回内容
       */
      for(Department department:departmentSet){
        hospitalInfo.getDepartmentWithDoctors().add(new DepartmentWithDoctors(department));
      }
      /**
       * 将医生与科室对应加入相应返回内容
       */
      Set<Doctor> doctorSet=hospitalOption.get().getDoctorSet();
      for(DepartmentWithDoctors departmentWithDoctors:hospitalInfo.getDepartmentWithDoctors()){
        for(Doctor doctor:doctorSet){
          if(doctor.getDepartment().getId()==departmentWithDoctors.getId()) {
            DoctorInfo doctorInfo=new DoctorInfo(doctor);
            Set<Schedule> scheduleSet=doctor.getScheduleSet();
            for(Schedule schedule:scheduleSet){
              doctorInfo.getScheduleInfoList().add(new ScheduleInfo(schedule));
            }
            departmentWithDoctors.getDoctorList().add(doctorInfo);
          }
        }
      }
      return Result.wrapSuccessfulResult(hospitalInfo);
    }
}
