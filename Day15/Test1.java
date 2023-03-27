public class Test1 {
    public static void main(String[] args) {

        class Student{
            String name;
            int age = 30;
            String sex;
            //定义方法
            void read() {
                int age = 50;
                System.out.println("大家好,我是" + age + ",我在看书");
            }
        }
    }
}
