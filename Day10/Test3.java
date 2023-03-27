public class Test3 {
    public static void main(String[] args){

        /*
            方法定义小技巧：
                1.我要干什么？
                2.我干这件事需要什么才能完成？
         */

        int sum = Sum(40,90,110);
        System.out.println(sum);
    }

    public static int Sum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;

    }

}
