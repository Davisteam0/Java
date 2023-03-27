public class Test3 {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};

        int sum = 0;
        //2.遍历数组得到每一个数据，累加求和
        for (int i = 0; i < arr.length; i++) {

            //i 依次表示数组里面的每一个索引
            //arr[i] 依次表示数组里面的每一个元素

            sum += i;
        }
        System.out.println(sum);
    }
}
