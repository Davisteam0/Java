package JavaAPI;

public class Test2 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("将字符串转换为字符数组后的结果：");
        char[] charArray = str.toCharArray();   // 将字符串转换为字符数组
        for(int i = 0;i < charArray.length;i++){
            if (i != charArray.length - 1) {
                // 如果不是数组的最后一个元素，就输出数组元素后面跟一个逗号
                System.out.print(charArray[i] + ",");
            } else {
                // 如果是数组的最后一个元素，就输出数组元素后面不跟逗号
                System.out.println(charArray[i]);
            }
        }
        System.out.println("将int值转换为String类型之后的结果：" + String.valueOf(12));
        System.out.println("将字符串转换成大写之后的结果：" + str.toUpperCase());
        System.out.println("将字符串转换成小写之后：" + str.toLowerCase());
    }
}