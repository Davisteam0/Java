public class Test5 {
    public static void main(String[] args) {
        int [][] arr = new int[3][];
        arr [0] = new int [] {11,12};
        arr [1] = new int [] {21,22,23};
        arr [2] = new int [] {31,32,33,34};
        int sum = 0;
        for(int i = 0;i < arr.length;i++) {
            int groudSum = 0;
            for(int j = 0;j < arr[i].length;j++) {
                groudSum = groudSum + arr[i][j];
            }
            sum = sum + groudSum;
            System.out.println("第" + (i + 1) + "小组销售额为:" + groudSum + "万元。");
        }
        System.out.println("总销售额为:" + sum + "万元。");
    }
}
