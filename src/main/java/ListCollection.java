

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCollection {

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        List<Integer> mylist = Arrays.asList(1,2,3,4);
        //Map<Integer, Integer> mymap = new HashMap<Integer, Integer>();
        List<String> list = new ArrayList<String>();
        for(int i=0;i< mylist.size()-1;i++)
        {
            for(int j=i+1;j< mylist.size();j++)
            {
                list.add(mylist.get(i)+","+mylist.get(j));
            }
        }
//        for(int k = 0; k< list.size(); k++)
//        {
//            System.out.println(list.get(k));
//        }
        System.out.print(list);
    }
}