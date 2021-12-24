package com.example.sebackend.views;/**
 * Created By ShaoCHi
 * Date 2021/12/24 9:09 PM
 * Tongji University
 */

import lombok.Data;

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

  private Integer number;

  private Date reserveDate;

  private Date reserveTime;

  private String patientId;

  private String patientName;

  private String hospitalId;
}
