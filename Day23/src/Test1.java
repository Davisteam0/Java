/*
    1、定义抽象类A，成员包括：
    String类型成员变量strA，值为字符串“①这是抽象类A。”
    返回值类型为String的抽象方法 mA()；
    2、定义A的子类A1：
    实现A的抽象方法mA()，给strA赋值“②A的子类A1实现了A的抽象方法mA()。”并返回strA。
    新加成员方法 mA1()，给strA赋值“ ③这是A1的新成员方法mA1()。”并返回strA
    3、定义A的子类A2：
    实现A的抽象方法mA()，给strA赋值“ ④A的子类A2实现了A的抽象方法mA()。”并返回strA。
    4、定义测试类TestA，包含2个方法，即main方法和Aa方法。
    定义静态的Aa方法，其参数为A类型对象，在该方法中，按①②③④的顺序将strA字符串的值显示出来。要求：利用参数对象调用其成员方法mA()，并利用对象类型转换调用A1的新添加方法mA1()。
    在主方法main中，根据面向对象的多态性，利用A类的变量a1、a2分别引用A1、A2的构造方法创建的对象，并分别以对象a1、a2为参数，调用Aa方法
 */

abstract class A {  //抽象类
    String strA = "这是抽象类A.";    //成员变量
    abstract String mA();   //抽象方法
}

class A1 extends A {    //A的子类A1
    String mA() {   //实现A的抽象方法mA()
        strA = "A的子类A1实现了A的抽象方法mA().";  //给strA赋值
        return strA;    //返回strA
    }
    String mA1() {  //新加成员方法mA1()
        strA = "这是A1的新成员方法mA1().";  //给strA赋值
        return strA;    //返回strA
    }
    class A2 extends A {    //A的子类A2
        String mA() {   //实现A的抽象方法mA()
            strA = "A的子类A2实现了A的抽象方法mA().";  //给strA赋值
            return strA;    //返回strA
        }
    }
}
public class Test1 {    //测试类
    public static void main(String[] args) {
        A a1 = new A1();    //利用A1的构造方法创建对象
        A a2 = new A1().new A2();   //利用A2的构造方法创建对象
        Aa(a1); //调用Aa方法
        Aa(a2); //调用Aa方法
    }
    public static void Aa(A a) {    //Aa方法
        System.out.println(a.strA);
        if(a instanceof A1) {   //判断a是否为A1的实例
            System.out.println( ((A1)a).mA1()); //调用A1的新添加方法mA1()
        }
        System.out.println(a.mA()); //调用A的抽象方法mA()
    }
}
