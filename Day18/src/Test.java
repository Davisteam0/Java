public class Test {
    public static void main(String[] args) {
        /*设计一个学生类Student
        1）Student类中包含姓名、成绩两个属性
        2）分别给这两个属性定义两个方法,一个方法用于设置值,另一个方法用于获取值
        3）Student类中定义一个无参构造方法和一个接收两个参数的构造方法，两个参数分别为姓名和成绩属性赋值；
        4）在测试类TestStudent中创建两个Student对象,一个使用无参的构造方法,然后调用方法给姓名和成绩赋值
          另一个使用有参的构造方法,直接给姓名和成绩赋值*/

        class Student {
            // 定义学生类
            private String name;    // 姓名
            private int score;     // 成绩

            public Student() {
                // 无参构造方法

            }

            public Student(String name, int score) {
                this.name = name;       // 有参构造方法
                this.score = score;     // 有参构造方法
            }

            public void setName(String name) {
                this.name = name;    // 设置姓名
            }

            public String getName() {
                return name;    // 获取姓名
            }

            public void setScore(int score) {
                this.score = score;    // 设置成绩
            }

            public int getScore() {
                return score;       // 获取成绩
            }
        }

        Student stu1 = new Student();   // 创建对象
        stu1.setName("涂磊");           // 调用方法
        stu1.setScore(90);            // 调用方法
        System.out.println("姓名：" + stu1.getName() + "，成绩：" + stu1.getScore());  // 调用方法

        Student stu2 = new Student("牛劲创", 80);      // 创建对象
        System.out.println("姓名：" + stu2.getName() + "，成绩：" + stu2.getScore()); // 调用方法


        class TestStudent {
            // 测试类
            public static void main(String[] args) {
                Student stu1 = new Student();
                stu1.setName("闯子");
                stu1.setScore(90);
                Student stu2 = new Student("Jane", 85);
            }
        }
    }
}

