package API;

import java.util.*;

public class Test12 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        for(Object obj : list) {
            System.out.println(obj);
        }
    }
}
