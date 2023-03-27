import java.util.Random;

public class Test11 {
    public static void main(String[] args){
        //需求：定义以恶搞数组，存入1~5.要求i打乱数组中所有数据的顺序。

        /*难点：
          如何获取数组中的随机索引
          int [] arr = {1,2,3,4,5};

          Random r = new Random();
          int num = r.nextInt(5);

          System.out.println(num);

         */

        int [] arr = {1,2,3,4,5};

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(5);

            int temp = arr[1];
            arr[1] = arr[num];
            arr[num] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
