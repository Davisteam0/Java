package API;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("a*b");
        Matcher m1 = p1.matcher("aaaaab");
        Matcher m2 = p1.matcher("aaabbb");
        System.out.println(m1.find());
        System.out.println(m2.find());
        Pattern p2 = Pattern.compile("[/]+ ");
        String[] str = p2.split("张三//李四/王五/赵六/钱七");
        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}