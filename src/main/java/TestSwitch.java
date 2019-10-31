/**
 * Created by wdy on 2018/3/29.
 */
public class TestSwitch {

    static enum E {
        A, B, C, D
    }

    public static void main(String args[]) {
        E e = E.C;
        switch (e) {
            case A:
                System.out.println("A");
                break;
            case B:
                System.out.println("B");
                break;
            case C:
                System.out.println("C");
                break;
            case D:
                System.out.println("D");
                break;
            default:
                System.out.println(0);
        }
    }
}