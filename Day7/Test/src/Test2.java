package Test.src;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的选择");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票购买");
                break;
            case 3:
                System.out.println("机票查询");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务");
                break;
        }
    }
}
