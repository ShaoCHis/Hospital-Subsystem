//package com.example.sebackend;
//
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//
//@SpringBootTest
//public class HospitalControllerTests {
//    private MockMvc mvc;
//
//    @Test
//    public void getHospitalInfo() throws Exception {
//        RequestBuilder requestBuilder;
//        requestBuilder = get("/api/hospitals/").param("id","10001");
//        try {
//            mvc.perform(requestBuilder)
//                    .andExpect(MockMvcResultMatchers.status().isOk())
//                    .andDo(MockMvcResultHandlers.print());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void updatePatient () throws Exception{
//        RequestBuilder requestBuilder;
//        requestBuilder=post("/api/hospitals/updatePatient")
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON)
//                .content("{\"id\":\"100\",\"economy\":100}");
//        mvc.perform(requestBuilder)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print());
//    }
//}
