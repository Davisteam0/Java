//package API;
//
//import java.util.*;
//
//public class Test18 {
//    public static void main(String[] args) {
//        //创建集合
//        TreeSet ts = new TreeSet();
//        //向集合中添加元素
//        ts.add(3);
//        ts.add(29);
//        ts.add(90);
//        ts.add(60);
//        ts.add(25);
//        System.out.println("创建的TreeSet集合为：" + ts);
//        //获取首尾元素
//        System.out.println("TreeSet集合首元素为：" + ts.first());
//        System.out.println("TreeSet集合尾部元素为：" + ts.last());
//        //比较并获取元素
//        System.out.println("集合中小于或等于9的最大的元素为：" + ts.floor(9));
//        System.out.println("集合中大于10的最小的元素为：" + ts.higher(10));
//        System.out.println("集合中大于100的最小的元素为：" + ts.higher(100));
//        //删除元素
//        Object first  = ts.pollFirst();
//        System.out.println("删除的第一个元素为：" + first);
//        System.out.println("删除第一个元素后TreeSet集合变成：" + ts);
//    }
//}
