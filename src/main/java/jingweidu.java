
import java.text.DecimalFormat;

/**
 * Created by wdy on 17/8/4.
 */

public class jingweidu {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            double long1 =116.4159020000;
            double d1 =cos(long1);
            //5代表5公里范围
            System.err.println(5/(d1*111));
        }
        private static double cos(double t){
            if(t > 90){
                t = 180 - t;
            }
            DecimalFormat df = new DecimalFormat("#.00");
            double t1 = Math.toRadians(t);
            double result = Math.cos(t1);
            return Double.parseDouble(df.format(result));
        }
    }
   // 纬度范围值  公里范围值/111  例如5/111

