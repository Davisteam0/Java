public class Test1 {
    public static void main(String[] args) {

        /*
            方法（method）是程序中最小的执行单元
            重复的代码、具有独立功能的代码可以抽取到方法中
            可以提高代码的复用性
            可以提高代码的可维护性

            最简单的方法定义和调用：
                格式：
                    public static void 方法名(){
                            方法体(就是打包起来的代码);
                    }

                范例：
                    public static void playGame (){
                            七个打印语句;
                    }
         */


        //调用方法
        playGame();

    }

            //定义一个方法
            public static void playGame(){
                System.out.println("选英雄");
                System.out.println("选天赋");
                System.out.println("开局");
                System.out.println("对线");
                System.out.println("单杀");
                System.out.println("对线结束");
                System.out.println("开c");
        }
    }
