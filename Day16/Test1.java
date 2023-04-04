//class Student {
//    private String name;
//    private int age;
//    //定义构造方法
//
//    public Student(String name,int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public String read() {
//        return"我是:" + name + ",年龄:" + age;
//    }
//}
//
//public class Test1 {
//    public static void main(String[] args) {
//        Student stu = new Student("张三",18);
//        System.out.println(stu.read());
//    }
//}

//
//class Studnet {
//    public void openMouth() {
//
//    }
//    public void read() {
//        this.openMouth();
//    }
//}


//class Student {
//    private String name;
//    private int age;
//
//    public Student() {
//        System.out.println("调用了无参构造方法");
//    }
//
//    public Student (String name,int age) {
//        this();
//        this.name = name;
//        this.age = age;
//    }
//
//    public String read() {
//        return "我是:" + name + ",年龄:" + age;
//    }
//}
//
//public class Test1 {
//    public static void main(String[] args) {
//        Student stu = new Student("张三",18);
//        System.out.println(stu.read());
//    }
//}


//public class Test1 {
//    public static void main(String[] args) {
//    {    int age = 18;
//        System.out.println("这是普通代码块。age:" + age);
//    }
//    int age = 30;
//    System.out.println("age:" + age);
//    }
//}

//class Student {
//    String name;
//    {
//        System.out.println("我是构造块");
//    }
//    //构造方法
//    public Student(){
//        System.out.println("我是Student类的构造方法");
//    }
//}
//
//public class Test1 {
//    public static void main(String[] args) {
//        Student stu1 = new Student();
//        Student stu2 = new Student();
//    }
//}

//class Student {
//    String name;
//    int age;
//    String school = "A大学";
//    public Student(String name,int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public void info() {
//        System.out.println("姓名:" + this.name + ",年龄:" + this.age + ",学校:" + school);
//    }
//}
//
//public class Test1 {
//    public static void main(String[] args) {
//        Student stu1 = new Student("张三",18);
//        Student stu2 = new Student("李四",19);
//        Student stu3 = new Student("王五",20);
//        stu1.info();
//        stu2.info();
//        stu3.info();
//
//        stu1.school = "B大学";
//        System.out.println("修改stu1学校对象的学校信息为B大学后：");
//        stu1.info();
//        stu2.info();
//        stu3.info();
//    }
//}

//
//class Student {
//    String name;
//    int age;
//    static String school = "A大学";
//    public Student(String name,int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public void info() {
//        System.out.println("姓名：" + this.name + ",年龄：" + this.age + ",学校：" + school);
//    }
//    public static String getSchool() {
//        return school;
//    }
//    public static void setSchool(String s) {
//        school = s;
//    }
//}
//class Test1 {
//    public static void main(String[] args) {
//        Student stu1 = new Student("张三",18);
//        Student stu2 = new Student("李四",19);
//        Student stu3 = new Student("王五",20);
//        stu1.info();
//        stu2.info();
//        stu3.info();
//        stu1.school = "B大学";
//        System.out.println("修改stu1学生对象的学校对象的学校信息为B大学后");
//        stu1.info();
//        stu2.info();
//        stu3.info();
//    }
//}


class Student {
    String name;
    {
        System.out.println("我是构造代码块");
    }
    static {
        System.out.println("我是静态代码块");
    }
    public Student() {
        System.out.println("我是Student类的构造方法");
    }
}
    class Test1 {
    public static void main(String[] args) {
            Student stu1 = new Student();
            Student stu2 = new Student();
            Student stu3 = new Student();
        }
    }






