package JavaAPI;

public class Test4 {
    public static void main(String[] args) {
        String s1 = "String";
        String s2 = "String";
        System.out.println("判断s1字符串对象是否以Str开头：" + s1.startsWith("Str"));
        System.out.println("判断字符串对象是否以ng结尾：" + s1.endsWith("ng"));
        System.out.println("判断字符串对象是否包含字符串tri：" + s1.contains("tri"));
        System.out.println("判断字符是否为空：" + s1.isEmpty());
        System.out.println("判断两个字符串是否相等：" + s1.equals(s2));
        System.out.println("判断两个字符串是否相等（忽略大小写）：" + s1.equalsIgnoreCase(s2));

    }
}
