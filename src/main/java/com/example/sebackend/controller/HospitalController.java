package com.example.sebackend.controller;/**
 * Created By ShaoCHi
 * Date 2021/11/18 7:59 下午
 * Tongji University
 */

import com.example.sebackend.request.Economy;
import com.example.sebackend.service.HospitalService;
import com.example.sebackend.utils.Result;
import com.example.sebackend.views.HospitalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * author ShaoCHi
 * Date 2021/11/18 7:59 下午
 * Tongji University
 */

@RestController
@RequestMapping(path = "/api/hospitals")
public class HospitalController {

  @Autowired
  private HospitalService hospitalService;

  @GetMapping(path = "/{id}")
  public @ResponseBody
  Result<HospitalInfo> getHospitalInfo (@PathVariable String id) {
    return  hospitalService.getHospitalInfo(id);
  }

  @GetMapping(path = "/updateInfo/{id}")
  Result<HospitalInfo> updateHospitalInfo(@PathVariable String id){
    return hospitalService.updateHospitalInfo(id);
  }

  @PostMapping(path="/updatePatient")
  public
  Result<String> updatePatient(@RequestBody Economy body){
    return hospitalService.updatePatient(body);
  }
}
