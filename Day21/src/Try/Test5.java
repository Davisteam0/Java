package Try;

public class Test5 {
    public static void main(String[] args) throws Exception {
        int result = divide(4,0);
        System.out.println(result);
    }
    // 下面的方法实现了两个整数相除,并使用throws关键字声明抛出异常
    public static int divide(int x,int y) throws Exception {
        int result = x / y;
        return result;
    }
}
