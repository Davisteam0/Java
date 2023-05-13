import java.util.Arrays;
public class Test13 {
    public static void main(String[] args) {
        int [] arr = {9,8,5,3,2};
        //复制一个指定范围的数组
        int [] copied = Arrays.copyOfRange(arr,1,7);
        for(int i = 0;i < arr.length;i++) {
            System.out.println(copied[i] + "");
        }
    }
}
