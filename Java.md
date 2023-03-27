#Java

##方法

####什么是方法？
    方法就是一段可以重复调用的代码。

####方法的语法格式：
```
修饰符 返回值类型 方法名 （参数类型 参数名1，参数类 型，参数名2，……）{
            执行语句
            return 返回值 ;
    }

```

####说明：
    修饰符：方法的修饰符比较多，例如对访问权限进行限定的修饰符、static修饰符、final 修饰符等。

    返回值类型：用于限定方法返回值的数据类型。

    参数名：是一个变量，用于接收调用方法时传入的数据。

    return关键字：用于返回方法指定类型的值并结束方法。

    返回值：被return语句返回的值，该值会返回给调用者。

####注意：

    方法中的“参数类型 参数名1,参数类型 参数名2 ……”称作参数列表,
    参数列表用于描述方法在被调用时需要接收的参数,
    如果不接受任何参数,则参数列表为空,即（）内不写任何内容。

    方法的返回值类型必须是方法声明的返回值类型。

    如果方法没有返回值，返回值类型要声明为void，此时方法中return语句可以省略。

####方法的重载

    参数不同的方法有着相同的名字，调用时根据参数不同确定调用哪个方法，这就是Java方法重载机制。

####数组

数组的定义：

    指一组类型相同的数据的集合，数组中的每个数据被称作元素。
    数组可以存放任意类型的元素，但同一组的元素数据类型必须相同。

#####数组的基本要素：

    数据类型 [ ] 数组名；

    数组名 = new 数据类型 [ 长度 ]；

    为了方便获取数组的长度，Java提供了一个length属性，
    在程序中可以通过“数组名.length”的方式获取数组的长度，即元素的个数。

#####数组的简单使用：

    数组被创建后，如果没有给数组元素赋值，
    则数组中的元素会被自动赋予一个默认值，
    根据元素类型的不同，默认初始值也是不一样的。

#####下列为不同数据类型定义数组的默认值：

    byte、short、int、long：0

    float、double：0.0

    char：一个空字符，即‘\u0000'

    boolean：false

    引用数据类型：null，表示变量不引用任何变量

#####注意：

    当你不想使用这些默认值时，可以为数组赋值。

    在定义数组时只指定数组的长度，由系统自动为元素赋初始值的方式称作动态初始化。

    在初始化数组时还有一种方式叫做静态初始化，就是在定义数组的同时为数组的每个元素赋值。

#####数组的静态初始化：

    类型 [ ] 数组名 = new 类型 [ ] {元素，元素……}；

    类型 [ ] 数组名 = {元素，元素，……}；

#####数组索引越界（ArrayIndexOutOfBoundsException)：

    数组是一个容器，存储到数组中的每个元素都有自己的自动编号，
    最小值为0，最大值为数组长度减1，如果要访问数组存储的元素，
    必须依赖于索引。在访问数组的元素时，索引不能超出0~length - 1的范围，否则程序会报错。

```数组索引越界（ArrayIndexOutOfBoundsException)
public class Example25 {
    publci static void main(String[] args) {
        int [] arr = new int [4];
        System.outprintln("arr[4] =" + arr[4]);
    }
}
```

```空指针异常（NullPorintException）
public class Example26 {
    public static void main(String[] args) {
        int [] arr = new int [3];
        arr [0] = 5;
        System.out.println("arr[0] = " + arr[0]);
        arr = null;
        System.out.println("arr[0] = " + arr[0]); 
    }
}
```

#### 数组的常见操作：

    1.数组的遍历：

    在操作数组时，经常需要依次访问数组中的每个元素，这种操作称作数组的遍历。
    由于数组中的元素较多，所以经常使用使用循环语句完成数组的遍历。
    在循环遍历数组时，使用数组索引作为循环条件，只要索引没有越界，就可以访问数组元素


    public class Example27 {
        public static void main(String[] args) {
            int [] arr = {1,2,3,4,5};    //定义数组
             //使用for循环遍历数组的元素
            for(int i = 1;i < arr.length;i++) {
                System.out.println(arr[i]);    //通过索引访问数组
            }
        }
    }
