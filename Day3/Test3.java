import java.util.Scanner;

public class Test3 {
    //练习
    //约会
    // 您和您的约会对象正试图在餐厅获得一张桌子。
    // 键盘录入两个整数，表示你和你约会对象衣服的时笔度。(手动录入0~10之间的整数，不能录其他)
    // 如果你的时笔程度大于你对象的时笔程度，相亲就成功，输出true。否则输出false。

    //1.键盘录入两个整数表示衣服的时髦度
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我们自己的衣服时髦度:");
        int MyFashion = sc.nextInt();
        System.out.println("请输入约会对象的时髦度:");
        int GirlFashion = sc.nextInt();

        //2.相互对比
        boolean result = MyFashion > GirlFashion;

        //3.打印结果
        System.out.println(result);
    }

}
