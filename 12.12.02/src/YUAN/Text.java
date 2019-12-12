package YUAN;

import java.util.Scanner;

public class Text {
    public static void shuchu(int n) {
        if (n == 0){
            System.out.println("输入有误");
        }else if (n < 10) {
            System.out.println(n);
        } else {
            shuchu(n/10);
            int m = n%10;
            System.out.println(m);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        shuchu(n);

    }
}
