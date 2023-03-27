import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            int n = num % 10;
            sum += n;
            num /= 10;
        }
            System.out.println("各位数字之和为：" + sum);
    }
}