package com.example.sebackend.model;
/**
 * Created By ShaoCHi
 * Date 2021/11/18 7:10 下午
 * Tongji University
 */

import javax.persistence.*;
import java.util.Set;

/**
 * author ShaoCHi
 * Date 2021/11/18 7:10 下午
 * Tongji University
 */

@Entity
public class Hospital {
  @Id
  @Column(name = "ID")
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

  private Integer status;

  @OneToMany(mappedBy = "hospital",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
  Set<Department> departmentSet;

  @OneToMany(mappedBy = "hospital",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
  Set<Doctor> doctorSet;

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    Id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getNotice() {
    return notice;
  }

  public void setNotice(String notice) {
    this.notice = notice;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Set<Department> getDepartmentSet() {
    return departmentSet;
  }

  public void setDepartmentSet(Set<Department> departmentSet) {
    this.departmentSet = departmentSet;
  }

  public Set<Doctor> getDoctorSet() {
    return doctorSet;
  }

  public void setDoctorSet(Set<Doctor> doctorSet) {
    this.doctorSet = doctorSet;
  }
}
