package com.example.sebackend.views;/**
 * Created By ShaoCHi
 * Date 2021/11/19 10:38 上午
 * Tongji University
 */

import com.example.sebackend.model.Schedule;
import lombok.Data;

import java.sql.*;

/**
 * author ShaoCHi
 * Date 2021/11/19 10:38 上午
 * Tongji University
 */

@Data
public class ScheduleInfo {
  private Integer availableNumber;

  private Integer reservedNumber;

  private Time startTime;

  private Time endTime;

  private Date date;

  public ScheduleInfo(Schedule schedule){
    this.availableNumber=schedule.getAvailableNumber();
    this.reservedNumber=schedule.getReservedNumber();
    this.startTime=schedule.getStartTime();
    this.endTime=schedule.getEndTime();
    this.date=schedule.getDate();
  }

}
