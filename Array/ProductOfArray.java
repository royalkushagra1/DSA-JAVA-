package Array;

public class ProductOfArray {
    static void main() {
        int [] arr = {33,44,36,32,12,45,5,-55,6};
        int product  = 1;
        for(int i =0;i<arr.length;i++){
            product *= arr[i];

        }
        System.out.println(product);
    }
}
