//package API;
//
//import java.util.*;
//
//class Student {
//    private String id;
//    private String name;
//    public Student (String id,String name) {
//        this.id = id;
//        this.name = name;
//    }
//    //重写toString类
//    public String toString() {
//        return id + ":" +name;
//    }
//    //重写hashCode()类
//    public int hashCode() {
//        return id.hashCode();
//    }
//    //重写equals()
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (!(obj instanceof Student)) {
//            return false;
//        }
//        Student stu = (Student) obj;
//        boolean b = this.id.equals(stu.id);
//        return b;
//    }
//}
//public class Test16 {
//    public static void main(String[] args) {
//        HashSet hs = new HashSet();
//        Student stu1 = new Student("1","张三");
//        Student stu2 = new Student("2","李四");
//        Student stu3 = new Student("2","李四");
//        hs.add(stu1);
//        hs.add(stu2);
//        hs.add(stu3);
//        System.out.println(hs);
//    }
//}
