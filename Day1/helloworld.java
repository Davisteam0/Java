public class helloworld {
    //main方法,表示程序的入口
    public static void main(String[] args) {
        //输出语句（打印语句）
        System.out.println("hello ide!");
        //求数组的最大值
        int[] arr = {10,20,30,40,50,70,200,100};
        int max = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

    //单行注释

    /*
        多行注释
    */

    /**
    * 文档注释
    */




