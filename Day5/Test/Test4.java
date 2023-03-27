import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前余额:");
        int money = sc.nextInt();
        if(money >= 100){
            System.out.println("有钱>,>，吃网红餐厅！");
        }else{
            System.out.println("没钱-。-，吃沙县小吃！");
        }
    }
}
