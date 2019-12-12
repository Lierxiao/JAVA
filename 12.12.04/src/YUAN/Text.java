package YUAN;
 //求斐波那契数列的第 N 项
public class Text {
     public static int feibonaqie(int n) {
        if (n == 1|| n == 2){
            return 1;
        }
        return feibonaqie(n-1)+feibonaqie(n-2);

     }
     public static void main(String[] args) {
        int n = 6;
        int m = feibonaqie(n);
        System.out.println(m);

     }
}
