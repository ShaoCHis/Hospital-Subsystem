/**
 * Created By ShaoCHi
 * Date 2021/11/20 3:07 下午
 * Tongji University
 */

import com.example.sebackend.utils.OkhttpApi;
import org.json.JSONObject;

import java.io.IOException;

/**
 * author ShaoCHi
 * Date 2021/11/20 3:07 下午
 * Tongji University
 */
public class TestOkHttp {
  public static void main(String[] args) throws IOException {
    OkhttpApi api = new OkhttpApi();
    String run = api.run("http://139.196.194.51:18080/api/hospitals/1");
    System.out.println(run);
//    System.out.println(jsonObject);
  }
}
