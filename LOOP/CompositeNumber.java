package LOOP;

import java.util.Scanner;

public class CompositeNumber {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no:");
        double n = sc.nextDouble();
        boolean flag = true;
        for (int i=2;i<=n-1;i++){
            if (n%i==0){
                flag = false;

                break;
            }
        }
        if (flag==false)System.out.println("composite no ");
        if (flag==true)System.out.println("prime no");
    }
}