package JavaAPI;

// a:为下列输出代码添加注释

public class Test1 {
    public static void main(String[] args) {
        String s = "abaabcacbcabcab";                //定义一个字符串
        //获取字符串长度
        System.out.println(s.length());             // 定义一个名为s的字符串变量并将其赋值为"abaabcacbcabcab"
        //获取指定位置的字符
        System.out.println(s.charAt(2));            // 打印字符串s的长度
        //获取指定字符的位置
        System.out.println(s.indexOf('a'));         // 打印字符串s中索引为2的字符
        //获取指定字符的位置
        System.out.println(s.indexOf('a', 2));      // 打印字符'a'在字符串s中第一次出现的索引
        //获取指定字符串的位置
        System.out.println(s.indexOf("abc"));       // 打印字符'a'在字符串s中从索引2开始第一次出现的索引
        //获取指定字符串的位置
        System.out.println(s.indexOf("abc", 2));    // 打印字符串"abc"在字符串s中第一次出现的索引
    }
}
