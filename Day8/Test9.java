import java.util.Random;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        //猜数字小游戏

        Random r = new Random();
        int num = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字");
            int Num = sc.nextInt();
            //根据输入的数字给出判断结果大、小、正确！
            if (Num < num) {
                System.out.println("很抱歉，您的答案偏小！");
            } else if (Num > num) {
                System.out.println("很抱歉，您的答案偏大！");
            } else {
                System.out.println("恭喜您猜对了！");
                break;
            }
        }
    }
}
