package API;

import java.util.*;

public class Test14 {
    public static void main(String[] args) {
        HashSet hset = new HashSet();
        hset.add("张三");
        hset.add("李四");
        hset.add("王五");
        hset.add("李四");
        Iterator it = hset.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
