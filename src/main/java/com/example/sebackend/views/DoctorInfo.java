package com.example.sebackend.views;/**
 * Created By ShaoCHi
 * Date 2021/11/18 7:55 下午
 * Tongji University
 */

import com.example.sebackend.model.Doctor;
import lombok.Data;

/**
 * author ShaoCHi
 * Date 2021/11/18 7:55 下午
 * Tongji University
 */

@Data
public class DoctorInfo {
  private String Id;

  private String name;

  private String introduction;

  private Integer age;

  private String title;

  private Integer cost;

  public DoctorInfo(Doctor doctor){
    this.introduction=doctor.getIntroduction();
    this.Id=doctor.getId();
    this.age=doctor.getAge();
    this.cost=doctor.getAge();
    this.title=doctor.getTitle();
    this.name=doctor.getName();
  }
}
