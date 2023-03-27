import java.util.Random;

public class Test8 {
    public static void main(String[] args){
        //获取随机数，Randon 这个可以生成随机数
        /*使用步骤
        import java.util.Random;    //导包的动作必须出现在类定义的上边
        Random r = new Random();    //上面这个格式里面，只有r是变量名，可以变，其他的都不允许变
        int num = r.nextInt(随机数的范围);  // 只有num是变量名 ，其他的都不允许改变
         */

        //用来生成任意数到任意数之间的随机数 7 ~ 15
        //1.让这个范围头尾都减去一个值，让这个范围从0开始 -7 0~8
        //尾巴 -1
        //最后的结果加上减去的值 +7

         Random r = new Random();
         int num = r.nextInt(9) + 7;
         System.out.println(num);
    }
}
