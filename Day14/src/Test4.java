import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您当前的月份：");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("当前的季节为冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("当前的季节为春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("当前的季节为夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("当前的季节为秋季");
                break;
            default:
                System.out.println("输入的月份错误，请输入1-12的数字");
                break;
        }
    }
}

