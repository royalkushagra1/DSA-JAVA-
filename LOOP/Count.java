package LOOP;

import java.util.Scanner;

public class Count {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println("enter a no:");
        int count =0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
