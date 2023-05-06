package Try;

public class Test4 {
    public static void main(String[] args) {
        //下面的代码定义了一个try…catch语句用于捕获异常
        try {
            int result = divide(4,2);               // 调用divide()方法
            System.out.println(result);
        } catch (Exception e) {                     //对捕获的异常进行处理
            e.printStackTrace();                    //打印捕获的异常信息
        }
    }
    //下面的方法实现了两个整数相除,并使用throws关键字声明抛出异常
    public static int divide(int x,int y) throws Exception {
        int result = x / y;
        return result;
    }
}
