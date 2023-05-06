package API;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "姓名:" + this.name + ",年龄:" + this.age;
    }
    //下面定义的finalize()方法会在垃圾回收前被调用
    public void finalize() throws Throwable {
        System.out.println("对象被释放--->" + this);
    }
}
public class Test3 {
    public static void main(String[] args) {
        //创建Person对象
        Person p = new Person("张三",20);
        //将变量置为null,让对象p成为垃圾
        p = null;
        //调用gc()方法进行垃圾回收
        System.gc();
        for(int i = 0;i < 1000000;i++) {
            //为了延长程序运行的时间,执行空循环
        }
    }
}
