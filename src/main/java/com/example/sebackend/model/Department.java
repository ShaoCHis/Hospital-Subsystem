package com.example.sebackend.model;/**
 * Created By ShaoCHi
 * Date 2021/11/18 7:16 下午
 * Tongji University
 */

import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;

import javax.persistence.*;
import java.util.Set;

/**
 * author ShaoCHi
 * Date 2021/11/18 7:16 下午
 * Tongji University
 */

@Entity
public class Department {

  @Id
  @Column(name = "ID")
  private String Id;

  private String name;

  private String introduction;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "hospital_Id")
  private Hospital hospital;

  @OneToMany(mappedBy = "department",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
  private Set<Doctor> doctorSet;

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

  public Hospital getHospital() {
    return hospital;
  }

  public void setHospital(Hospital hospital) {
    this.hospital = hospital;
  }

  public Set<Doctor> getDoctorSet() {
    return doctorSet;
  }

  public void setDoctorSet(Set<Doctor> doctorSet) {
    this.doctorSet = doctorSet;
  }
}
