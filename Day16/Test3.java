import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        //输入数据,然后进行冒泡排序
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组的长度:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入数组的元素:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("排序前的数组为:");
        System.out.println(Arrays.toString(arr));
        //冒泡排序
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("排序后的数组为:");
        System.out.println(Arrays.toString(arr));
    }
}

