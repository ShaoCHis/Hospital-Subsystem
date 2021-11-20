package com.example.sebackend.views;
/**
 * Created By ShaoCHi
 * Date 2021/11/20 4:51 下午
 * Tongji University
 */

import com.example.sebackend.model.Patient;
import lombok.Data;

import java.sql.Date;

/**
 * author ShaoCHi
 * Date 2021/11/20 4:51 下午
 * Tongji University
 */

@Data
public class PatientInfo {
  private String patientId;

  private String cardId;

  private String name;

  private String phoneNumber;

  private String sex;

  private Date birthday;

  private Integer type;

  private Integer balance;

  public PatientInfo(Patient patient){
    this.type=0;
    this.patientId=patient.getPatientId();
    this.cardId=patient.getCardId();
    this.name=patient.getName();
    this.phoneNumber=patient.getPhoneNumber();
    this.sex=patient.getSex();
    this.birthday=patient.getBirthday();
    this.balance=patient.getBalance();
  }
}
