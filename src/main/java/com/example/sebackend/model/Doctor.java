package com.example.sebackend.model;
/**
 * Created By ShaoCHi
 * Date 2021/11/18 7:31 下午
 * Tongji University
 */

import javax.persistence.*;

/**
 * author ShaoCHi
 * Date 2021/11/18 7:31 下午
 * Tongji University
 */

@Entity
public class Doctor {
  @Id
  @Column(name = "ID")
  private String Id;

  private String name;

  private String introduction;

  private Integer age;

  private String title;

  private Integer cost;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "hospital")
  private Hospital hospital;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "department")
  private Department department;

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    Id = id;
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

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getCost() {
    return cost;
  }

  public void setCost(Integer cost) {
    this.cost = cost;
  }

  public Hospital getHospital() {
    return hospital;
  }

  public void setHospital(Hospital hospital) {
    this.hospital = hospital;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }
}
