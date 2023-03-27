public class Test4 {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        //定义一个变量统计次数
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            //i表示数组里的每一个索引
            //arr[i] 表示数组里面的每一个元素
            //3.判断当前的元素是否为3的倍数，如果是那么统计变量就需要自增一次

            if(arr[i] % 3 ==0){
                count++;
            }
        }
        //
        System.out.println("数组中能被3整除的数字有" + count + "个");
    }
}
