package sort;

import java.util.Arrays;

/**
 * Created by wdy on 2018/4/9.
 */
public class Choose {
    public static void main(String[] args) {
        int array[] = {1, 3, 4, 5, 2, 9, 6, 7, 11, 34, 56, 78, 53, 23, 12, 33};
        for (int i = 0; i < array.length - 1; i++) {
            int result = 0;
            for (int j = 0; j < array.length - i ; j++) {
                if (array[j] > array[result]) {
                    result=j;
                }
            }
            int temp = array[result];
            array[result] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.print(Arrays.toString(array));
    }

}
