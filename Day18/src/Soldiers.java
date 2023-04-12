import java.util.Scanner;

public class Soldiers {
    /*
    设计一个士兵类Soldier,并创建TestSoldiers类测试
    要求：
        1）创建士兵类,定义有一个String类型参数name,代表士兵的姓名,两个int类型变量x和y,
           分别表示士兵所在的坐标位置,x代表横坐标,y表示纵坐标。
        2）在士兵中定义一个带3个参数的构造方法,分别对应士兵的姓名、横坐标和纵坐标。
        3）在测试类中利用for循环创建5个士兵对象,每个士兵对象的姓名以及x,y坐标均通过控制台输入
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入士兵姓名：");
            String name = scanner.next();
            System.out.println("请输入士兵横坐标：");
            int x = scanner.nextInt();
            System.out.println("请输入士兵纵坐标：");
            int y = scanner.nextInt();
            Soldiers soldier = new Soldiers(name, x, y);
            System.out.println("士兵姓名：" + soldier.getName() + "，横坐标：" + soldier.getX() + "，纵坐标：" + soldier.getY());
        }
    }
        private String name;
        private int x;
        private int y;

        public Soldiers(String name, int x, int y){
            this.name = name;
            this.x = x;
            this.y = y;
        }

        public String getName () {
            return name;
        }

        public int getX () {
            return x;
        }

        public int getY () {
            return y;
        }
    }
