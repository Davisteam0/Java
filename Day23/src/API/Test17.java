package API;

import java.util.*;

public class Test17 {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
