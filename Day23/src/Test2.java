import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        System.out.println("1:" + map.get("1"));
        System.out.println("2:" + map.get("2"));
        System.out.println("3:" + map.get("3"));
    }
}
