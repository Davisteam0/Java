package API;

import java.util.*;

public class Test11 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if ("张三".equals(obj)) {
                list.remove(obj);
            }
        }
        System.out.println(list);
    }
}
