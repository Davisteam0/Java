import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) (it.next());
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
