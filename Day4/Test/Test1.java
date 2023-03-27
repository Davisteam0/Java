import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        // 逻辑运算符
        // '&':逻辑与（并且，两边都为真，结果才是真）
        // '|':逻辑或（或者，两边都为假）
        // '^':逻辑异或（相同为false，不同为true）
        // '!':逻辑非（取反）

        // '&'
        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println(true & false);
        System.out.println(true & false);
        System.out.println(true & true);

        // '|'
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true | false);
        System.out.println(false | true);

        // '^'
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        // '!'
        System.out.println(!true);
        System.out.println(!false);


        //逻辑运算符
        //短路逻辑运算符
        // '&&' :结果和&相同，但是有短路效果
        // '||' :结果和|相同，但是有短路效果

        // '&&'
        System.out.println(true && true);   //true
        System.out.println(false && false); //false
        System.out.println(true && false);  //false
        System.out.println(false && true);  //false

        // '||'
        System.out.println(true || true);   //true
        System.out.println(false || false); //false
        System.out.println(true || false);  //true
        System.out.println(false || true);  //true

        //短路运算符具有短路效果
        //简单理解：当左边的表达式能确定最终值的结果，那么右边就不会参与运算了。
        int a = 10;
        int b = 20;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);     //false
        System.out.println(a);
        System.out.println(b);

        //注意事项：
        // 单独的 '&' '|' 无论左边true  false ，右边都要执行
        // '&&' '||' 如果左边能确定整个表达式的结果，右边不执行
        // '&&' 左边为false，右边不管是真是假，整个表达式的结果一定是false
        // '||' 左边为true，右边不管是真是假，整个表达式的结果一定是true

        //练习
        //数字6
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int number2 = sc.nextInt();

        //
        boolean result1 = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(result1);
    }
}
