package YUAN;

import java.util.Scanner;

public class Text {
        public static int jiecheng(int n ){
            if(n == 0 || n==1){
                return 1;
            }else {
                int m = n*jiecheng(n-1);
                return m;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(jiecheng(n));
        }
    }


