package Test.src;

public class Test7 {
    public static void main(String[] args){
        /*
        int x = 12;
        int G = x % 10;
        int S = x / 10 % 10;
        int result = G * 10 + S;
        System.out.println(result);

         */

        int x = 12345;
        int num = 0;
        //定义一个会话变量用于记录会话值
        int temp = x;
        //记录倒过来之后的结果
        while(x != 0){
            //从右到左获取每一位数字
            int G = x % 10;
            //修改一下x记录的值
            x = x / 10;
            //把当前获取到的数字拼接到最右边
            num = num * 10 + G;
        }
        System.out.println(num);
        //比较
        System.out.println(num == temp);
    }
}
