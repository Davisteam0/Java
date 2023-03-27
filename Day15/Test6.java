import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(n + "的阶乘为：" + result);
    }
}