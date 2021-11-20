package com.example.sebackend.utils;
/**
 * Created By ShaoCHi
 * Date 2021/11/20 3:02 下午
 * Tongji University
 */

import okhttp3.*;

import java.io.IOException;

/**
 * author ShaoCHi
 * Date 2021/11/20 3:02 下午
 * Tongji University
 */
public class OkhttpApi {
  OkHttpClient client=new OkHttpClient();

  public String run(String url) throws IOException{
    okhttp3.Request request=new okhttp3.Request.Builder().url(url).build();

    try(Response response=client.newCall(request).execute()) {
      System.out.println(response.body().toString());
      return response.body().toString();
    }
  }
}
