public class Test1 {
    public static void main(String[] args){
        int [] arr1 = new int [] {11,12,13,14,15};
        int [] arr = {11,12,13,14,15};
        System.out.println(arr1);

        //扩展：
        //[表示数组
        //D：表示数字里的元素都是int类型的
        //@：表示一个间隔符号（固定格式）
        //776ec8df 才是数组真正的地址值

        arr[0] = 1000;
        System.out.println(arr[0]);
    }
}

