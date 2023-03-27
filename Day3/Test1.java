import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        // 算术运算符
        // 当“+”操作中出现字符串时，这个“+”是字符串连接符，而不是算术运算符了。
        // 会将前后的数据进行拼接，并产生一个新的字符串。
        // "123" + 123 -> "123123"

        // 连续进行”+“操作时，从左到右逐个执行。
        //1 + 99 + "年黑马" -> "100年黑马"

        System.out.println(3.7 + "abc");        // "3.7abc"

        System.out.println("abc" + true);       //"abcture"

        int age = 18;
        System.out.println("我的年龄是:" + age + "岁");
        System.out.println("我的年龄是:" + "age" + "岁");

        System.out.println(1 + 2 + "abc" + 2 + 1);

        //练习
        //数值拆分
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int num = sc.nextInt();

        int G = num % 10;
        int S = num / 10 % 10;
        int B = num /100 % 10;
        System.out.println("个位是:" + G);
        System.out.println("十位是:" + S);
        System.out.println("百位是:" + B);

        //
        char a = 'a';
        int result = a + 0;
        System.out.println(result);

        // 当字符 + 字符 / 字符 + 数字时，会把字符通过ASCII码表查询到对应的数字再进行计算。
        System.out.println(1 + 'a');
        System.out.println('a' + "abc");

        // 注意事项:
        // / 和 % 的区别:两个数据做除法，/取结果的商。%取结果的余数。
        // 整数操作只能得到整数，要想得到小数，必须有浮点数参与运算
    }
}
