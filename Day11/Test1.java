import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价：");
        int trick = sc.nextInt();
        System.out.println("请输入当前的月份：");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();
        if(month >= 5 && month <= 10){
            //旺季
            //继续判断当前机票是头等舱还经济舱
            if(seat == 0){
                //根据价格计算舱位
                //头等舱
                trick = (int)(trick * 0.9);
            }else if(seat == 1){
                //经济舱
                trick = (int)(trick * 0.85);
            }else {
                System.out.println("没有这个舱位");
            }
        }else if(month >= 1 && month <= 4 || (month >= 11 && month <= 12)){
            //淡季
            if(seat == 0){
                //头等舱
                trick = (int)(trick * 0.7);
            }else if(seat == 1){
                //经济舱
                trick = (int)(trick * 0.65);
            }else{
                System.out.println("没有这个舱位");
            }
        }else{
            //表示键盘录入的月份是一个非法数据
            System.out.println("键盘录入的月份不合法");
        }
        System.out.println(trick);
    }
}
