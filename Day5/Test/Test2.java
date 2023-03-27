import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
        int wine = 1;
        if(wine >= 2){
            System.out.println("小伙子，不错！");
        }else {
            System.out.println("小伙子，不行啊");
        }
        System.out.println();
    }
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的酒量:");
        int wine = sc.nextInt();
        if (wine >= 2) {
            System.out.println("小伙子，不错啊");
        } else {
            System.out.println("小伙子，你不行");
        }
    }
}
