//package API;
//
//import java.util.TreeSet;
//
//class Student implements  Comparable{
//    private String name;
//    private int age;
//    public Student (String name,int age) {
//        this.name = name;
//        this.age = age;
//    }
//    //定义
//    public int compareTo(Object obj) {
//        Student stu = (Student) obj;
//        //定义比较方式,先比较age,然后比较name
//        if (this.age - stu.age > 0) {
//            return -1;
//        }
//        if(this.age - stu.age == 0) {
//            return this.name.compareTo(stu.name);
//        }
//        return -1;
//    }
//}
//public class Test19 {
//    public static void main(String[] args) {
//        TreeSet ts = new TreeSet();
//        ts.add(new Student("Lucy",18));
//        ts.add(new Student("tom",20));
//        ts.add(new Student("Bob",20));
//        ts.add(new Student("Tom",20));
//        System.out.println(ts);
//    }
//}
