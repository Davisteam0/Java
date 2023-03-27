import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i * i == num){
            } else if (i * i > num) {
                System.out.println(i + "就是" + num + "的平方根");
                break;
            } else if (i * i > num) {
                System.out.println();
                break;
            }
        }
    }
}
