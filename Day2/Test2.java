//1.导包
//书写要注意：要写在类定义上面
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){

        //键盘录入
        //一：导包---Scanner这个类在哪
        //import Java.util.Scanner;     导包的动作必须出现在类定义的上边
        //二: 创建对象---表示我要开始用Scanner这个类了
        //Scanner sc = new Scanner(System.in);
        //上面这个格式里面，只有sc是变量名，可以变，其他的都不允许变。
        //三: 接收数据---真正开始干活
        //int i = sc.nextInt();     左边这个格式里面，只有i是变量名，可以变，其他的都不允许变。

    //2.创建对象，表示我要准备使用Scanner这个类
    Scanner sc = new Scanner(System.in);

    //3.接收数据
    //变量i记录了键盘录入的数据
    int i = sc.nextInt();
    System.out.println(i);
    }
}
