public class Test3 {
    public static void main(String[] args) {
        int [] arr1 = {9,10,22,68,99,100};
        int score = 23;
        int [] arr2 = new int [arr1.length + 1];
        for(int i = 0;i < 3;i++) {
            arr2[i] = arr1[i];
        }
        arr2[2] = score;
        for(int i = 3;i < arr2.length;i++) {
            arr2[i] = arr1[i - 1];
        }
        System.out.println("添加新元素之前的arr数组：");
        for(int i = 0;i < arr2.length;i++) {
            System.out.println(arr1[i] + ",");
        }
        System.out.println("");
        System.out.println("添加新元素之后的arr2数组：");
        for(int i = 0;i < arr2.length;i++) {
            System.out.println(arr2[i] + ',');
        }
    }
}
