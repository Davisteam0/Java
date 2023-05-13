import java.util.*;
public class Test5 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        map.put("4","赵六");
        System.out.println("集合大小为：" + map.size());
        System.out.println("判断是否包含传入的键(2):" + map.containsKey("2"));
        System.out.println("判断是否包含传入的值(王五):" + map.containsValue("王五"));
        Collection values = map.values();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Object value = it.next();
            System.out.println(value);
        }
    }
}
