import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wdy on 2018/3/29.
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(1,2,3,4,5,4,5);
        a.forEach(aa-> System.out.println(aa));

        a.stream().map(aaa->aaa+"b").forEach(System.out::println);

        int bbb=a.stream().map(aaaa->aaaa+1).reduce((s,d)->s+d).get();
        System.out.println(bbb); //2 3 4 5 6 5 6

        int bbbb=a.stream().map(aaaa->aaaa+1).filter(aaaaa->aaaaa!=5).reduce((s,d)->s+d).get();
        System.out.println(bbbb); //2 3 4 5 6 5 6


        List<Integer> b=a.stream().map(bb -> bb*bb).distinct().collect(Collectors.toList());
        System.out.println(b);

    }
}