```

2.数组中最值的获取：

public class Exampl28 {
    public static void main(String[] args) {
        //定义一个int类型的数组
        int [] arr = {4,2,5,6,9,7,0};
        //定义变量max用于记住最大值，首先假设第一个元素为最大值
        int max = arr[0];
        //遍历数组，查找最大值
        for(int i = 1;i < arr.length;i++) {
            //比较arr[i]的值是否大于max
            if(arr[i] > max) {
                //条件成立，将arr[i]的值赋给max
                max = arr[i];
            }
        }
            System.out.println("数组arr中的最大值为:" + max);    //打印最大值
    }
}


3.数组的插入：

public class Example29 {
    public static void main(String[] args) {
        int [] arr = {10,12,14,16,18,19};
        int sorce = 13;
        //定义一个比arr数组长度大1的新数组
        int [] arr2 = new int [arr.length + 1];
        //将arr拆分成两部分，将13插入到拆分后的两个数组中间
        for(int i = 0;i < 3;i++) {      //循环将arr中前三个元素赋值给arr2数组的前三个位置。
            arr2[i] = arr[i];
         }
            arr2[2] = score;
            for(int i = 3;i < arr2.length;i++) {
                arr2[i] = arr[i-1];     //循环将arr中第2个到第6个元素赋值给arr2数组的第3个到第7个位置。
        }
            System.out.println("添加新元素之前的arr数组：");
            for(int i = 0;i < arr.length;i++) {
                System.out.println(arr[i] + ",");
        }
            System.out.println("");
            System.out.println("添加新元素之后的arr2数组：");
            for(int i = 0;i < arr2.length;i++) {
                System.out.println(arr2[i] + ",");
        }
    }
}
```

##### 4.数组排序：

    冒泡排序回溯：
    一：
        从第一个元素开始，依次对相邻的两个元素进行比较，
        直到最后两个元素完成比较。

        如果前一个元素比后一个元素大，则交换位置。
        整个过程完成后，数组中最后一个元素自然就是最大值。

    二：
        除了最后一个元素外，对剩余的元素进行两两比较过程与第一个步相似，
        这样就可以将数组中第二大的元素放在倒数第二的位置。

    三：
        以此类推，持续对越来越少的元素重复上面的步骤，直到没有任何一对元素需要为止。


