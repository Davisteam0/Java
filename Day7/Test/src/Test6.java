package Test.src;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
       // int i = 1;
       // while(i <= 100){
        //    System.out.println(i);
        //    i++;
       // }

        /*
            for循环和while循环的区别：
                for循环中，控制循环的变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被访问到了
                while循环中，控制循环的变量，对于while循环来说不归属于其语法结构中，在while循环结束后，该变量还可以继续使用
            for循环中:知道循环次数或者循环的范围
            while循环中:不知道循环的次数和范围，只知道循环的结束条件
         */

        /*
        int i = 0;
        for(;i < 4;i++){
            System.out.println(i);
        }

         */

        /*
        int i = 0;
        while(i < 4){
            i++;
        }
        System.out.println(i);
        */

        double height = 8844430;
        double paper = 0.1;
        int count = 0;
        while(paper < height){
            paper *= 2;
            count++;
        }
        System.out.println(count);
    }
}
