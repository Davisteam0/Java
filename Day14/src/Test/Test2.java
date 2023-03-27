package Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入温度：");
        int temp = sc.nextInt();
        if(temp < 10) {
            System.out.println(temp + "°C 有点冷");
        }else if(temp >10 && temp < 25) {
            System.out.println(temp +"°C 正合适");
        }else if(temp > 25 && temp < 35) {
            System.out.println(temp +"°C 有点热");
        }else {
            System.out.println(temp +"°C 太热了！开空调");
        }
    }
}
