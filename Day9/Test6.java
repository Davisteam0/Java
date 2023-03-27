public class Test6 {
    public static void main(String[] args){
        String [] arr = new String[50];

        arr[0] = "zhangsan";
        arr[1] = "lisi";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //数组默认初始化的规律
        //整型类型：默认初始化值0
        //浮点型：默认初始化值0.0
        //字符型：默认初始化值'/u0000' 空格
        //布尔型：默认初始值 false
        //引用数据类型：默认初始值 null

        int [] arr2 = new int[3];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
