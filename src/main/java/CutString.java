

/**
 * Created by wdy on 16/10/11.
 */
public class CutString {
    public static void main(String[] args) {
        String s1 = "/usrs/a.png";
        String s2 = "1,2,3,4,5";
        String a = s1.substring(s1.lastIndexOf("/") + 1);
        String b = s1.substring(0, s1.lastIndexOf(".")) + 1;
        String c = s1.substring(s1.lastIndexOf("."));
        String d = s2.substring(0, s2.indexOf(","));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(b + c);
        System.out.println(d);
    }
}
