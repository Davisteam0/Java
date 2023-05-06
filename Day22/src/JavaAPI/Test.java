package JavaAPI;

public class Test {
    // 这是一个Javaapi测试类

    //String 类
    public static void main(String[] args) {
        //创建一个空字符串
        String str1 = new String();
        //创建一个内容为abc的字符串
        String str2 = new String("abc");
        //创建一个字符数组
        char[] charArray = new char[] {'D','E','F'};
        String str3 = new String(charArray);
        //创建一个字节数据
        byte[] byteArray = new byte[] {97,98,99};
        String str4 = new String(byteArray);
        //输出字符串
        System.out.println('a' + str1 + 'b');
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
