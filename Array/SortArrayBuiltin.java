package Array;

import java.util.Arrays;

public class SortArrayBuiltin {
    static void main() {
        int[] arr = {4,1,3,6,7,4,5,10};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}