#####代码实现：

    public class Example30 {
    public static void main(String[] args) {
        int [] arr = {9,8,3,5,2};
        //冒泡排序前,先循环打印数组元素
        for(int i = 0;i < arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
        //用于换行
        System.out.println();
        //进行冒泡排序
        //外层循环定义需要比较的轮数（两数对比,要比较n-1论）
        for(int i = 0;i < arr.length;i++) {
            //内层循环定义第i论需要比较的两个数
            for(int j = 0;j < arr.length - 1;j++) {
                if(arr[j] > arr[j]) {
                    //比较相邻元素
                    //下面3行代码用于交换相邻两个元素
                    int temp = arr[j];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //完成冒泡排序后，再次循环打印数组元素
        for(int i = 0;i < arr.length;i++) {
            System.out.println(arr[i] + " ");
            }
        }
    }


#####二维数组：

```

    二维数组定义方式：
    第一种：
        数据类型 [][] 数组名 = new 数据类型 [行数] [列数];

        int [][] arr = new int [3][4];    #定义一个3行4列的二维数组
    第二种：
        数据类型 [][] 数组名 = new int [行数][];

        int [][] arr = new int [3][];

    第三种：

        数据类型 [][] 数组名 = {{第0行初始值},{第1行初始值},……,{第n行初始值}};

        int [][] arr = {1,2},{3,4,5,6},{7,8,9};

        二维数组中元素的访问也是通过索引的方式进行的
```


####面向对象（上）

#####面向对象的特性：

    1.封装性

    2.继承性

    3.多态性

#####类与对象：
    类：类似于团体或群体

    对象：具体的人或事物

    类的定义：

        类是对象的抽象，用于描述一组对象的共同特征和行为。

        类中可以定成员变量和成员方法。

        成员变量：描述对象的特征。

        成员对象：称作对象的属性

        成员方法：用于描述对象的行为，可简称为方法。


##### 类的定义

    语法:
        class 类名 {
            成员变量；
            成员方法；
        }

#####示例：
    class Student {
        String name;
        int age;
        String sex;
        //定义read方法（）
        void read() {
            System.out.println("大家好,我是" + name + ",我在看书！"); 
        }
    }
   
##### 代码说明：
    在上述示例中定义了String类。其中Student是类名，name，age、sex是成员变量，
    read（）是成员方法，在成员方法read（）中可以直接访问成员变量name。


#####注意：

    局部变量与成员变量的不同

        在Java中，定义在类中的变量称为成员变量，定义在方法中的变量称为局部变量。
        如果在某个方法中定义的局部变量与成员变量同名，这种情况是允许的，此时在方法中通过变量名访问的是局部变量，而非成员变量


```
class Student {
    int age = 30;
    void read() {
    int age = 50;
    System.out.println("大家好,我"+ age + 岁了,我在看书!");
  }
}
```

##### 代码说明：
    在上述代码中，在Student类的read（）方法中有一条打印语句，
    打印了变量age，此时打印的是局部变量age,也就是说，
    当有另一个程序调用read（）方法时，输出的age值为50，而不是30.


##### 对象的创建和使用：

```
类名 对象名 = null;
对象名 = new 类名;

类名 对象名 = new 类名（）;

Student stu = new Student();
```

##### 代码说明：
    上述代码中，new Student( ) 用于创建Student类的一个实例对象（称为Student 对象),
    Student stu 声明了一个Student 类的变量stu 。    
    运算符  = 将新创建的实例对象地址赋值给变量stu，变量stu引用的对象简称为stu对象。


```
class Student {
    String name;    //声明name属性
    void read() {
        System.out.println("大家好，我是" + name + ",我在看书！");
    }
}
public class Test2 {
    public static void main(String[] args) {
        Student stu = new Student();    //创建并实例化Student 对象
    }
}

```

##### 代码说明：
    上述代码在main（）方法中实例化了Student对象，对象名为stu。使用new关键字创建的对象在堆内存中分配空间。

    创建对象后，可以使用对象访问类中的某个属性或方法，对象属性和方法的访问通过点（.)运算符实现。

```
对象名.属性名
对象名.方法名
```

#####对象的引用传递:

```
class Student {
    String name;    //声明name属性
    int age;
    void read() {
        System.out.println("大家好，我是" + name + ",年龄" + age);
  }
}


class Test2 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu2 = stu1;
        stu1.name = "小明";
        stu1.age = 20;
        stu2.age = 50;
        stu1.read();
        stu2.read();
    }
}


#输出：
    大家好，我是小明,年龄50
    大家好，我是小明,年龄50


```


#####注意：
```
    一个栈内存空间只能指向一个堆内存空间。
    如果想要再指向其他堆内存空间，就必须先断开已有的指向，才能分配新的指向。

访问控制权限：
    在Java中，针对类、成员方法和属性，Java提供了4种访问控制权选，
    分别是private、default、protected和public。这四种访问控制按级别由低到高的次序。
    
4种访问控制权限具体介绍：
    1）private：
            私有访问权限。用于修饰类的属性和方法，也可以修饰内部类。
            类的成员一旦使用了private关键字修饰，则该成员只能在本类中访问。

    2）default：
            默认访问权限。如果一个类中的属性或方法没有任何访问权限声明，
            则该属性或方法就是默认访问权限，可以被本包中的其他类访问，但是不能被其他包的类访问。

    3）protected：
            受保护的访问权限。如果一个类中的成员使用了protected关键字修饰，
            则只能被本包及不同包的子类访问。

    4）public：
            公共访问权限。如果一个类中的成员使用了public关键字修饰，
            则该成员可以在所有类中被访问，不管是否在同一个包中。

    public calss Test {
        public int aa;                          // aa可以被所有的类访问
        protected boolean bb;                   // bb可以被所有的子类以及本包的类访问
        void cc() {                             // 默认访问权限，能在本包内访问
             System.out.println("包访问权限");
    }
        // private权限的内部类，即私有的类，只能在本类中访问
    private class InnerClass {
    }
}
```
 

##### 注意：
    外部类的访问权限只能是public或default，所以Test类只能使用public修饰符或者不写修饰符。
    局部成员是没有访问控制权限的，因为局部变量只能在其所在的作用域内起作用，不可能被其他类访问，
    如果在程序中对局部变量使用访问控制权限修饰符，编译器会报错。

    public class Test {
    void cc() {                                 // 默认访问权限,能在本包内使用
        public int aa;                          // 错误,局部变量没有访问控制权限
        protected boolean bb;                   // 错误,局部变量没有访问控制权限
        System.out.println("包访问权限");
        }
    }


##### Tip： Java程序的文件名
    如果一个源文件中定义的所以类都没有使用public修饰，那么这个源文件名可以是一切合法的文件名；
    如果一个源文件中定义了一个使用public修饰的类，那么这个源文件的文件名必须与public修饰的类名相同。

##### 封装性
```
为什么要封装：
    封装可以被认为是一道保护屏障，防止本类的代码和数据被外部类定义的代码随机访问。

```


    class Student {
        String name;                                    //声明name属性
        int age;                                        //声明age属性
        void read() {
            System.out.println("大家好，我是" + name + ",年龄" + age);
        }
    }

    public class Example {
        public static void main(String[] args) {
            Student stu = new Student();                //创建学生对象
            stu.name = "张三";                          //为对象的name属性赋值
            stu.age = -18;                              //为对象的age属性赋值
            stu.read();                                 //调用对象的方法
        }
    }


##### 如何实现封装：
    类的封装是指将对象的状态信息隐藏在对象内部，不允许外部程序直接访问对象的内部信息，
    而是通过该类提供的方法实现对内部信息的访问。

##### 封装的具体实现过程是：

        在定义一个类时，将类的属性私有化，即使用private关键字修饰类的属性。
        私有属性只能在它所在的类中被访问。
        如果外界想要访问私有属性，需要提供一些使用public修饰的公用方法，
        其中包括用于获取属性值的getXxx()方法（也称getter（）方法）
        和设置属性值的setXxx()方法（也称为setter方法）。

```


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
            if(age < 0) {
                System.out.println("您输入的年龄有误!");
            }else {
                this.age = age;
            }
        }

        public void read() {
            System.out.println("大家好，我是" + name + ",年龄" + age);
        }
    }

    public class Example {
        public static void main(String[] args) {
            Student stu = new Student();            //创建学生对象
            stu.setName("张三");                    //为对象的name属性赋值
            stu.setAge(-18);                        //为对象的age属性赋值
            stu.read();                             //调用对象的方法
        }
    }

```


#####代码说明：
    在上述代码中,使用private关键字将name属性和age属性声明为私有变量,
    并对外界提供公有的访问方法，其中，getName()方法和getAge()方法用于获取name属性和age属性的值,
    setName()方法和setAge()方法用于设置name属性和age属性的值。

    当调用setAge()方法传入一个负数，程序提示输入有误，age显示为初始值0.
    这是因为setAge()方法对参数age进行了判断，如果age小于0，会打印输入有误，
    age会采用初始值0（在Java中int类型的初始值为0）


##### 构造方法：
    构造方法（也称为构造器）是类的一个特殊对象时为这个对象的属性赋值，
    在类实例化对象时自动调用。

##### 定义构造方法
```
构造方法是一个特殊的成员方法，在定义时,有以下几点需要注意：
1）构造方法的名称必须与类名一致。
2）构造方法名称前不能有任何返回值类型的声明。
3）不能在构造方法中使用return返回一个值，但可以单独写return语句作为方法的结束。

```


##### 无参构造方法:
    ```
    public Student {
        public Student () {
            System.out.println("调用了无参构造方法");
        }
    }

    public class Example {
        public static void main(String[] args) {
            System.out.println("声明对象……");
            Student stu = null;                     //声明对象
            System.out.println("实例化对象...");
            stu = new Student();                    //实例化对象
        }
    }


#####有参构造方法:
    class Student{
    private String name;
    private int age;
    public Student(String n,int n) {
        name = n;
        age = a;
        System.out.println("调用了有参构造方法");
    }

    public void read() {
        System.out.println("我是:" + name + ",年龄:" + age);
        }
    }

    public class Example {
        public static void main(String[] args) {
            Student stu = new Student("张三",18);       //实例化Student对象
            stu.read();
        }
    }

##### 代码说明：
```
Student类中声明了私有属性name和age，并且定义了有参构造方法。
实例化Student对象，并传入参数"张三"和18，分别赋值给name和age，该过程会调用有参构造方法，最后一行代码通过stu对象调用了read()方法。

```


##### 构造方法的重载:

    与普通方法一样，构造方法也可以重载，在一个类中可以定义多个构造方法，
    但是要求每个构造方法的参数类型或者参数个数不同。在创建对象时，可以通过调用不同的构造方法为不同的属性赋值。

```

    class Student {
        private String name;
        public int age;
        public Student() {}
        public Student (String n) {
            name = n;
            System.out.println("调用了一个参数的构造方法");
        }
        public Student(String n,int a) {
            name = n;
            age = a;
            System.out.println("调用了两个参数的构造方法");
        }
        public void read() {
            System.out.println("我是:"+ name + ",年龄：" + age);
        }
    }

    public class Example {
        public static void main(String[] args) {
            Student stu1 = new Student("张三");
            Student stu2 = new Student("张三",18);      //实例化Student对象
            stu1.read();
            stu2.read();
        }
    }

```
##### 代码说明：

    在Student类中定义了一个无参构造方法和两个有参构造方法。
    在main()方法中，代码实例化stu1和stu2对象时，根据实例化对象时传入参数个数的不同，
    stu1对象调用了只有一个参数的构造方法，stu2对象调用了有两个参数的构造方法


#####默认构造方法：
    在Java中的每个类都至少有一个构造方法。如果在一个类中没有定义构造方法，
    系统会自动为这个类创建一个默认的构造方法，这个默认的构造方法没有参数，
    方法体中没有任何代码，所以Java中默认的构造方法在程序运行时什么也不做。


下面的程序中，在Student类的两种写法效果是完全一样的 
第一种写法：

    class Student {
    }

第二种写法：

    public Student {
        public Student() {
        }
    }

##### 注意：

    对于第一种写法，类中虽然没有声明构造方法，
    但仍然可以用new Student() 语句创建Student类的实例对象，
    在实例化对象时调用默认构造方法。

    由于系统提供的默认方法往往不能满足需求，
    因此，通常需要程序员自己在类中定义构造方法，
    一旦为类定义了构造方法，系统就不再提供默认的构造方法了。



#####示例：
    class Student {
        int age;
        public Student(int n) {
            age = n;
        }
    }

    public class Example {
        public static void main(String[] args) {
            Student stu = new Student();        //实例化Studnet对象
        }
    }

##### 说明：
    为了避免以上错误，在一个类中如果定义了有参构造方法，最好再定义一个无参构造方法。
    需要注意的是，构造方法通常使用public进行修饰


####3.5this关键字
    当成员变量与局部变量发生重名时,需要使用this关键字分辨成员变量与局部变量。

    主要作用：
        1）使用this关键字调用本类中的属性。
        2）使用this关键字调用成员方法。
        3）使用this关键字调用构造方法。

#####3.5.1使用this关键字调用本类中的属性
    当Java代码中某一变量的命名随意时,需要对类中的变量进行统一命名，例如都声明为age。但是这样做会导致成员变量和局部变量冲突。

```
class Student {
    private String name;
    private int age;
    //定义构造方法

    public Student(String name,int age) {
        name = name;
        age = age;
    }
    public String read() {
        return"我是:" + name + ",年龄:" + age;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Student stu = new Student("张三",18);
        System.out.println(stu.read());
    }
}

#输出：
    我是:null,年龄:0
```

#####说明：
    stu对象姓名为null,年龄为0,这表明构造方法中的赋值并没有成功,这是因为构造方法参数名称与对象成员变量名称相同,编译器无法确定哪个名称是当前对象的属性。为了解决这个问题,Java提供了关键字this指代当前对象,通过this可以访问当前对象的成员。

```
class Student {
    private String name;
    private int age;
    //定义构造方法

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public String read() {
        return"我是:" + name + ",年龄:" + age;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Student stu = new Student("张三",18);
        System.out.println(stu.read());
    }
}

#输出：
    我是:张三,年龄:18
```

#####3.5.2使用this关键字调用成员方法

```
class Studnet {
    public void openMouth() {
        
    }
    public void read() {
        this.openMouth();
    }
}

```

    上述代码中在read（）方法中使用this关键字调用了openMouth（）方法。需要注意的是此处的this关键字也可以省略不写

#####3.5.2使用this关键字调用构造方法

    构造方法在实例化对象时被Java虚拟机自动调用。在程序中不能像调用其他成员方法一样调用构造方法，但可以在一个构造方法中使用"this(参数1,参数2,...)"的形式调用其他的构造方法。

```

class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("调用了无参构造方法");
    }

    public Student (String name,int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public String read() {
        return "我是:" + name + ",年龄:" + age;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Student stu = new Student("张三",18);
        System.out.println(stu.read());
    }
}

#输出：
   调用了无参构造方法
    我是:张三,年龄:18 
```

```
使用this调用类的构造方法时应该注意：
    1）只能在构造方法中使用this调用其他的构造方法,不能在成员方法中通过this调用构造方法。
    2）在构造方法中,使用this调用其他的构造方法,不能在成员方法中通过this调用构造方法。

    public Student(String name) {
        System.out.println("有参构造方法被调用了");
        this(name);
    }

    3）不能在一个类中的两个构造方法中使用this互相调用。

    class Student {
        public Student() {
            this ("张三");
            System.out.print("有参构造方法被调用了。");
        }

        public Student (String name) {
            this();
            System.out.println("无参构造被调用了。");
        }
    }

```

####3.6代码块

    代码块,简单来讲就是用{}括起来的一段代码。根据位置及声明关键字的不同,代码块可以分为4种：普通代码块、构造块、静态代码块、同步代码块。

#####3.6.1普通代码块

```
public class Test1 {
    public static void main(String[] args) {
    {    int age = 18;
        System.out.println("这是普通代码块。age:" + age);
    }
    int age = 30;
    System.out.println("age:" + age);
    }
}

#输出：
    这是普通代码块。age:18
    age:30
```

    在Test1代码块中包含了main（）方法代码块,在main()方法中又定以了一个局部代码块,局部代码块对main（）方法进行了“分隔”,起到了限定作用域的作用。


3.6.2构造块
    构造块是直接在类定义中的代码。

```
class Student {
    String name;
    {
        System.out.println("我是构造块");
    }
    //构造方法
    public Student(){
        System.out.println("我是Student类的构造方法");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
    }
}

#输出：
    我是构造块
    我是Student类的构造方法
    我是构造块
    我是Student类的构造方法
```

#####结论：
    1）在实例化Student类对象stu1、stu2时,构造块先于构造方法执行。
    2）每当实例化一个Student类对象,都会在执行构造方法之前执行构造块。


####3.7static关键字
    在Java中,定义了一个static关键字,他用于修饰类的成员,如成员变量、成员方法以及代码块等,被static修饰的成员具备一些特殊性。
#####3.7.1静态属性
    如果在Java程序中使用static修饰属性,则该属性称为静态属性（也称全局属性）。静态属性可以使用类名直接访问,访问格式为：
        类名.属性名

```
class Student {
    String name;
    int age;
    String school = "A大学";
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void info() {
        System.out.println("姓名:" + this.name + ",年龄:" + this.age + ",学校:" + school);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",19);
        Student stu3 = new Student("王五",20);
        stu1.info();
        stu2.info();
        stu3.info();

        stu1.school = "B大学";
        System.out.println("修改stu1学校对象的学校信息为B大学后：");
        stu1.info();
        stu2.info();
        stu3.info();
    }
}

#输出：
    姓名:张三,年龄:18,学校:A大学
    姓名:李四,年龄:19,学校:A大学
    姓名:王五,年龄:20,学校:A大学
    修改stu1学校对象的学校信息为B大学后：
    姓名:张三,年龄:18,学校:B大学
    姓名:李四,年龄:19,学校:A大学
    姓名:王五,年龄:20,学校:A大学
```
#####3.7.2静态方法
    如果想要使用类中的成员方法,就需要先将这个类实例化。而在实际开发时,通用类名就可以直接调用某个方法,这时就需要使用静态方法,要实现静态方法,只需要在成员方法前加上static关键字。
    格式：
        类名.方法

    或
        实例对象名.方法

```
class Student {
    String name;
    int age;
    static String school = "A大学";
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void info() {
        System.out.println("姓名：" + this.name + ",年龄：" + this.age + ",学校：" + school);
    }
    public static String getSchool() {
        return school;
    }
    public static void setSchool(String s) {
        school = s;
    }
}
class Test1 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",19);
        Student stu3 = new Student("王五",20);
        stu1.info();
        stu2.info();
        stu3.info();
        stu1.school = "B大学";
        System.out.println("修改stu1学生对象的学校对象的学校信息为B大学后");
        stu1.info();
        stu2.info();
        stu3.info();
    }
}

