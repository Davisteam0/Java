//public class Test1 {
//    public static void main(String[] args) {
//        int [] arr = {9,8,3,5,2};
//        //冒泡排序前,先循环打印数组元素
//        for(int i = 0;i < arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
//        //用于换行
//        System.out.println();
//        //进行冒泡排序
//        //外层循环定义需要比较的轮数（两数对比,要比较n-1论）
//        for(int i = 0;i < arr.length;i++) {
//            //内层循环定义第i论需要比较的两个数
//            for(int j = 0;j < arr.length - 1;j++) {
//                if(arr[j] > arr[j + 1]) {
//                    //比较相邻元素
//                    //下面3行代码用于交换相邻两个元素
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        //完成冒泡排序后，再次循环打印数组元素
//        for(int i = 0;i < arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}


    public class Test1 {
        public static void main(String[]args){
            int [][] arr = new int[3][];
            arr[0] = new int [] {11,12};
            arr[1] = new int [] {21,22,23};
            arr[2] = new int [] {31,32,33,34};
            int sum = 0;
            for(int i = 0;i < arr.length;i++) {
                int groupSum = 0;
                for(int j = 0;j < arr.length;j++) {
                    groupSum = groupSum + arr[i][j];
                }
                sum += groupSum;
                System.out.println("第" + (i + 1) + "小组销售额为：" + groupSum + "万元。");
            }
            System.out.println("总销售额为:" + sum + "万元。");
        }
    }