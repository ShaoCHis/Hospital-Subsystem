package com.example.sebackend.views;
/**
 * Created By ShaoCHi
 * Date 2021/11/18 7:52 下午
 * Tongji University
 */

import com.example.sebackend.model.Department;
import com.example.sebackend.model.Hospital;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * author ShaoCHi
 * Date 2021/11/18 7:52 下午
 * Tongji University
 */


@Data
public class HospitalInfo {
  private String Id;

  private String password;

  private String code;

  private String name;

  private String introduction;

  private String image;

  private String url;

  private Integer level;

  private String location;

  private String notice;

  private List<DepartmentWithDoctors> departmentWithDoctors;

  private Integer status;

  public HospitalInfo(Hospital hospital){
    this.Id=hospital.getId();
    this.password=hospital.getPassword();
    this.code=hospital.getCode();
    this.name=hospital.getName();
    this.introduction=hospital.getIntroduction();
    this.image=hospital.getImage();
    this.url=hospital.getUrl();
    this.level=hospital.getLevel();
    this.location=hospital.getLocation();
    this.notice=hospital.getNotice();
    this.status=1;
    this.departmentWithDoctors=new LinkedList<>();
  }
}
