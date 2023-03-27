public class Test1 {
    public static void main(String[] args){
        /*
        需求: 给你一个整数 x 。
        如果 x 是一个回文整数，打印 true ，否则，返回 false 。
        解释: 回文数是指正序(从左向右) 和倒序(从右向左) 读都是一样的整数。
        例如，121 是回文，而 123 不是。
        */

        //核心思路: 把数字倒过来跟原来的数字进行比较

        //1.定义数字
        int x = 121;
        //定义一个临时变量用于记录x原来的值，用于最后的比较
        int temp = x;
        //记录倒过来之后的结果
        int num = 0;
        while(x != 0){
            //从右往左获取每一位数字
            int G = x % 10;
            //修改一下x的记录的值
            x = x / 10;
            //把当天获取到的数字拼接到最右边
            num = num * 10 + G;
        }
        //3.打印
        System.out.println(num);//121
        System.out.println(x);//0
        //4.比较
        System.out.println(num == temp);

    }
}
