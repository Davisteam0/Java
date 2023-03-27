public class Test2 {
    public static void main(String[] args){
        int bc = 100;   //被除数
        int c = 30;     //除数
        int cout = 0;   //统计相减次数
        while(bc >= c){
            bc = bc - c;
            cout ++;    //减一次统计变量就增一次
        }   //while循环过程中-> 被除数不断的减去除数直到为0结束循环
        System.out.println("余数为：" + bc);
        System.out.println("商为:" + cout);
    }
}
