package Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的分数：");
        int score = sc.nextInt();
        if(score > 90) {
            System.out.println("您的分数为优秀");
        } else if (score > 80 && score < 90) {
            System.out.println("您的分数为优");
        } else if (score > 70 && score < 79) {
            System.out.println("您的分数为良好");
        } else if (score > 60 && score < 69) {
            System.out.println("您的分数为合格");
        } else {
            System.out.println("您的分数为不合格！");
        }
    }
}
