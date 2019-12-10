package atongmu;

import java.util.Scanner;

public class Text {
    public static void chengfa (int n){
        for (int i = 1;i <= n;i++){
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%2d*%d=%-2d",j,i,i*j);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        chengfa(n);
    }
}
