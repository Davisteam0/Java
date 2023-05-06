package JavaAPI;

public class Test3 {
    public static void main(String[] args) {
        String s = "itcast";
        //字符串替换操作
        System.out.println("将it替换成cn.it的结果：" + s.replace('t', 'T'));    // 将字符串s中的字符't'替换成'T'
        //字符串去除空格操作
        String s1 = "   i t c a s t   ";
        System.out.println("去除字符串两端空格后的结果：" + s1.trim());              // 去除字符串s1中的空格
        System.out.println("去除字符串中所有的空格后的结果：" + s1.replace(" ",""));                  // 打印字符串s1
    }
}
