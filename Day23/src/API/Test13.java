package API;

import java.util.*;

public class Test13 {
    static String[] strs = {"aaa","bbb","ccc"};
    public static void main(String[] args) {
        for(String str : strs) {
            str = "ddd";
        }
        System.out.println("foreach循环修改后的数组：" + strs[0] + "," + strs[1] + "," + strs[2]);
        for(int i = 0; i < strs.length; i++) {
            strs[i] = "ddd";
        }
        System.out.println("普通for循环修改后的数组：" + strs[0] + "," + strs[1] + "," + strs[2]);
    }
}
