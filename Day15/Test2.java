class Student {
    String name;    //声明name属性
    int age;        //声明age属性
    void read() {
        System.out.println("大家好，我是" + name + ",年龄" + age);
    }
}
//public class Test2 {
//    public static void main(String[] args) {
//        Student stu = new Student();    //创建并实例化Student 对象
//    }
//}


class Test2 {
    public static void main(String[] args) {
        Student stu1 = new Student();         //创建stu1对象并实例化
        Student stu2 = new Student();        //创建stu2对象,但不对其进行实例化
        stu2 = stu1;                        //stu1和stu2分配空间使用权
        stu1.name = "小明";                 //为stu1对象的name属性赋值
        stu1.age = 20;
        stu2.age = 50;
        stu1.read();                     //调用对象的方法
        stu2.read();
    }
}