public class VariableDemo {
    //主入口
    public static void main(String[] args){
        //定义变量
        //数据类型 变量名 = 数据值
        //数据类型： 限定了变量能存储数据的类型
        //int（整型） double（小数）
        //变量名：就是存储空间的名字
        //作用：方便以后使用
        //数据值：真正存在变量中的数据

        //等号：赋值。把右边的数据赋值给左边的变量
        // int a = 10;
        // System.out.println(a);      //10

        int a = 10;
        int b = 20;
        System.out.println(a+b);       //30

        int c = 50;
        System.out.println(c);

        //注意事项
        //在一条语句中可以定义多个变量
        int d = 100,e = 200,f = 300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
