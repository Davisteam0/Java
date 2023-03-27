public class Test1 {
    public static void main(String[] args) {
//        int x = 5;
//        if(x < 10){
//            x++;
//        }
//        System.out.println("x = " + x);

//        int x = 29;
//        if(x % 2 == 0){
//            System.out.println("x是一个偶数！");
//        }else{
//            System.out.println("x是一个奇数！");
//        }
//    }

//        int grade = 75;
//        if(grade > 80) {
//            //满足条件 grade > 80
//            System.out.println("该成绩为优秀！");
//        }else if(grade > 70) {
//            //不满足条件 grde > 80 ,但满足grde > 70
//            System.out.println("该成绩为良好！");
//        }else if(grade > 60) {
//            //不满足条件grade > 70 但满足条件grade > 60
//            System.out.println("该成绩为合格！");
//        }else if(grade > 50) {
//            //不满足条件grade > 60 但满足条件grade > 50
//            System.out.println("该成绩不合格！");
//        }

//        int x = 10;
//        int y = 20;
//        int max;
//        if(x > y){
//            max = x;
//        }else{
//            max = y;
//        }
//        System.out.println(max);

//        int x = 10;
//        int y = 20;
//        int max;
//        max = x > y ? x:y;
//        System.out.println(max);

/*
        int week = 5;
        switch(week){
            case 1 :
                System.out.println("今天是周一,工作日");
                break;
            case 2:
                System.out.println("今天是周二,工作日");
                break;
            case 3:
                System.out.println("今天是周三,工作日");
                break;
            case 4:
                System.out.println("今天是周四,工作日");
                break;
            case 5:
                System.out.println("今天是周五,工作日");
                break;
            case  6:
                System.out.println("今天是周六,休息日");
                break;
            case  7:
                System.out.println("今天是周天,休息日");
                break;
            default:
                System.out.println("您输入的数字不正确,请重试！");
                break;
        }
*/

/*
        int week = 5;
        switch(week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                //当week等于1，2，3，4，5中的任意一个时间时，处理方式相同
                System.out.println("今天是工作日！");
                break;

            case 6:
            case 7:
                //当week值为6，7中任意一个值时，处理方式一样
                System.out.println("今天是休息日！");
                break;

        }
 */

        /*
        int i = 0,x = 1;
        do{
            System.out.println("x=" + x);
            x++;
        } while (x <= 4);

         */

        /*
        int sum = 0;
        for(int i = 0;i <= 4;i++){
            sum += i;
        }
        System.out.println("sum = " + sum);

         */
//
//        int i,j;
//        for(i = 1;i <=9;i++){
//            for(j = 1;j <= i;j++){
//                System.out.println("*");
//            }
//            System.out.println("");
//        }

        /*
        int i,j;
        for(i = 1;i <= 9;i++) {
            if(i > 4) {
                break;
            }
            for(j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
         */

        /*
        int sum = 0;
        for(int i = 0;i <= 100;i++){
            if(i % 2 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("sum = " + sum);

         */

        int [] arr;
        arr = new int[3];
        System.out.println("arr[0]=" + arr[0]);
        System.out.println("arr[1]="+ arr[1]);
        System.out.println("arr[2]="+ arr[2]);
        System.out.println("数组的长度是:"+ arr.length);

    }
}
























