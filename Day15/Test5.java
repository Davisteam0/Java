public class Test5 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i =1;i <= 99;i += 2) {
            sum += i;
        }
        System.out.println("1+3+5+7+…+99奇数的和为：" + sum);
    }
}
