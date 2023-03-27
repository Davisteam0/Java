import java.util.Random;

public class Test9 {
    public static void main(String[] args){
        /*
            需求：
            求出所有的数组的和
            所有数据的平均数
            统计有多少个数据比平均值小
         */

        int [] arr = new int[10];
        //把随机数存入到数组中
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            //把生成的随机数添加的数组当中
            //数组名[索引] = 数据

            arr[i] = num;
        }

        //求所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //循环得到每一个元素
            //并把元素累加到一起
            sum += arr[i];
        }
        System.out.println("数组中所有数据的和为：" + sum);

        //求所有数据的平均数
        int avg = sum / arr.length;
        System.out.println("在数组中平均数为：" + avg);

        //统计有多少个数据比平均数小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }

        //当循环结束之后，就表示我已经找到了所有的比平均数小的数据
        System.out.println("在数组中，一共有" + count + "个数据，比平均数小");

        //遍历数组，验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
