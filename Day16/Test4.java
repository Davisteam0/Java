import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //输入数据，求最大和最小值以及平均值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组的长度:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入数组的元素:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("最大值为:" + max);
        System.out.println("最小值为:" + min);
        System.out.println("平均值为:" + sum / n);
    }
}
