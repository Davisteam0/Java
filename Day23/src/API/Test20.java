package API;

import java.util.Comparator;
import java.util.TreeSet;

class Student {
    private String id;
    private String name;
    public Student (String id,String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    //重写toString()方法
    public String toString() {
        return id + ":" + name;
    }
}
public class Test20 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {      //重写
                Student stu1 = (Student) o1;
                Student stu2 = (Student) o2;
                if(! stu1.getId().equals(stu2.getId())) {
                    return stu1.getId().compareTo(stu2.getId());
                }
                else {
                    return stu1.getName().compareTo(stu2.getName());
            }
        }
    });
        ts.add(new Student("2","Mary"));
        ts.add(new Student("1","Jack"));
        ts.add(new Student("3","Lisa"));
        ts.add(new Student("2","Lily"));
        System.out.println(ts);
    }
}
