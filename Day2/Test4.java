public class Test4 {
    public static void main(String[] args){
        // +
        System.out.println(3 + 2);
        // -
        System.out.println(6 - 2);
        // *
        System.out.println(3 * 3);
        // /
        System.out.println(8 / 4);
        // %
        System.out.println(10 % 3);

        //如果在计算过程中有小数
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);

        //整数参与计算结果只能得到整数
        //小数参与计算结果有可能是不精准的

        //取模、取余 --- 应用场景
        //1.可以取模判断A是否可以被B整除
        //A%B 10 % 3
        //2.可以判断A是否为偶数
        //3.斗地主发牌
        //三个玩家
        //把每一张牌都定义一个序号
        //拿着序号 % 3 如果结果为1，就发给第一个玩家
        //如果结果为2，那么就发给第二个玩家
        //如果结果为3，那么就发给第三个玩家
    }
}
