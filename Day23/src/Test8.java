import java.util.*;
class Student {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Student(String name,int age) {
        super();
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name = "+ name + ",age =" + age + "]";
    }
}
public class Test8 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getName().compareTo(s2.getName());
                return num == 0 ? num:s1.getAge() - s2.getAge();
            }
        });
        tm.put(new Student("张三",23),"北京");
        tm.put(new Student("李四",13),"上海");
        tm.put(new Student("王五",43),"深圳");
        tm.put(new Student("赵六",33),"广州");
        Set keySet = tm.keySet();
        Iterator it = keySet.iterator();
        while(it.hasNext()) {
            Object key = it.next();
            Object value = tm.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
