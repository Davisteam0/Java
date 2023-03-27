import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        // 三元运算符
        // 格式：关系表达式 ? 表达式1 : 表达式2;
        //a > b ? a : b;

        int a = 10 , b = 60;
        int max = a > b ? a : b;
        System.out.println(a > b ? a : b);
        System.out.println(max);

        //
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int weight2 = sc.nextInt();

        String result = weight1 == weight2 ? "相同" : "不相同";
        System.out.println(result);


        //
        int A = 10;
        int B = 20;
        int C  = 30;
        System.out.println(a + (B * C));

    }
}
