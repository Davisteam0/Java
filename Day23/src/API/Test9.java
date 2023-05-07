package API;

import java.util.*;
public class Test9 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("张三");
        link.add("李四");
        link.add("王五");
        link.add("赵六");
        System.out.println(link.toString());
        link.add(3,"Student");
        link.addFirst("First");
        System.out.println(link);
        System.out.println(link.getFirst());
        link.remove(3);
        link.removeFirst();
        System.out.println(link);
    }
}
