

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wdy on 17/4/20.
 */
public class Io {
    public static void main(String[] args) throws IOException {
       try {
           String encoding = "GBK";
           File f = new File("/Users/wdy/aa.txt"); //定位文件位置
           if (f.isFile() && f.exists()) {
               InputStreamReader reader = new InputStreamReader(new FileInputStream(f), encoding);
               BufferedReader bufferedReader = new BufferedReader(reader);
               String lineTxt = null;
               while((lineTxt = bufferedReader.readLine()) != null){
                   System.out.println(lineTxt);
               }
               reader.close();
           }
           else {
               System.out.println("找不到指定的文件");
           }
       }catch (Exception e) {
           System.out.println("读取文件内容出错");
           e.printStackTrace();
       }
    }
}
