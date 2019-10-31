

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.IntStream;

/**
 * Created by wdy on 16/10/19.
 */
public class IntStreamTest {
    public static void main(String[] args) {
        IntStream is = IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18)
                .build();
        // 下面调用聚集方法的代码每次只能执行一个
//          System.out.println("is所有元素的最大值：" + is.max().getAsInt());
        is.filter(a -> a > 0).forEach(System.out::println);
        Collection c=new HashSet();
        c.add(new String("Content 1"));
        c.add(new String("Content 2"));
        c.add(new String("Content 3"));
/// lambda expression
        c.removeIf(s->((String)s).length()<5);
        System.out.println(c);
    }
}
