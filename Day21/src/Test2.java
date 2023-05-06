public class Test2 {
    public static void main(String[] args) {
        //下面的代码定义了一个try…catch语句用于捕获异常
        try {
            int result = aivide(4,0);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("捕获的异常信息为：" + e.getMessage());
        }
    }
    //下面的方法实现了两个整数相除
    public static int aivide(int x,int y) {
        int result = x / y;
        return result;
    }
}