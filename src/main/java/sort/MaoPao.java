package sort;

import java.util.Arrays;

/**
 * Created by wdy on 2018/4/9.
 */
public class MaoPao {
    public static void main(String[] args) {
        int array[] = {1, 3, 4, 5, 2, 9, 6, 7, 11, 34, 56, 78, 53, 23, 12, 33};
        for (int i = 0; i < array.length - 1; i++) {
            int result = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    result = 1;
                }
            }
            if (result == 0) {
                break;
            }
        }
        System.out.print(Arrays.toString(array));
    }

}
