public class Test3 {
    public static void main(String[] args){

        /*
            default的位置和省略：
            1.位置：default不一定是写在最下面的，我们可以写在任意位置，只不过习惯会写在最下面
            2.省略：default可以省略，语法不会有问题，但是不建议省略。
         */

        /*
            case穿透：
                语句体中没有写break语句
             执行流程：
                首先还是会拿小括号中的表达式的值跟下面每一个case进行匹配
                如果匹配上了，就会执行对应的语句体，如果此时发现了break，那么结束整个switch语句
                如果没有发现break，那么程序会继续执行下一个语句体，一直遇到break语句或者大括号结束为止。
         */

        /*
            switch的新特性：
                JDK12以上
         */

        /*
        int number = 100;
        switch(number){
            case 1:
                System.out.println("numbe的值为1");
                break;
            case 10:
                System.out.println("numbe的值为10");
                break;
            case 20:
                System.out.println("numbe的值为20");
                break;
            default:
                System.out.println("numbe的值不是1,10或者20");
                break;
        }

         */


        /*
        int num = 10;
        switch(num){
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            case 4:
                System.out.println("四");
                break;
            default:
                System.out.println("没有这种选项！");
                break;
        }
        */
 
        int num = 3;
        switch(num){
            case 1 ->{
                System.out.println("一");
            }
            case 2 ->{
                System.out.println("二");
            }
            case 3 ->{
                System.out.println("三");
            }
            case 4 ->{
                System.out.println("四");
            }
            default ->{
                System.out.println("没有这种选项！");
            }
        }
    }
}
