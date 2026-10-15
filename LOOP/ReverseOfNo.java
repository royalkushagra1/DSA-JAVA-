package LOOP;

import java.util.Scanner;

public class ReverseOfNo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        int sum = 0;
        int rev =0;
        while (n!=0){
            rev*=10;
            rev +=(n%10);
            n/=10;
        }
        System.out.println(rev);
    }
}
