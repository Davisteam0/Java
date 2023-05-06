package JavaAPI;

public class Test5 {
    public static void main(String[] args) {
        String str = "武汉-青岛-深圳";
        //下面的代码将字符串str以"-"进行分割
        System.out.println("将字符串以-进行分割的结果如下所示：");
        System.out.println("从第5个字符截取到末尾的结果：" + str.substring(4));    // 截取字符串str从索引5开始到末尾的子串
        System.out.println("从第5个字符截取到第6个字符的结果：" + str.substring(4, 6)); // 截取字符串str从索引5开始到索引7之间的子串
        //下面是字符串分割操作
        System.out.println("将字符串以-进行分割的结果如下所示：");
        String[] strArray = str.split("-");         // 将字符串str以"-"进行分割
        for(int i = 0;i < strArray.length;i++){
            if (i != strArray.length - 1) {
                // 如果不是数组的最后一个元素，就输出数组元素后面跟一个逗号
                System.out.print(strArray[i] + ",");
            } else {
                // 如果是数组的最后一个元素，就输出数组元素后面不跟逗号
                System.out.println(strArray[i]);
            }
        }
    }
}
