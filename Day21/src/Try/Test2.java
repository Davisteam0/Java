package Try;

public class Test2 {
    public static void main(String[] args) {
        //下面的代码定义看一个try…catch…finally语句用于捕获异常
        try {
            int result = divide(4,0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("捕获的异常信息为:"+ e.getMessage());
            return;
        } finally {
            System.out.println("进入finally代码块");
        }
        System.out.println("程序继续向下…");
        }
        //下面的方法实现了两个整数相除
        public static int divide(int x,int y) {
            int result = x / y;
            return result;
    }
}
