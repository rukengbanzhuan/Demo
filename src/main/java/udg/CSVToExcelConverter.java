package udg;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wdy on 2018/3/13.
 */
public class CSVToExcelConverter {
    public static void main(String args[]) throws IOException {
        File csv = new File("/Users/wdy/page_props_20180401.csv");  // CSV文件路径
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(csv), "UTF-8");
            br = new BufferedReader(isr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = "";
        try {
            List<List<String>>  dataList= new ArrayList<List<String>>();
            while ((line = br.readLine()) != null) {
//                String first=line.substring(0, line.indexOf("{"));
//                String second=line.substring(line.indexOf("{")+1,line.indexOf("}"));
//                String seconds= second.replace(",",".");
//                String third=line.substring(line.lastIndexOf("}")+1);
//                String str=first+seconds+third;
                String[] split = line.split("\t");
                List<String> l=new ArrayList<String>();
                for(String s:split){
                    l.add(s);
                }
//                System.out.print(l);

                List<String> t = new ArrayList<String>();
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
//                    sheetWrite.mergeCells(column, row, column1, row1);
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
