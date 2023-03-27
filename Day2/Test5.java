import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){
        //数值拆分
        //键盘录入一个三位数，将其拆分为个位、十位、百位，打印在控制台
        //公式作结：
        //个位：数值 % 10
        //十位：数值 / 10 % 10
        //百位：数值 /1000 % 10
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int number = sc.nextInt();
        int G = number % 10;
        int S = number /10 % 10;
        int B = number / 100 % 10;
        System.out.println(G);
        System.out.println(S);
        System.out.println(B);
    }
}