#输出：
    姓名：张三,年龄：18,学校：A大学
    姓名：李四,年龄：19,学校：A大学
    姓名：王五,年龄：20,学校：A大学
    修改stu1学生对象的学校对象的学校信息为B大学后
    姓名：张三,年龄：18,学校：B大学
    姓名：李四,年龄：19,学校：B大学
    姓名：王五,年龄：20,学校：B大学
```

#####代码说明：
    这段代码定义了一个Student的类和一个Test1的类，其中Student类有name和age两个实例变量，以及一个静态变量school。Student类还有一个构造函数，一个实例方法info和两个静态方法getSchool和setSchool。info方法用于输出学生的姓名、年龄和学校信息，getSchool方法用于获取静态变量school的值，setSchool方法用于修改静态变量school的值。Test1类中的main方法，创建3个Student对象，并分别给其属性赋值，然后输出每个学生的信息。接下来，修改第一个学生对象stu1的静态变量school为"B大学"，然后再输出所有学生对象的信息。

    在运行时，会先输出三个学生对象的信息，其学校信息都为"A大学"，接着修改了stu1的学校信息为"B大学"，再输出所有学生对象的信息，可以发现修改stu1的学校信息为"B大学"后，所有对象的学校信息都变成了"B大学"，因为静态变量school是类变量，属于类，而不是属于对象，因此修改stu1对象的静态变量会影响Student类级别中的静态变量。

#####注意：
    静态方法只能访问静态成员。非静态成员需要先创建对象才能访问,即随着对象的创建,非静态成员才会分配内存。而静态方法在被调用时可以不创建任何对象。

#####3.7.3静态代码块
    在Java类中,用static关键字修饰的代码块称为静态代码块。当类被加载时,静态代码块就会执行,由于类只加载一次,所以静态代码块只执行一次,在程序中,通常使用静态代码块对类的成员变量进行初始化。


```
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

#输出：
    我是静态代码块
    我是构造代码块
    我是Student类的构造方法
    我是构造代码块
    我是Student类的构造方法
    我是构造代码块
    我是Student类的构造方法
```

#####代码说明：
    代码块的执行顺序为静态代码块->构造代码块->构造方法。static修饰代的代码块会随着class文件一同加载,属于优先级最高的代码块。

    需要注意的是上列代码中main()方法中创建了3个Student对象,但在3次实例化对象的加载中,静态代码块中的内容只输出了一次,这是因为静态代码块在类第一次使用时才会被加载,并且只被加载一次。









































































































































































































































