//import java.util.*;
//
//public class Test11 {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list,-3,2,9,5,8);
//        System.out.println("集合中的元素：" + list);
//        System.out.println("集合中的最大元素：" + Collections.max(list));
//        System.out.println("集合中最小元素：" + Collections.min(list));
//        Collections.replaceAll(list,8,0);
//        System.out.println("替换后的集合：" + list);
//        Collections.sort(list);
//        System.out.println("集合排序后为：" + list);
//        int index = Collections.binarySearch(list,0);
//        System.out.println("集合通过二分查找元素9所在的索引为：" + index);
//    }
//}


import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        int [] arr = {9,8,3,5,2};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,3);
        System.out.println("元素3的索引是：" + index);
    }
}