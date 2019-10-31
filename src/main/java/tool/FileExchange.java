package tool;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wdy
 * Date 2019-10-31
 */
public class FileExchange {
    public static void main(String args[]) throws IOException {
        File csv = new File("/Users/wdy/custom_event_20180401.csv");  // CSV文件路径
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(csv), "UTF-8");
            br = new BufferedReader(isr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = "";
        try {
            List<List<String>> dataList = new LinkedList<>();
            while ((line = br.readLine()) != null) {
                String[] split = line.split("\t");
                List<String> l = new LinkedList<String>();
                for (String s : split) {
                    l.add(s);
                }

                List<String> t = new LinkedList<String>();
                for (int i = 0; i < split.length; i++) {
                    t.add(split[i]);
                }
                dataList.add(t);
            }
            HSSFWorkbook wb = new HSSFWorkbook();
            //声明一个sheet并命名
            HSSFSheet sheet = wb.createSheet("测试");
            for (int i = 0; i < dataList.size(); i++) {
                // 创建行
                HSSFRow row = sheet.createRow(i);
                List<String> list = dataList.get(i);
                for (int j = 0; j < list.size(); j++) {
                    // 创建单元格
                    HSSFCell cell = row.createCell(j);
                    cell.setCellValue(list.get(j));
                }
            }
            // 写入到文件里面
            FileOutputStream out = new FileOutputStream("/Users/wdy/测试.xls");
            wb.write(out);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
