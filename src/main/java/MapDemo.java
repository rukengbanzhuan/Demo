import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by wdy on 16/9/23.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        map.put("4", "value4");

        //第一种：普通使用，二次取值
        System.out.println("\n通过Map.keySet遍历key和value：");
        for(String key:map.keySet())
        {
            System.out.println("Key: "+key+" Value: "+map.get(key));
        }

        //第二种
        System.out.println("\n通过Map.entrySet使用iterator遍历key和value: ");
        Iterator<Map.Entry<String, String>> map1it=map.entrySet().iterator();
        while(map1it.hasNext())
        {
            Map.Entry<String, String> entry= map1it.next();
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("\n通过Map.entrySet遍历key和value");
        for(Map.Entry<String, String> entry: map.entrySet())
        {
            System.out.println("Key: "+ entry.getKey()+ " Value: "+entry.getValue());
        }

        //第四种
        System.out.println("\n通过Map.values()遍历所有的value，但不能遍历key");
        for(String v:map.values())
        {
            System.out.println("The value is "+v);
        }

//    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<String, String>();
//        String[] a = {"1", "2", "3", "4", "5", "6"};
//        String[] b = {"大哥", "大嫂", "二哥", "二嫂", "三哥", "三嫂"};
//        int len = a.length > b.length ? b.length : a.length;
//        for (int i = 0; i < len; i++) {
//            map.put(a[i], b[i]);
//        }
//        System.out.println(map);//要输出 一 一对应 ，1=大哥，2=大嫂，3=二哥，4=二嫂，5=三哥，6=三嫂。。
//
//    }

    }
}
