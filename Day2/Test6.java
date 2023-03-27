public class Test6 {
    public static void main(String[] args){
        int a = 10;
        double b = 12.5;
        double c = a + b;
        System.out.println(c);
        //算数运算符
        //取值范围：
        //byte > short > int > long > float > double
        //数据类型不一样，不能进行计算，需要转换成一样的才可以进行计算
        //取值范围小的，和取值范围大的进行运算，小的会先提升为大的，再进行运算

        byte b1 = 10;
        byte b2 = 20;
        //int result = b1 + b2;
        //System.out.println(result);

        int i = 10;
        long n = 100L;
        double d = 20.0;
        double result = i + n + d;

        //强制转换
        byte bb1 = 10;
        byte bb2 = 20;
        int result1 = (byte)(bb1 + bb2);
        System.out.println(result1);
    }
}
