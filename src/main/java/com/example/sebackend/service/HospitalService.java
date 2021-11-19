package com.example.sebackend.service;/**
 * Created By ShaoCHi
 * Date 2021/11/18 8:20 下午
 * Tongji University
 */

import com.example.sebackend.error.HospitalAlreadyJoinedError;
import com.example.sebackend.error.HospitalNotExistedError;
import com.example.sebackend.model.*;
import com.example.sebackend.repository.HospitalRepository;
import com.example.sebackend.utils.Result;
import com.example.sebackend.views.DepartmentWithDoctors;
import com.example.sebackend.views.DoctorInfo;
import com.example.sebackend.views.HospitalInfo;
import com.example.sebackend.views.ScheduleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
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
