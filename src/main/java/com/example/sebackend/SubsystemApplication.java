package com.example.sebackend;

import com.example.sebackend.nettyClient.NettyClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
public class SubsystemApplication {
  @PostConstruct
  public void setDefaultTimezone() {
    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
  }
  public static void main(String[] args) {
    SpringApplication.run(SubsystemApplication.class, args);
    try {
      new NettyClient(12114).start();
    }catch (Exception e){
      System.out.println(e);
    }
  }
}
