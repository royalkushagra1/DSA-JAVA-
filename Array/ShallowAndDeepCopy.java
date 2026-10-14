package Array;

import java.util.Arrays;

public class ShallowAndDeepCopy {
    static void main() {
        int  a = 4;
        int [] arr = {10,20,30,40};
//        int[] x = arr;
//        x[0] =100;
        int[] y = Arrays.copyOf(arr,arr.length);
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
