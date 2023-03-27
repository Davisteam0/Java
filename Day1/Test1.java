public class Test1 {
    //主入口
    public static void main(String[] args){
        //初始车上没有乘客
        int count = 0;
        //第一站：上去了一位乘客
        //在原有的基础上 + 1
        count = count + 1;
        //第二站：上去了两位乘客,下来一位乘客
        count = count + 2 - 1;
        //第三站：上去了一位乘客,下来一位乘客
        count = count + 2 - 1;
        //第四站：下去了一位乘客
        count = count - 1;
        //第五站：上去了一位乘客
        count = count + 1;
        //请问：到终点，车上一共有多少名乘客？
        System.out.println(count);
    }
}
