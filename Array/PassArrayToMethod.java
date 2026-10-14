package Array;

public class PassArrayToMethod {
    static void main() {
        int x [] = {10,44,32,39};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }

    public static void change(int[] y) {
        y[2] =99;

    }
}
