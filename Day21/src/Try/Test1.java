package Try;

public class Test1 {
    public static void main(String[] arsg) {
        int result = divide(4,0);
        System.out.println(result);     //调用divide()方法,第2个参数为0
    }
    //下面的方法实现了两个整数相除
    public static int divide(int x,int y) {
        int result = x / y;             //定义变量result记录两个数相除的结果
        return result;                  //将结果返回
    }
}
