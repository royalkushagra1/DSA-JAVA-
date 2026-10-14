package Array;

public class SumAndMax {
    static void main() {
        int[] arr = {-6,7,8,14,47,-7};
//        int sum = 0;
//        for(int i = 0; i<arr.length;i++){
//           sum += arr[i];
//        }
//        System.out.println(sum);
        int max  = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max)max = arr[i];

        }
        System.out.println(max);
    }
}
