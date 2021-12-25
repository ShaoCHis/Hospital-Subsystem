package com.example.sebackend.views;/**
 * Created By ShaoCHi
 * Date 2021/12/24 9:09 PM
 * Tongji University
 */

import lombok.Data;

import java.sql.Time;
import java.util.Date;

/**
 * author ShaoCHi
 * Date 2021/12/24 9:09 PM
 * Tongji University
 */
@Data
public class Reservations {
  private String departmentName;

  private String doctorName;

  private String number;

  private Date reserveDate;

  private Time reserveTime;

  private String patientId;

  private String patientName;

  private String hospitalId;
}
