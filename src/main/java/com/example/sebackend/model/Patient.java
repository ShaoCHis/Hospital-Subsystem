package com.example.sebackend.model;/**
 * Created By ShaoCHi
 * Date 2021/11/20 4:54 下午
 * Tongji University
 */

import javax.persistence.*;
import java.sql.Date;

/**
 * author ShaoCHi
 * Date 2021/11/20 4:54 下午
 * Tongji University
 */

@Entity
public class Patient {
  @Id
  private String id;

  @Column(name = "card_id")
  private String cardId;

  private String name;

  @Column(name = "phone_number")
  private String phoneNumber;

  private String sex;

  private Date birthday;

  private Integer balance;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
}
