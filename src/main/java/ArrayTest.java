

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wdy on 2018/3/20.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4};
        List<Integer> lists=new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        List<Integer> list=new ArrayList<>();
//        for(int a=0;a<integers.length-1;a++){
//            for(int b=a+1;b<integers.length;b++){
//                list.add(integers[a]);
//                list.add(integers[b]);
//            }
//        }
//        System.out.print(list);
        for(int a=0;a<lists.size()-1;a++){
            for(int b=a+1;b<lists.size();b++){
                list.add(list.get(a+1));
                list.add(list.get(b+1));
            }

        }
        System.out.print(list);

    }
}