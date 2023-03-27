package Test.src;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字表示范围的开始！");
        int start = sc.nextInt();
        System.out.println("请输入一个数字表示范围的结束！");
        int end = sc.nextInt();

        //统计变量
        //简单理解：统计符合要求的数字的个数
        int count = 0;

        for(int i = start;i <= end;i++){
            if(i % 3 == 0 && i % 5 == 0){
                //System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
