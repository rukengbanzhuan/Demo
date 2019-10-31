import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wdy on 2018/10/29.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Date a=new Date();
        System.out.println(a);
        LocalDate b =LocalDate.now();
        System.out.println(b);

//        map
//        map操作可以改变对象的内容或类型，生成一个一对一的映射，每个输入元素，都按照规则转换成为另外一个元素。比如把大写字母转换成小写。
        List<String> wordList= Arrays.asList("H","E","L","L","O");
        List<String> outputList=new ArrayList<>();
        for(String word:wordList){
            outputList.add(word.toLowerCase());
        }
        System.out.println(outputList);
        System.out.println(wordList.stream().map(String::toLowerCase).collect(Collectors.toList()));
        System.out.println(wordList.stream().filter(e-> e=="H").collect(Collectors.toList()));
    }
}
