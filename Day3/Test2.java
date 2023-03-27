import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        //自增运算符
        // ++
        // --
        // ++ / -- 无论放在变量前还是后，单独写一行时结果一样

        int a = 10;
        ++a;
        System.out.println(a);

        a--;
        System.out.println(a);

        --a;
        System.out.println(a);

        int A = 10;
        int B = a++;
        System.out.println(A);
        System.out.println(B);

        int A1 = 10;
        int B1 = ++a;
        System.out.println(A1);
        System.out.println(B1);

        //练习
        int x = 10;
        int y = x++;
        int z = ++x;
        System.out.println("x:"+ x);
        System.out.println("y:"+ y);
        System.out.println("z:"+ z);

        //赋值运算符
        // '=':赋值 ->int a = 10;
        // '+=':加后赋值 -> a += b -> a = a + b;
        // '-=':减后赋值 -> a -= b -> a = a - b;
        // '*=':乘后赋值 -> a *= b -> a = a * b;
        // '/=':除后赋值 -> a /= b -> a = a / b;
        // '%=':取余后赋值 -> a %= b -> a = a % b;

        //细节
        // += -= *= /= 底层都隐藏了一个强制转换
        short s = 1;
        //把左边和右边进行相加，得到结果2，再赋值给左边的变量
        s += 1;
        //等同于：s = (short) (s + 1);
        System.out.println(s);      //2

        //关系运算符
        // '==': a == b ,判断a和b的值是否相等,成立为true,不成立为false
        // '!=': a != b ,判断a和b的值是否不相等,成立为true,不成立为false
        // '>': a > b ,判断a是否大于b,成立为true,不成立为false
        // '>=': a >= b ,判断a是否大于等于b,成立为true,不成立为false
        // '<': a < b ,判断a是否小于b,成立为true,不成立为false
        // '<=': a <= b ,判断a是否小于等于b,成立为true,不成立为false

        int A_ = 10;
        int B_ = 20;
        int C_ = 30;
        System.out.println(A_ == B_);

        //注意事项:关系运算符的结果都是Boolean类型，要么是true，要么是false。


    }
}
