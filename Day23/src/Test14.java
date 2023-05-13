import java.util.Arrays;
public class Test14 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        Arrays.fill(arr,6);
        for(int i = 0;i < arr.length;i++) {
            System.out.println(i + ":" + arr[i]);
        }
    }
}
