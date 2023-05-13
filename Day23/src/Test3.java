import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
