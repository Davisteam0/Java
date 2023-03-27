public class Test2 {
    public static void main(String[] args){
    int [] arr = {1,2,3,4,5};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //在Java当中，关于数组的一个长度属性，length
        //调用方式：数组名.length
        //System.out.println(arr.length);

        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        //扩展：
        //自动快速生成数组的遍历方式
        //idea提供
        //数组名.fori

        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
