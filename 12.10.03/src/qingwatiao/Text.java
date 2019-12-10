package qingwatiao;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = qingwatiao(n);
        System.out.println(m);
    }
    public static int qingwatiao(int n){
        if(n == 1 || n == 0) {
            return 1;
        }else {
            return qingwatiao(n-1)+qingwatiao(n-2);
        }
    }
}
