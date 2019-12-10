package caishuzi;

import java.util.Random;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        while (true){
            System.out.println("请输入数字");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            if (num < guess){
                System.out.println("数字大了");
            }else if (num > guess){
                System.out.println("数字小了");
            }else {
                System.out.println("数字正确");
                break;
            }
        }
    }
}
