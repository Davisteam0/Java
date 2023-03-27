import java.util.Scanner;

public class Test7 {
    public static void main(String[] args){
        //需求：键盘录入一个正整数x，判断该整数是否为一个质数

        //质数：只能被1和本身整除的数，否则这个数就叫合数
        //7 = 1 * 7 质数
        //8 = 1 * 8 2 * 4 合数



        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();

        boolean flag = true;

        for(int i = 2;i < num;i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
            if(flag){
                System.out.println(num + "是一个质数！");
            }else{
                System.out.println(num + "不是一个质数！");
            }
        }
    }
