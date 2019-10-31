

/**
 * Created by wdy on 16/11/15.
 */
public class StringDemo {
    public static void main(String[] args) {
            String sourceStr = "1,2,3,4,5";
            String[] sourceStrArray = sourceStr.split(",");
            for (int i = 0; i < sourceStrArray.length; i++) {
                //System.out.println(sourceStrArray[i]);
                System.out.print(Long.parseLong(sourceStrArray[i]));
            }
    }
}
