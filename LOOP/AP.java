package LOOP;

import java.util.Scanner;

public class AP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        System.out.println("enter no: ");
//        for (int i=2;i<=3*n-1;i+=3){
//            System.out.println(i+" ");

        int a=2,d=3;
        for (int i=1;i<=n;i++){
            System.out.println(a+" ");
            a+=d;
        }
//        }
    }
}
