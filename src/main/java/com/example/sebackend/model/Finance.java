package com.example.sebackend.model;/**
 * Created By ShaoCHi
 * Date 2021/11/18 7:43 下午
 * Tongji University
 */

import javax.persistence.*;

/**
 * author ShaoCHi
 * Date 2021/11/18 7:43 下午
 * Tongji University
 */

@Entity
public class Finance {
  @Id
  @Column(name = "hospital_ID")
  private String hospitalId;

  private Integer economy;

  public String getHospitalId() {
    return hospitalId;
  }

  public void setHospitalId(String hospitalId) {
    this.hospitalId = hospitalId;
  }

  public Integer getEconomy() {
    return economy;
  }

  public void setEconomy(Integer economy) {
    this.economy = economy;
  }
}
