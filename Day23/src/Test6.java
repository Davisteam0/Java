import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put("3","李四");
        map.put("2","王五");
        map.put("4","赵六");
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
