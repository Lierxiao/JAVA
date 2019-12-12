package YUAN;

import java.util.Scanner;

public class Text {
    public static int sum(int n){
        if (n == 0){
            return 0;
        }else {
            return n%10+sum(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sum(n);
        System.out.println(m);
    }
}
