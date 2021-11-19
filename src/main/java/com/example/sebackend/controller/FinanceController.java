package com.example.sebackend.controller;/**
 * Created By ShaoCHi
 * Date 2021/11/19 10:53 上午
 * Tongji University
 */

import com.example.sebackend.request.Economy;
import com.example.sebackend.service.FinanceService;
import com.example.sebackend.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * author ShaoCHi
 * Date 2021/11/19 10:53 上午
 * Tongji University
 */

@RestController
@RequestMapping(path = "/api/finance")
public class FinanceController {
  @Autowired
  private FinanceService financeService;

  @PostMapping
  public Result<String> updateEconomy(@RequestBody Economy body){
    return financeService.updateEconomy(body);
  }
}
