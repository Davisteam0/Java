import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个数表示实际支付的钱");
        int money = sc.nextInt();
        if(money >= 600){
            System.out.println("支付成功");
        }else{
            System.out.println("支付失败，余额不足");
        }
    }
        */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个票号");
        int trick = sc.nextInt();
        if (trick >= 0 && trick <= 100) {
            if (trick % 2 == 1) {
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        }
    }
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的分数");
        int score = sc.nextInt();
        if (score > 0 && score <= 100) {
            if (score >= 95 && score <= 100) {
                System.out.println("自行车一辆");
            } else if (score >= 90 && score <= 95) {
                System.out.println("游乐场一日游");
            } else if (score >= 85 && score <= 90) {
                System.out.println("下馆子！");
            }else if(score >= 80 && score <= 90){
                System.out.println("赏面壁思过一天！");
            }else{
                System.out.println("竹笋炒肉！");
            }
        }
    }
}
