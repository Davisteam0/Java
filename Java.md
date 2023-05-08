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

###第四章面向对象(下)

####4.1继承
#####4.1.1继承的概念
    在程序中,继承描述的是事物之间的从属关系,通过继承可以使多种事物之间形成一种关系体系。

    在Java程序中,如果想要声明一个类继承另一个类,需要使用extends关键字,其语法格式为：

    class 父类 {
        ……
    }
    class 子类 extends 父类 {

    }


```
//定义Animal类
class Animal {
    private String name;        //声明name属性
    private int age;            //声明age属性
    public final String COLOR = "粉色";        //定义COLOR属性
    public String getName() {                 //定义name属性的getter方法
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {           //定义age属性的getter方法
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
//定义Dog类继承Animal类
class Dog extends Animal {
    //此处不写任何代码
}
//定义测试类
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();            //创建一个Dog类的对象
        dog.setName("牧羊犬");          //此时调用的是父类Animal的setter方法
        dog.setAge(3);                 //此时调用的是父类Animal的setter方法
        System.out.println("名称："+dog.Name()+",年龄："+dog.getAge()+",颜色："+dog.COLOR);
    }
}

```

####代码说明：
    第2~18行代码定义了一个Animal类。第20~22行代码定义了一个Dog类,Dog类通过extends关键字继承了Animal类,这样Dog类便成了Animal类的子类。
    Dog类中并没有定义任何属性和方法。因为父类Animal中name属性和age属性使用private关键字修饰,即name属性和age属性为Animal类的私有属性,所以需要使用getter方法和setter方法访问。第26~28行代码在main()方法中创建了一个Dog类的对象dog并使用实例对象dog访问父类Animal中name和age属性的setter方法设置名称、年龄的值。第29、30行代码通过dog对象访问父类Animal中name属性和age属性的getter方法获取名称、年龄的值,通过dog对象直接访问了Animal类中非私有属性COLOR获取颜色的值。

    子类除了可以继承父类的属性和方法,也可以定义自己的属性和方法。

```
//定义Animal类
class Animal {
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
}
//定义Dog类继承Animal类
class Dog extends Animal {
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
//定义测试类
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName('牧羊犬');
        dog.setAge(3);
        dog.setColor("粉色");
        System.out.println("名称:"+dog.getName()+",年龄:"+dog.getAge()+",颜色:"+dog.getColor());
    }
}
```

####代码说明：
    Dog类不仅继承了Animal类的属性和方法,还增加了color属性及对应的getter和setter方法。在main()方法中,第32、33行代码通过dog对象调用Animal类的setter方法设置名称和年龄;第34行代码通过dog对象调用Dog类的setter方法设置颜色;第35、36行代码通过dog对象调用Animal类和getter方法获取名称、年龄和颜色。

    需要注意的是,子类虽然可以通过继承访问父类的成员和方法,但不是所以的父类属性和方法都可以被子类访问。子类只能通过访问父类中用public和protected修饰的属性和方法,父类中被默认修饰符default和privat修饰的属性和方法不能被子类访问。

    在类的继承中,需要注意一些问题：
        1)在Java中,类只支持单继承,不允许多继承。也就是说,一个类只能有一个直接父类

        class A {}
        class B {}
        class C extends A,B {}

        2）多个类可以有共同的父类

        class A {}
        class B extends A{}
        class C extends A{}

        3）在Java中,多层继承也是可以的,即一个类的父类可以再继承另外的父类。

        class A {}
        class B extends A {}
        class C extends B {}

        4)在Java中,子类和父类是相对的,一个类可以是相对的,一个类可以是某个类的父类,也可以是另一个类的子类


####4.1.2方法的重写

    在继承关系中,子类会自动继承父类中定义的方法,但有时在子类中需要对继承的方法进行一些修改,即对父类的方法进行重写。在子类中重写的方法需要和父类中被重写的方法具有相同的方法名、参数列表以及返回值类型。

```
//定义Animal类
class Animal {
    //定义动物叫的方法
    void shout() {
        System.out.println("动物发出叫声");
    }
}
//定义Dog类继承Animal类
class Dog extends Animal {
    //重写父类的shout()方法
    void shout()方法 {
        System.out.println("汪汪汪……");
    }
}
//定义测试类
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
    }
}
```

####代码说明：
    第2~7行代码定义了Animal类,并在Animal类中定义了shout()方法。第9~14行代码定义了Dog类继承Animal类,在Dog类中重写了父类Animal的shout()方法。第18~19行代码创建并实例化了Dog类对象dog,并通过dog对象调用了shout()方法。

    注意：
        子类重写父类的方法时,不能使用比父类的方法更严格的访问权限。例如父类的方法是public权限,子类的方法就不能是private权限。如果子类在重写父类的方式定义的权限更严格,则在编译时将出现错误。

```
//定义Animal类
class Animal {
    //定义动物叫的方法
    public void shout() {
        System.out.println("动物发出叫声");
    }
}
//定义Dog类继承Animal类
class Dog extends Animal {
    //重写父类的shout() {
        System.out.println("汪汪汪……");
    }
}
//定义测试类
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
    }
}
```

####代码说明：
    第4~6行代码在Animal类中定义了一个访问权限为public的shout()方法,第9~14行代码定义了一个Dog类并继承Animal类,Dog类重写了父类的Animal的shout()方法,并将shout()方法的访问权限设置为private。


    控制台打印了"汪汪汪····",调用的是Dog类的shout()方法中的输出语句,说明dog对象调用的是Dog子类重写的shout()方法,而不是父类中的shout()方法。

    注意：子类重写父类方法时的访问权限
        子类重写父类的方法时,不能使用比父类更严格的访问权限。例如,父类的方法是public权限,子类的方法就不能是private权限。如果子类在重写父类的方式时定义的权限更严格,则在编译时将出错。

    下面对上述代码进行修改。

```
//定义Animal类
class Animal {
    //定义动物的叫的方法
    public void shout() {
        System.out.println("动物发出叫声");
    }
}
//定义Dog类继承Animal类
class Dog extends Animal {
    //重写父类Animal 的shout()方法
    private void shout() {
        System.out.println("汪汪汪······")
    }
}
//定义测试类
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
    }
}
```

    在上述代码中,在4~6行代码在Animal类中定义了一个访问权限为public的shout()方法,第9~14行代码定义了一个Dog类并继承Animal类,Dog类重写了父类Animal的shout()方法,并将shout()方法的访问权限设置为private。

    运行该代码,编译器会编译错误"com.itheima.Dog中的shout()无法覆盖com.itheima.Animal中的shout()",这是因为子类重写父类方法时不能使用比父类中被重写的方法更严格的访问权限。

####4.1.3super关键字
    当子类重写父类的方法后,子类对象将无法访问父类中被子类重写过的方法。为了解决这个问题,Java提供了super关键字,使用super关键字可以在子类中访问父类的非私有方法、非私有属性以及构造方法。

    1）使用super关键字访问父类的非私有属性或调用父类的非私有方法。
    super.属性
    super.方法(参数1,参数2,……)

```
//定义Animal类
class Animal {
    String name = "牧羊犬";
    //定义动物叫的方法
    void shout() {
        System.out.println("动物发出的叫声")
    }
}
//定义Dog类继承Animal类
class Dog extends Animal {
    //重写父类Animal的shout()方法,扩大了访问权限
    public void shout() {
        super.shout();
        System.out.println("汪汪汪······");
    }
    public void prinlnName() {
        System.out.prinltn("名字:"+ super.name");
    }
}
//定义测试类
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
        dog.printName();
    }
}
```

    在上述代码中,第2~8行代码定义了Animal类,并在Animal类中定义了name属性和shout()方法。第10~19行代码定义了Dog类,它继承了Animal类并重写了Animal类的shout方法。在Dog类的shout()方法中使用super.shout()调用了父类的shout()方法。在printName()方法中使用super.name访问了父类的成员变量name。

    2）使用super关键字调用父类中的指定的构造方法
    super(参数1,参数2,……)

```
//定义Animal
class Animal {
    private String name;
    private int age;
    public Animal (String name,int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
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
    public String info() {
        return "名称：" + this.getName() +",年龄：" + this.getAge();
    }
}
//定义Dog类继承Animal类
class Dog extends Animal {
    private String Animal {
        private String color;
        public Dog(String name,int age,Stirng color) {
            super(name,age);
            this.setColor(color);
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        //重写父类的info()方法
        public String info() {
            return super.info() + ",颜色：" + this.getColor();
        }
    }
    //定义测试类
    public class Test {
        public static void main(String[] args) {
            Dog dog = new Dog("牧羊犬",3,"黑色");
            System.out.println(dog.info());
        }
    }
}
```
    
####代码说明
    第29行代码在Dog类中使用super调用了父类中有两个参数的构造方法,并传递了两个参数name和age;第39~41行代码在子类Dog中重写了父类Animal的info方法,然后在重写的info方法中使用super关键字调用了父类的Animal的info()方法,，用于获取父类的info()方法返回的name和age属性的值,最后使用getter方法获取本类中的color属性的值；第46、47行代码实例化了dog对象,并在打印语句中使用dog对象调用了Dog类中的info()方法,用于打印名称、年龄和颜色。

    控制台打印了"名称牧羊犬,年龄：3,颜色：黑色",说明子类Dog使用super成功调用了父类中有两个参数的构造方法,并传递了参数name和参数age的值,其其中,参数name的值为"牧羊犬",参数age的值为3。


    注意：
        通过super调用父类构造方法的代码必须位于子类构造方法的第一行,并且只能出现一次。

    super与this关键字的作用非常相似,都可以访问属性以及调用方法和构造方法,但是两者之间还是有区别的。

```
                                            super与this的区别
        区别点                  super                                       this
       访问属性        直接访问父类中的非私有属性           访问本类中的属性。如果本类中没有该属性,则从父类中继续查找

       调用方法        直接调用父类中的非私有方法           调用本类中的方法。如果本类中没有该方法,则从父类中继续查找

    调用构造方法            调用父类构造方法,              调用本类构造方法,必须放在构造方法的首行
                        必须放在子类构造方法的首行
```

    需要注意的是,this和super不可以同时出现,因为使用this和super调用方法的代码都要求必须放在构造方法的首行。


####4.2final关键字
    在默认情况下,所有成员变量和成员变量都可以被子类重写。如果父类的成员不希望被重写,可以在声明父类的成员时使用final关键字修饰。final有"最终"不可更改的含义。在Java中,可以使用final关键字修饰类、属性、方法。在使用final关键字时需要注意以下几点
    1）使用final关键字修饰的类不能有子类
    2）使用final关键字修饰的方法不能被子类重写
    3）使用final关键字修饰的变量是常量,常量不可修改。

####4.2.1final关键字修饰类
    Java中使用关键字修饰的类不可继承,也就是这样的类不能派生子类。

```
    //使用final关键字修饰Animal类
    final class Animal {

    }
    //Dog类继承Animal类
    class Dog extends Animal {

    }
    //定义测试类
    public class Test {
        public void main (String[] args) {
            Dog dog = new Dog();
        }
    }
```


####4.2.2final关键字修饰方法
    当一个类的方法被final关键字修饰后,该类的子类讲不能重写该方法。

```
//定义Animal类
class Animal {
    //使用final关键字修饰shout()方法
    public final void shout() {

    }
}
//定义Dog类继承Animal类
class Dog extends Animal {
    //重写Animal类的shout()方法
    public void shout() {

    }
    //定义测试类
    public class Test {
        public static void main(String[] args) {
            Dog dog = new Dog();        
        }
    }
}

```


####4.2.3final关键字修饰变量
    Java中被final修饰的变量为常量,常量只能在声明时被赋值一次,在后面的程序中,常量的值不能被改变。如果再次对final修饰的常量赋值,则程序会在编译时报错

```
public class Test {
    public static void main(String[] args) {
        final int AGE = 18;            //声明并初始化常量
        AGE = 20;            //再次被赋值会报错
    }
}

```

    在上述代码中,第3行代码使用final关键字修饰了一个int类型的变量AGE,说明AGE是一个常量,只能被赋值一次；第四行代码对AGE进行第二次赋值。


####4.3抽象类和接口

####4.3.1抽象类

   




















    1）使用final关键字修饰的类不能有子类
    2）使用final关键字修饰的方法不能被子类重写
    3）使用final关键字修饰的变量是常量,常量不可修改。

####4.2.1final关键字修饰类
    Java中使用关键字修饰的类不可继承,也就是这样的类不能派生子类。

```
    //使用final关键字修饰Animal类
    final class Animal {

    }
    //Dog类继承Animal类
    class Dog extends Animal {

    }
    //定义测试类
    public class Test {
        public void main (String[] args) {
            Dog dog = new Dog();
        }
    }
```


####4.2.2final关键字修饰方法
    当一个类的方法被final关键字修饰后,该类的子类讲不能重写该方法。

```
//定义Animal类
class Animal {
    //使用final关键字修饰shout()方法
    public final void shout() {

    }
}
//定义Dog类继承Animal类
class Dog extends Animal {
    //重写Animal类的shout()方法
    public void shout() {

    }
    //定义测试类
    public class Test {
        public static void main(String[] args) {
            Dog dog = new Dog();        
        }
    }
}

```


####4.2.3final关键字修饰变量
    Java中被final修饰的变量为常量,常量只能在声明时被赋值一次,在后面的程序中,常量的值不能被改变。如果再次对final修饰的常量赋值,则程序会在编译时报错

```
public class Test {
    public static void main(String[] args) {
        final int AGE = 18;            //声明并初始化常量
        AGE = 20;            //再次被赋值会报错
    }
}

```

    在上述代码中,第3行代码使用final关键字修饰了一个int类型的变量AGE,说明AGE是一个常量,只能被赋值一次；第四行代码对AGE进行第二次赋值。


####4.3抽象类和接口

####4.3.1抽象类
    定义一个类时,常常需要定义一些成员方法用于描述类的行为特征,但有时这些地方的实现方式是无法确定的。例如,前面定义的Animal类中的shout()方法用于描述动物的叫声,但是不同的动物叫声也不相同,因此在shout()方法中无法准确描述动物的叫声。

    针对上面描述的情况,Java提供了抽象方法来满足这种需求。抽象方法是使用abstract关键字修饰的成员方法,抽象方法在定义时不需要实现方法体。

    抽象方法的语法：
    abstract 返回值类型 方法名称(参数列表)

    当一个类包含了抽象方法,该类就是抽象类。抽象类和抽象方法一样,必须使用abstract关键字进行修饰。

    抽象类的语法格式：
    abstract class 抽象类名称 {
        属性;
        访问权限 返回值类型 方法名 (参数) {
            return [返回值];
        }
        访问权限abstract 返回值类型 抽象方法名称(参数)
    }

    从上面抽象类的语法格式中可以发现,抽象类的定义比普通类多了一个或多个抽象方法,其他地方与普通类的组成基本相同。
    抽象类：
        1)包含抽象方法的类必须是抽象类
        2）声明抽象类和抽象方法时都要使用abstract关键字修饰
        3）抽象方法只需要声明而不需要实现。
        4）如果一个非抽象类继承了抽象类之后,那么该类必须重写抽象类中的全部抽象方法。

```
# Dog.java
// 定义抽象类Animal
abstract class Animal {
    //定义抽象方法
    abstract void shout();
}

// 定义Dog类继承抽象类Animal
class Dog extends Animal {
    //重写抽象方法
    void shout() {
        System.out.println("汪汪……");
    }
}

// 定义测试类
public class TestDog {
    public static void main(String[] args) {
        Dog.dog = new Dog();
        dog.shout();
    }
}
```

#### 代码说明
    这段代码定义了一个抽象类Animal，其中包含一个抽象方法shout()。然后定义了一个Dog类继承Animal类，并重写了shout()方法。最后定义了一个测试类TestDog，创建了一个Dog对象并调用了shout()方法。

    注意：
        使用abstract关键字修饰的抽象方法不能使用private关键字修饰,因为抽象方法必须被子类实现,如果使用了private关键字修饰抽象方法,则子类无法实现该方法。


####4.3.2接口
    接口是一种用来定义程序的协议,它用于描述类或结构的一组相关行为。接口是由抽象类衍生的一个概念,并由此产生了一种编程方式,可以称这种编程方式为面向接口编程。面向接口编程就是将程序的不同的业务逻辑分离,以接口的形式对接不同的业务模块。

    接口中不实现任何业务逻辑,业务逻辑由接口的实现类完成。当业务需求变更时,只需要修改实现类中的业务逻辑,而不需要修改接口中的内容,以减
    少需求变更对系统产生的影响。

    在Java中,使用接口的目的是克服单继承的限制,因为一个类只能有一个父类,而一个类可以同时实现多个父接口。在JDK8之前,接口是由全局常量和抽象方法组成的。JDK8对接口进行了重新定义,接口中除了抽象方法外,还可以定义默认方法和静态方法,默认方法使用default关键字修饰,静态方法使用static关键字修饰,而且这两种方式都允许有方法体。

    接口使用interface关键字声明,语法格式：

    public interface 接口名 extends 接口1,接口2,…… {
        public static final 数据类型 常量名  = 常量;
        public abstract 返回值的数据类型 方法名（参数列表） {
            public default 返回值的数据类型 方法名 (参数列表) {
            }
        }
    }


    上述格式中,"extends 接口1,接口2……" 表示一个接口可以有多个父接口,父接口之间使用逗号分隔。接口中的变量默认使用public static final 进行修饰,即全局变量。接口中定义的抽象方法默认使用public abstract进行修饰。

    注意：
        在很多的Java程序中,经常看到编写接口中的方法时省略了public,有很多读者认为它的访问权限是default,这实际上是错误的。不管写不写访问权限,接口中方法的访问权限永远是public。

    接口本身不能直接实例化,接口中的抽象方法和默认方法只能通过接口实现类实例对象进行调用。实现类通过implements关键字实现接口,并且实现类必须重写接口中所有的抽象方法。需要注意的是,一个类可以同时实现多个接口,实现多个接口时,多个接口名需要使用英文逗号分隔开。

    修饰符 class 类名 implements 接口1 ,接口2,…… {
        ……
    }

```
// 定义接口Animal
interface Animal {
    int ID = 1;                       // 定义全局变量,编号
    String name = "柯基";              // 定义全局常量,名称
    void shout();                     // 定义抽象方法shout()
    public void info();               // 定义抽象方法info()
    static int getID() {              // 定义抽象方法getID(),用于返回ID值
        return Animal.ID;
    }
}
interface Action {
    public void eat();                  // 定义抽象方法eat()
}
// 定义Dog类实现Animal接口和Action接口
class Dog implements Animal,Action {
    //重写Action接口中的抽象方法eat()
    public void eat() {
        System.out.println("喜欢吃骨头");
    }
    // 重写Animal接口中的抽象方法info()
    public  void shout() {
        System.out.println("汪汪……");
    }
    // 重写Animal接口中的抽象方法shout()
    public  void info() {
        System.out.println("名称:" + name);
    }
}

public class Test2 {
    public static void main(String[] args) {
        System.out.println("编号:" + Animal.getID());
        Dog dog = new Dog();        // 创建Dog类的实例对象
        dog.info();                 // 调用Dog类中重写的info()方法
        dog.shout();                // 调用Dog类中重写的shout()方法
        dog.eat();                  // 调用Dog类中重写的eat()方法
    }
}

```

####代码说明
    代码定义了两个类和两个接口。

    第一个类是一个抽象类Animal，它有一个抽象方法shout()。第二个类叫做Dog，它扩展了Animal类并覆盖了shout()方法，以在控制台上打印“汪汪……”。TestDog类创建了一个Dog实例并调用了它的shout()方法。

    第一个接口叫做Animal，它有一个常量ID和一个常量name，以及两个抽象方法shout()和info()。第二个接口叫做Action，它有一个抽象方法eat()。Dog类实现了这两个接口并覆盖了它们各自的抽象方法。Test2类创建了一个Dog实例并调用了它的getID()、info()、shout()和eat()方法。

    总的来说，这段代码展示了在Java中使用抽象类和接口来为相关类定义共同的行为和功能


    需要注意的是,接口的实现类必须实现接口中的所有抽象方法,否则程序编译报错。

    如果在开发中的一个子类既要实现接口又要继承抽象类，则可按照以下语法格式定义子类：

    修饰符 class 类名 extends 父类名 implements 接口1,接口2,…… {
        ……
    }


```
# Test3.java
// 定义接口Animal
interface Animal {
    public String name = "哈士奇";
    public  void shout();
    public void info();
}
// 定义抽象类Action
abstract class Action {
    public abstract void eat();
}
// 定义Dog类继承Action抽象类,并实现Animal接口
class Dog extends Action implements Animal {
    //重写Action抽象类中的抽象方法eat()
    public void eat() {
        System.out.println("喜欢吃骨头");
    }
    // 重写Animal接口中的抽象方法shout()
    public void shout() {
        System.out.println("汪汪……");
    }
    // 重写Animal接口中的抽象方法info()
    public void info() {
        System.out.println("名称：" + name);
    }
}
// 定义测试类
public class Test3 {
    public static void main(String[] args) {
        Dog dog = new Dog();        // 创建Dog类的实例对象
        dog.info();                 // 调用Dog类中重写的info()方法
        dog.shout();                // 调用Dog类中重写的shout()方法
        dog.eat();                  // 调用Dog类中重写的eat()方法
    }
}


```

####代码说明
    这段代码定义了一个接口 Animal，其中包含了一个 name 属性和两个抽象方法 shout() 和 info()。接着定义了一个抽象类 Action，其中包含了一个抽象方法 eat()。最后定义了一个类 Dog，它继承了 Action 抽象类并实现了 Animal 接口。在 Dog 类中，重写了 Action 抽象类中的 eat() 方法和 Animal 接口中的 shout() 和 info() 方法。最后在 Test2 类中创建了 Dog 类的实例对象，并调用了 Dog 类中重写的 info()、shout() 和 eat() 方法。


    接口不允许继承抽象类,但是允许接口继承接口,并且一个接口可以同时继承多个接口。


```
# Test4.Java
// 定义接口Animal
interface Animal_1 {
    public String name = "金毛";
    public void info();
}
// 定义Color接口
interface Color {
    public void Golden();
}
// 定义Action接口,它同时继承Animal接口和Color接口
interface Action_1 extends Animal_1,Color {
    public void shout();
}
// 定义Dog类实现Action接口
class Dog_1 implements Action_1 {
    //重写Animal接口中的抽象方法info()
    public void info() {
        System.out.println("名称："+ name);
    }
    // 重写Color接口中的抽象方法black()
    public void Golden() {
        System.out.println("金色");
    }
    // 重写Action 接口中的抽象方法shout()
    public void shout() {
        System.out.println("汪汪……");
    }
}
//定义测试类
public class Test4 {
    public static void main(String[] args) {
        Dog_1 dog = new Dog_1();
        dog.info();
        dog.info();
        dog.Golden();
    }
}

```

####代码说明
    这段代码定义了三个接口和一个实现了Action1接口的Dog1类。Animal1接口中定义了一个name属性和一个info()方法，Color接口中定义了一个black()方法，Action1接口继承了Animal1和Color接口，并定义了一个shout()方法。Dog1类实现了Action1接口，并重写了其中的三个方法。在测试类Test4中，创建了一个Dog1对象，并调用了它的info()、black()方法。其中，info()方法输出了名称属性的值，black()方法输出了"金色"。

#### 4.4多态

#####4.4.1多态的描述
    多态是面向对象思想中的一个非常重要的概念。在Java中,多态是指不同类的对象在调用同一个方法表现出的多种不同行为。例如,要实现一个输出动物叫声的方法,由于每种动物的叫声是不同的,因此可以在方法中接收一个动物类型的参数,当传入猫类对象时就发出猫类的叫声,当传入狗类对象就发出狗类叫声。在同一个方法中,这种由于参数类型不同而导致执行效果不同的现象就是多态。Java中的多态主要有以下两种形式：
    1）方法的重载
    2）对象的多态（方法的重写）

```
# Test.java
// 对象的多态

//定义抽象类 Animal
abstract class animal {
    abstract void shout();
}
// 定义Cat类继承animal抽象类
class Cat extends animal {
    //重写shout() 方法
    public void shout() {
        System.out.println("喵喵……");
    }
}
// 定义Dog类继承animal抽象类
class Dog_ extends animal {
    //重写shout()方法
    public void shout() {
        System.out.println("汪汪……");
    }
}
// 定义测试类
public class Test5 {
}

```

####代码说明
    代码展示了Java中的多态性。首先定义了一个抽象类Animal，其中有一个抽象方法shout()。然后定义了两个类Cat和Dog，它们都继承了Animal类并重写了shout()方法。在测试类Test5中，创建了一个Cat类的对象an1和一个Dog类的对象an2，并将它们都转型为Animal类的对象。最后调用an1和an2的shout()方法，分别输出"喵喵……"和"汪汪……"。这是因为an1和an2虽然都是Animal类的对象，但它们实际上分别指向了Cat类和Dog类的对象，因此调用shout()方法时会分别调用它们各自的重写方法。


#####4.4.2对象类型的转换
对象类型转换主要分为两种情况：
    1）向上转型：子类对象->父类对象
    2）向下转型：父类对象->子类对象

    1.对象向上转型,父类对象可以调用子类重写父类的方法,这样当需要新添加功能时,只需要新增一个子类,在子类中对父类的功能进行扩展,而不用更改父类的代码,保证了程序的安全性。对于向上转型,程序会自动完成

    格式：

        父类类型 父类对象 = 子类实例;


```
# Test6.java

// 对象向上转型

// 定义animal类
class animal {
    public void shout() {
        System.out.println("喵喵……");
    }
}
// 定义Dog类
class Dog extends animal {
    // 重写shout()方法
    public void shout() {
        System.out.println("汪汪……");
    }
    public void eat() {
        System.out.println("吃骨头……");
    }
}
// 测试类
public class Test6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        animal an = dog;
        an.shout();
    }
}

```

####代码说明
    这段代码定义了一个animal类和一个Dog类，Dog类继承了animal类并重写了其中的shout()方法和新增了一个eat()方法。在Test6类中，创建了一个Dog类的实例对象dog，并将其转型为animal类的对象an，然后调用an对象的shout()方法，输出结果为"汪汪……"。这是因为Dog类重写了animal类中的shout()方法，所以调用an对象的shout()方法时，实际上调用的是Dog类中重写后的shout()方法。

    2.对象向下转型
    除了向上转型,对象还可以向下转型。向下转型一般是为了重新获得因为向上转型而丢失的子类特性。对象在进行向下转型前,必须先进行向上转型,否则将出现对象转换异常。

    在向下转型时,必须指明要转为的子类类型

    父类类型 父类对象 = 子类实例;
    子类类型 子类对象 = (子类)父类对象;


```
# Test7.java
# 对象向下转型
// 对象向下转型

//定义Animal类

public class Animal {
    public void shout() {
        System.out.println("动物叫");
    }
}
// 定义Dog类
class Dog extends Animal {
    // 重写shout方法
    public void shout() {
        System.out.println("汪汪汪");
    }
    public void eat() {
        System.out.println("吃骨头");
    }
}
// 测试类
public class Test1 {
    public static void main(String[] args) {
        Animal an = new Dog();  // 向上转型
        Dog dog = (Dog) an;     // 向下转型
        dog.shout();
        dog.eat();
    }
}


```

####代码说明

    这段代码定义了一个Animal类和一个Dog类，Dog类继承了Animal类并重写了其中的shout()方法和新增了一个eat()方法。在Test1类中，创建了一个Dog类的实例对象并将其向上转型为Animal类的对象an，然后将an对象向下转型为Dog类的对象dog，然后调用dog对象的shout()和eat()方法。

    向下转型的目的是为了重新获得因为向上转型而丢失的子类特性。但是，需要注意的是，只有在进行向上转型后才能进行向下转型，否则会抛出ClassCastException异常。

    以下是Java中执行向下转型的示例代码：
    
    父类类型 父类对象 = 子类实例;
    子类类型 子类对象 = (子类类型) 父类对象;
    
    在这个示例中，子类类型继承了父类类型。首先创建一个子类类型的实例并将其向上转型为父类类型的对象。然后将父类类型的对象向下转型为子类类型的对象。

    需要注意的是，向下转型应该仅在必要时并谨慎使用，否则可能会导致运行时错误。


#### instanceof关键字
    在Java中可以使用instanceof关键字判断一个对象是否是某个类（或接口）的实例,语法格式如下：

    对象 instanceof 类（或接口）


####Object类
    Java提供了Object类,它是所有类的父类,每个类都直接或间接继承了Object类,因此类通常被称为超类。当定义一个类,如果没有使用extends关键字为这个类显示地指定了父类,那么会默认继承Object类。Object类的常用方法

    Object类的常用方法

    boolean equals()        判断两个对象是否相等
    
    int hashCode()          返回对象的哈希值

    String toString()       返回对象的字符串表示形式


```
// 定义Animal
class Animal {
    // 定义动物叫的方法
    void shout() {
        System.out.println("动物叫！");
    }
}
// 定义测试类
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();               //创建Animal
        System.out.println(animal.toString());      //调用toString()方法并打印
    }
}
```

####代码说明：
    在这个示例中，子类类型继承了父类类型。首先创建一个子类类型的实例并将其向上转型为父类类型的对象。然后将父类类型的对象向下转型为子类类型的对象。

    需要注意的是，向下转型应该仅在必要时并谨慎使用，否则可能会导致运行时错误。

    此外，Java提供了Object类，它是所有类的父类，每个类都直接或间接继承了Object类，因此类通常被称为超类。当定义一个类，如果没有使用extends关键字为这个类显示地指定了父类，那么会默认继承Object类。Object类的常用方法包括equals()方法用于判断两个对象是否相等，hashCode()方法用于返回对象的哈希值，toString()方法用于返回对象的字符串表示形式。

    此外，Java中可以使用instanceof关键字判断一个对象是否是某个类


####4.6内部类
    在Java中,允许在一个类的内部定义类,这样的类称为内部类,内部类所在的类称为外部类。在实际开发中,根据内部类的位置、修饰符和定义方式的不同,内部类可分为4种,分别是成员内部类、局部内部类、静态内部类、匿名内部类。

#####4.6.1成员内部类
    在一个类的中除可以定义成员变量、成员方法,还可以访问外部类的所有成员,无论外部类的成员是何种访问权限。如果想通过外部类访问内部类,则需要通过外部类创建内部类对象。创建内部类对象的具体语法格式如下：
    
    外部类名 外部类对象 = new 外部类名();
    外部类名.内部类名 内部类对象 = 外部类对象.new 内部类名();

```
class Outer {
    int n = 0;
    //外部类方法test1()
    void test1() {
        System.out.println("外部类成员方法test1()");
    }
    //下面的代码定义了成员内部类Inner
    class Ineer {
        int n = 1;
        void show1() {
            //在成员内部类的方法中访问外部类的成员变量m
            System.out.println("外部类成员变量m = " + m);
            //在成员内部类的方法中访问外部类的成员方法test1();
            test1();
        }
        void show2() {
            System.out.println("内部类成员方法show2()");
        }
    }
    //外部类方法test2()
    void test2() {
        Inner inner = new Inner();
        System.out.println("内部类成员变量n = " + inner.n);
        inner.show2();
    }
}
public class Test {
    public static void main(String[] args) {
        Outer.outer = new Outer();
        Outer.Inner inner = Outer.new Inner();
        inner.show1();
        outer.show2();
    }
}

```

####代码说明
    这段代码定义了一个名为Outer的外部类和一个名为Inner的成员内部类。在Outer类中，定义了两个方法test1()和test2()，以及一个成员变量n。在Inner类中，定义了两个方法show1()和show2()，以及一个成员变量n。在main()方法中，创建了一个Outer类的实例outer和一个Inner类的实例inner，并分别调用了inner的show1()方法和outer的show2()方法。

    在show1()方法中，使用System.out.println()方法输出了Outer类的成员变量m和成员方法test1()的值。需要注意的是，m并没有在代码中定义，因此会导致编译错误。应该将m改为n，即System.out.println("外部类成员变量n = " + n);。

    在show2()方法中，使用System.out.println()方法输出了Inner类的成员方法show2()的值。

    因此，该代码的输出结果应该为：

    外部类成员变量n = 1
    外部类成员方法test1()
    内部类成员变量n = 1
    内部类成员方法show2()
    
####4.6.2局部内部类
    局部内部类类,也称为方法内部类,是指定义在某个局部范围中的类,它和局部变量都是在方法中定义的,有效方法只限于方法内部

    局部内部类可以访问外部类的所有成员变量和成员方法,而在外部类中无法直接访问局部内部类中的变量和方法。如果要在外部类中访问局部内部类的成员,只能在局部内部类的所属方法中创建内部类的对象,通过对象访问局部内部类的变量和方法。

```
class Outer {
    int m = 0;
    //定义一个成员变量test1()
    void test1() {
        System.out.println("外部类成员方法test1()");
    }
    void test2() {
        //定义一个局部内部类,在局部内部类中访问外部类变量和方法
        class Inner {
            int n = 1;
            void show() {
                System.out.println("外部类成员变量m = " + m);
                test1();
            }
        }
        //访问局部内部类中的变量和方法
        Inner inner = new Inner();
        System.out.println("局部内部类变量n = " + inner.n);
        inner.show();
    }
}
public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test2();  
    }
}
```

####代码说明
    这段代码并不是您提供的代码，但我会根据您提供的格式解释代码。

    第2~7行代码定义了一个名为Outer的外部类和一个名为Inner的局部内部类。在Outer类中，定义了两个方法test1()和test2()，以及一个成员变量n。在Inner类中，定义了一个方法show()和一个成员变量n。

    在test2()方法中，创建了一个Inner类的实例inner，并调用了inner的show()方法。在show()方法中，使用System.out.println()方法输出了Outer类的成员变量n和成员方法test1()的值。

    因此，该代码的输出结果应该为：

    局部内部类变量n = 1
    外部类成员变量n = 0
    外部类成员方法test1()
    

####4.6.3静态内部类
    静态内部类,就是使用了static关键字修饰的成员内部类。与成员内部类相比,在形式上,静态内部类只是在内部类前增加了static关键字,但在功能上,静态内部类只能访问外部类的静态成员,通过外部类访问静态内部类成员时,因为程序已经提前在静态常量区为静态内部类分配好了内存,所以即使静态内部类没有加载,依然可以通过外部类直接创建一个静态内部类对象

    创建静态内部类对象的基本语法格式：
    
    外部类名.静态内部类 变量名  = new 外部类名.静态内部类名();

```
class Outer {
    static int m = 0;
    //下面的代码定义了一个静态内部类
    static class Inner {
        int n = 1;
        void show() {
            //在静态内部类的方法中访问外部类的静态变量m;
            System.out.println("外部类静态变量m = " + m);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Outer static void main(String[] args) {
            Outer.Inner innner = new Outer.Inner();
            inner.show();
        }
    }
}
```

####代码说明：
    其中定义了一个名为Outer的类和一个名为Test的公共类。Outer类中定义了一个静态变量m和一个静态内部类Inner。Inner类中定义了一个成员变量n和一个名为show()的方法，该方法打印出m的值。在Test类的main()方法中，创建了一个Inner类的实例，并调用了show()方法。

    输出结果：

    外部类静态变量m = 0
    
    
#####4.6.4匿名内部类
    在Java中调式某个方法时,如果该方法的参数是接口类型,那么在传参时,除了可以传入一个接口现实类,还可以传入实现接口的匿名内部作为参数,在匿名内部类中实现接口方法。匿名内部类就是没有名称的内部类,定义匿名内部类时,其类体作为new语句的一部分。定义匿名内部类的基本语法格式：

    new 继承的父类或实现的接口名() {
        匿名内部类的类体
    }

```
interface Animal {
    void shout();
}
public class Test {
    public static void main(String[] args) {
        String name = "小花";
        animalShout(new Animal() {
            @Override
            public void shout() {
                System.out.println(name +"喵喵……");
            }
        });
    }
    public static void animalShout(Animal animal) {
        an.shout();
    }
}
```

####代码说明：
    这段代码定义了一个名为Animal的接口和一个名为Test的公共类。在Test类的main()方法中，创建了一个实现了Animal接口的匿名内部类的实例，并调用了animalShout()方法，将该实例作为参数传递给了animalShout()方法。animalShout()方法中调用了传入的Animal对象的shout()方法。

    在匿名内部类中，重写了Animal接口中的shout()方法，该方法打印出了一个字符串，其中包含了一个名为name的局部变量的值。name变量的值在main()方法中被初始化为"小花"。

    因此，当程序运行时，会输出"小花喵喵……"。



####第5章异常
    Java中的异常是指Java程序在运行时可能出现的错误或非正常情况,例如在程序中试图打开一个根本不存在的文件、在程序中除0等。异常是否出现,通常取决于程序的输入、程序中对象的当前状态以及程序所在的运行环境。程序抛出异常之后,会对异常进行处理。异常处理将会改变程序的控制流程,出于安全性考虑,同时避免异常程序影响其他正常程序的运行,操作系统通常将出现异常的程序强行中止,并弹出系统错误提示。

```
package Try;

public class Test1 {
    public static void main(String[] arsg) {
        int result = divide(4,0);
        System.out.println(result);     //调用divide()方法,第2个参数为0
    }
    //下面的方法实现了两个整数相除
    public static int divide(int x,int y) {
        int result = x / y;             //定义变量result记录两个数相除的结果
        return result;                  //将结果返回
    }
}
```

```
D:\Java\jdk-17.0.1\bin\java.exe "-javaagent:D:\Intellij\IDEA\exe\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=60652:D:\Intellij\IDEA\exe\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath D:\Intellij\IDEA\Java\Day21\out\production\Day21 Try.Test1
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Try.Test1.divide(Test1.java:10)
	at Try.Test1.main(Test1.java:5)

Process finished with exit code 1
```

    由上述代码可知,程序发生了算术异常(ArithmeticException),提示运算时出现了被0除的情况。异常会立即结束,无法继续向下执行。

    Arithmetic Exception是一个异常类。Java提供了大量的异常类,每一个异常类都表示一种预定义的异常,这些异常类都继承自java.lang包下的Throwable类。

    Throwable类的继承体系
    
                        Throwable
                            |
                     ———————————————— 
                    |                |
                  Error           Exception
                    |                |
                    |                |
     IOError   ———— |                | ——————  ArithmeticException             |
                    |                |
                    |                | —————— ClassCastExcetion
     A WTError ———— |                |
                    |                |
                    |                | —————— 其他子类
     其他子类 ————   |                


    由上列Throwable类体系可以看出Throwable类是所有异常类的父类,它有两个直接子类————Error类和————Exception类,其中,Error类代表程序中产生的错误,Exception类代表程序中产生的异常。下面分别对两个子类进行详细讲解

        Error类称为错误类,它表示Java程序运行时产生的系统内部错误或资源耗尽的错误,这类错误比较严重,仅靠修改程序本身是不能恢复执行的。例如使用Java命令运行一个不存在的类就会出现Error错误。
        
        Exception类称为异常类,它表示程序本身可以处理的错误,在Java程序中进行的异常处理,都是针对Exception类及其子类的。在Exception类的众多子类中有一个特殊的子类————RuntimeException类,该类及其子类用于表示运行时异常。Exception类的其他子类都用于表示编译时异常。

    Throwable类常用的方法

        方法声明                     功能描述
    String getMessage()         返回异常的消息字符串

    String toString             返回异常的简单信息描述

    void printStackTrace()      获取异常类名和异常信息以及异常出现在程序中的位置,把信息输出到控制台。


####5.2运行时异常与编译时异常
    在实际开发中,经常会在程序编译时产生异常,这些异常必须进行处理,否则程序无法正常运行,这种异常被称为编译时异常,也称为checked异常。还有一种异常是在程序中运行时产生的,这种异常即使不编译异常处理代码,依然可以通过编译,因此被称为运行时异常,也称为unchecked异常。

    1.编译时异常
    在Exception类中,除了RuntimeException类以外,其他子类都是编译时异常。Java编译器会对编译时异常进行检查,如果出现这类异常就必须对其进行处理,否则程序无法通过编译。
        1）使用try…catch语句对异常进行捕获处理。
        2）使用throws关键字声明抛出异常,有调用者对异常进行处理。


    2.运行时异常
    RuntimeException类以及其子类都是运行时异常。运行时异常是在程序时由Java虚拟机自动进行捕获处理的,java编译器不会对异常进行检查。也就是说,当程序中出现这类异常时,即使没有使用语句捕获异常或使用throws关键字声明抛出异常,程序也能编译通过,只是程序在运行过程中可能报错。

    在Java中,常见的运行时异常有多种

        运行时异常                      描述
    ArithmeticException               算术异常

    IndexOutOfBoundExcepiton        索引越界异常

    ClassCastException              类型转换异常

    NullPointerException            空指针异常

    NumberFormarException           数字格式化异常


    运行时异常一般是由程序中的逻辑错误引起的,在程序运行时无法恢复。例如,通过数组的索引访问数组元素时,如果索引超过了数组范围,就会发生索引越界异常。

    int [] arr = new int[5]
    System.out.println(arr[6])

    在上面的代码中,由于数组arr的length为5,最大索引为4,当使用arr[6]访问数组元素时就会发生数组索引越界的异常。

####5.3异常处理及语法

#####5.3.1异常的产生及处理
    一般情况下,当程序在运行过程中发生了异常时,系统会捕获抛出的异常对象并输出相应的信息,同时中止程序的运行。这种情况并不是用户所期待的,因此需要让程序接收和处理异常对象,从而避免影响其他代码的执行。当一个异常类的对象被捕获或接收后,程序就会发生流程跳转,系统中止当前的流程而跳转到专门的处理语句块,或直接跳出当前程序和Java虚拟机回到操作系统。

    在Java中,通过try、catch、finally、throw、throws这5个关键字进行异常对象的处理。

       关键字                          功能描述    
        try                 放置可能引发异常的代码块

        catch               后面对应异常类型和一个代码块,该代码块用于处理这种类型的异常

        finally             主要对应用于回收在try代码块里打开的物理资源,如数据库连接、网络连接和磁盘文件。异常机制保证finally代码块总是被执行

        throw               用于抛出一个实际的异常。它可以单独作为语句来抛出一个具体的异常对象

        throws              用在方法签名中,用于声明该方法可能抛出的异常


#####5.3.2try…catch语句
    在上一个代码文件中,因为发生了异常导致程序立即终止,所以程序无法继续执行发生异常后的代码。为了使异常发生后的程序代码正常执行,程序需要捕获并进行处理。Java提供了try…catch语句用于捕获并处理异常,其语法格式为：

    try {
        代码块
    } catch(Exception e) {
        代码块
    }

    上述语法格式中,在try代码块中编写可能发生异常的Java语句,在catch代码块中编写针对异常进行处理的代码。当try代码块中的程序发生了异常时,系统会将异常的信息封装成一个异常对象,并将这个对象传递给catch代码块进行处理。catch代码块需要一个参数指明它能够接收的异常类型,这个参数必须是Exception类或其子类。

    编写try…catch语句时,需要注意以下几点：
    1）try代码块是必需的
    2）catch代码块可以有多个,但捕获父类异常的catch代码块必须位于捕获子类异常的catch代码块后面
    3）catch代码块必须位于try代码块之后

    以下是生成try...catch语句的流程图：

```
+------------------------+
|                        |
|        Start           |
|                        |
+------------------------+
              |
              v
+------------------------+
|                        |
|     try {              |
|         // 代码块      |
|     } catch (异常类型1) {|
|         // 异常处理1   |
|     } catch (异常类型2) {|
|         // 异常处理2   |
|     } finally {         |
|         // 释放资源   |
|     }                  |
|                        |
+------------------------+
              |
              v
+------------------------+
|                        |
|         End            |
|                        |
+------------------------+
```

在上述流程图中，try...catch语句是一个结构化的异常处理机制，用于捕获和处理程序运行时发生的异常。try语句块中包含可能会抛出异常的代码块，catch语句块用于捕获指定类型的异常并进行相应的处理，finally语句块用于在无论是否有异常被捕获都会执行的操作，比如释放资源。如果try语句块中没有抛出异常，则会跳过所有catch语句块，直接执行finally语句块；如果try语句块中抛出了异常，则会依次执行匹配的catch语句块和finally语句块。最后，在try...catch语句执行完毕后，程序会继续执行紧接着的代码。


```
public class Test2 {
    public static void main(String[] args) {
        //下面的代码定义了一个try…catch语句用于捕获异常
        try {
            int result = aivide(4,0);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("捕获的异常信息为：" + e.getMessage());
        }
    }
    //下面的方法实现了两个整数相除
    public static int aivide(int x,int y) {
        int result = x / y;
        return result;
    }
}
```

    在文件Test2中,第4~9行代码对可能发生异常的代码用try…catch语句进行了处理。在try代码块中发生除0异常时,程序会通过catch代码块捕获异常,第8行代码在catch代码块对异常处理完毕后,程序仍会向下执行,而不会中止。

    需要注意的是在try代码块中,发生异常的语句后面的代码是不会被执行的,例如文件Test2中第6行代码块就没有执行。


#####5.3.3finally语句
    在程序中,有时候希望一些语句无论程序是否发生异常都要执行,这时就可以在try…catch语句后加一个finally代码块。finally代码块是try…catch…finally或try…finally结构的一部分,finally代码块只能出现在try…catch或try代码块之后,不能单独出现。try…catch…finally实现异常处理的语法如下：

    try {
        代码块
    } catch (ExceptionType e) {
        代码块
    } finally {
        代码块
    }


    需要注意的是,finally代码块必须位于所有catch代码块之后。try…catch…finally语句的异常处理。

    首先，程序执行 try 中的代码块。
    如果没有异常抛出，程序将跳过 catch 块并执行 finally 块，然后继续执行程序。

    如果在 try 块中抛出了异常，则程序将停止执行 try 块中的代码，跳到 catch 块中处理异常。

    catch 块中的代码将处理异常，然后程序将执行 finally 块中的代码。

    如果在 catch 块中又抛出了异常，则程序将停止执行 catch 块中的代码并跳到 finally 块中处理新的异常。

    最终，程序将执行 finally 块中的代码后继续执行程序。无论是否有异常抛出，finally 块中的代码都将被执行。   


```
package Try;

public class Test2 {
    public static void main(String[] args) {
        //下面的代码定义看一个try…catch…finally语句用于捕获异常
        try {
            int result = divide(4,0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("捕获的异常信息为:"+ e.getMessage());
            return;
        } finally {
            System.out.println("进入finally代码块");
        }
        System.out.println("程序继续向下…");
        }
        //下面的方法实现了两个整数相除
        public static int divide(int x,int y) {
            int result = x / y;
            return result;
    }
}
```

    在文件package Test2中,第9行代码块中增加了一个return语句,用于结束当前方法,这样catch代码块执行完之后,第13行代码就不会执行了。但是finally代码块中的代码仍会执行,不受return语句影响。也就是说,无论程序是发生异常还是使用return语句结束,finally代码块中的语句都会执行。因此,在程序设计时,通常会使用return语句结束,finally代码块中的语句都会执行。因此在程序设计时,通常会使用finally代码块处理必须做的事情,如释放资源。

    需要注意的事,如果在try…catch中执行了System.exit(0)语句,那么finally代码块不再执行。System.exit(0)表示退出当前的Java虚拟机,Java虚拟机停止了,任何代码都不能再执行了。

####5.4抛出异常
    在编程过程中,有些异常暂时不需要处理,此时可以将异常抛出,让该类的调用者处理。Java提供了throw关键字和throw关键字用于抛出异常。

#####5.4.1throws关键字
    因为调用的是程序开发者自己编写的divide()方法,所以程序开发者很清楚该方法可能发生的异常。但是在实际开发中,大部分情况下程序开发者会调用别人编写的方法,并不知道别人编写的方法是否会发生异常。针对这种情况,Java允许在方法的后面使用throws关键字声明该方法有可能发生的异常,这样调用者在调用该方法时,就明确地知道该方法有异常,并且必须在程序中对异常进行处理,否则编译无法通过。

```
修饰符 返回值类型 方法名 (参数1,参数2,……) throws 异常类1,异常类2,…… {
    方法体
}
```


```
package Try;

public class Test3 {
    public static void main(String[] args) {
        int result = divide(4,2);           // 调用divide()方法
        System.out.println(result);
    }
    //下面的方法实现了两个整数相除,并使用throws关键字声明抛出异常
    public static int divide (int x,int y) throws Exception {
        int result = x / y;                       // 定义变量result记录两个数相除的结果
        return result;                           // 将结果返回
    }
}

```

    在文件package Try Test3中,第三行代码调用divide()方法时传入的第2个参数为2,程序在运行时不会发生被0除的异常。但是运行程序依然会提示错误,这是因为定义divide()方法时对抛出的异常进行处理,否则就会发生编译错误。

```
package Try;

public class Test4 {
    public static void main(String[] args) {
        //下面的代码定义了一个try…catch语句用于捕获异常
        try {
            int result = divide(4,2);               // 调用divide()方法
            System.out.println(result);
        } catch (Exception e) {                     //对捕获的异常进行处理
            e.printStackTrace();                    //打印捕获的异常信息
        }
    }
    //下面的方法实现了两个整数相除,并使用throws关键字声明抛出异常
    public static int divide(int x,int y) throws Exception {
        int result = x / y;
        return result;
    }
}

```

    在调用divide方法时,如果不知道如何处理声明抛出的异常,也可以使用throws关键字继续将异常抛出,这样程序也能编译通过。需要注意的是,使用throws关键字重抛异常时,如果程序发生了异常,并且上一层调用者也无法处理异常时,那么异常会继续被向上抛出,最终直到系统接收到异常,中止程序执行。

```
package Try;

public class Test5 {
    public static void main(String[] args) throws Exception {
        int result = divide(4,0);
        System.out.println(result);
    }
    // 下面的方法实现了两个整数相除,并使用throws关键字声明抛出异常
    public static int divide(int x,int y) throws Exception {
        int result = x / y;
        return result;
    }
}

```


#####5.4.2throw关键字
    在Java程序中,除了throws关键字,还可以使用throws关键字抛出异常。与throws关键字不同的是,throws关键字用于方法体内,抛出的是一个异常实例,并且每次只能抛出一个异常实例。

```
    throw ExceptionInstance;
```

    在方法中,通过throw关键字抛出异常后,还需要使用throws关键字或try…catch语句对异常进行处理。如果throw抛出的是Error、RuntimeException或它们的子类异常对象,则无须使用throws关键字或try…catch语句对异常进行处理

    使用throw关键字抛出异常,通常有如下两种情况：

    1）当throw关键字抛出的异常是编译时异常时,有两种处理方式：第一种处理方式是在try代码块里使用throw关键字抛出异常,通常try代码块捕获该异常；第二种处理方式是在一个有throw声明的方法中使用throw关键字抛出异常,把异常交给该方法的调用者处理。

    2）当throw关键字抛出的异常是运行时异常时,程序既可以显式使用try…catch语句捕获并处理该异常,也可以完全不理会该异常,而把该异常交给方法的调用者处理。

```
package Try;

public class Test6 {
    // 定义printAge()输出年龄
    public static void printAge(int age) throws Exception {
        if (age <= 0) {
            //对业务逻辑进行判断,当输入年龄为负数时抛出异常
            throw new Exception("输入的年龄有误,必须是正整数！");
        } else {
            System.out.println("此人年龄为：" + age);
        }
    }
    public static void main(String[] args) {
        //下面的代码定义了一个try…catch语句用于捕获异常
        int age = -1;
        try {
             printAge(age);
        } catch (Exception e) {
            System.out.println("捕获的异常信息为：" + e.getMessage());
        }
    }
}

```


####5.5自定义异常类
    Java中定义了大量的异常类,虽然这些异常类可以描述编程时出现的大部分异常情况,但是在程序开发中有时可能需要描述程序中特有的异常情况。例如,两数相除,不允许被除数为负数。此时,就无法使用Java提供的异常类表示该类异常。为了解决这个问题,Java允许用户自定义异常类,自定义异常类必须继承Exception类或其子类。

    自定义异常类的示例代码：

    class DivideByMinusException extends Exception {
        public DivideByMinusException () {
            super();        //调用Exception的无参构造方法
        }
        public DivideByMinusException (String message) {
            super(message);      //调用Exception的有参构造方法
        }
    }

    在实例开发当中,如果没有特殊的要求,自定义的异常类只需要继承Exception类,在构造方法中使用super()语句调用Exception的构造方法即可。

    使用自定义的异常类,需要用到throw关键字。使用throw关键字在方法中声明异常的实例对象,语法格式如下：

    throw Exception 异常对象


```
package Try;

class DivideByMinusException extends Exception {
    public DivideByMinusException () {
        super();                //调用Exception无参的构造方法
    }
    public DivideByMinusException (String message) {

        super(message);         //调用Exception有参的构造方法
    }
}
public class Test7 {
    public static void main(String[] args) {
        int result = divide(4,-2);
        System.out.println(result);
    }
    //下面的方法实现了两个整数相除
    public static int divide(int x,int y) {
        if (y < 0) {
            throw new DivideByMinusException("除数是负数");
        }
        int result = x / y;             //定义变量result记录两个数相除的结果
        return result;                  //将结果返回
    }
}
```

```
D:\Intellij\IDEA\Java\Day21\src\Try\Test7.java:20:13
java: 未报告的异常错误Try.DivideByMinusException; 必须对其进行捕获或声明以便抛出
```

    在上列报错可以看出,程序在编译时就发生了异常。因为在一个方法内使用throw关键字抛出异常对象时,需要使用try…catch语句对抛出的异常进行处理。但是文件Test7没有这样做。
    为了解决上面代码出现的问题,对文件进行修改,在divid()方法后面使用throws关键字声明该方法抛出DivideByMinusException异常,并在调用divide()方法时使用try…catch语句对异常进行处理。


```
package Try;

class DivideByMinusException extends Exception {
    public DivideByMinusException () {
        super();                //调用Exception无参的构造方法
    }
    public DivideByMinusException (String message) {

        super(message);         //调用Exception有参的构造方法
    }
}
public class Test7 {
    public static void main(String[] args) {
        //下面的代码定义了一个try…catch语句用于捕获异常
        try {
            int result = divide(4,-2);
            System.out.println(result);
        } catch (DivideByMinusException e) {        // 对捕获的异常进行处理
            System.out.println(e.getMessage());     // 打印捕获的异常信息
        }
    }
    //下面的方法实现了两个整数相除,并使用throws关键字声明抛出自定义异常
    public static int divide(int x,int y) throws DivideByMinusException {
        if (y < 0) {
            throw new DivideByMinusException("除数是负数");
        }
        int result = x / y;             //定义变量result记录两个数相除的结果
        return result;                  //将结果返回
    }
}

```

```
D:\Java\jdk-17.0.1\bin\java.exe "-javaagent:D:\Intellij\IDEA\exe\IntelliJ IDEA Community Edition 2023.1\lib\idea_rt.jar=54441:D:\Intellij\IDEA\exe\IntelliJ IDEA Community Edition 2023.1\bin" -Dfile.encoding=UTF-8 -classpath D:\Intellij\IDEA\Java\Day21\out\production\Day21 Try.Test7
除数是负数

```


在文件Test7中,第20行代码在定义divide()方法时,使用throws关键字抛出了DivideByMinusException异常。在main()方法中,第12~17行代码使用try…catch语句捕获处理divide()方法抛出的异常。在调用的异常。在调用divide()方法时,如果传入的除数为负数,程序会抛出自定义的DivideByMinusException异常,该异常最终被catch代码块捕获并处理,最后打印出异常信息。


###第6章JavaAPI
###6.1字符串类
####6.1.1String类
    在使用String类进行字符串操作之前,首先需要初始化一个String类对象。在Java中可以通过两种方式对String类对象进行初始化。

    第一种方式是使用字符串常量直接初始化一个String对象,语法格式如下：

        String 变量名 = 字符串;

    使用上述语法格式初始化String对象时,既可以将String对象的初始化值设为空,也可以将其初始化为一个具体的字符串。

    String str1 = null          将字符串str1设置为空
    String str2 = "";           将字符串str2设置为空字符串
    String str3 = "abc";        将字符串str3设置为"abc"

    每个字符串常量都可以当作一个String类的对象使用,因此字符串常量可以直接调用String类中提供的API

    int len = "Hello World".length();       //len为11,即字符串包含的字符个数

    String类是专门用于处理字符串的类。字符串一旦被创建,其内容就不能再改变。

    String s = "hello";
    s = "helloworld";

    上述代码首先定义了一个类型为String的字符串s,并将其初始化为"hello"。接着将字符串s重新赋值为"helloword"。

    第二种方式是调用String类的构造方法初始化字符串对象。

    String 变量名 = new String(字符串);

    在上述语法格式中,字符串同样可以为空或是一个具体的字符串。当为具体字符串时,String会根据参数类型调用相应的 构造方法来初始化字符串对象。

            String类的常见构造方法
    String()                            创建一个空字符串
    String(String value)                根据指定的value创建字符串
    String(char[] value)                根据指定的字符数组创建字符串
    String(byte[] byte)                 根据指定的字节数组创建字节串


```
package JavaAPI;

public class Test1 {
    // 这是一个Javaapi测试类

    //String 类
    public static void main(String[] args) {
        //创建一个空字符串
        String str1 = new String();
        //创建一个内容为abc的字符串
        String str2 = new String("abc");
        //创建一个字符数组
        char[] charArray = new char[] {'D','E','F'};
        String str3 = new String(charArray);
        //创建一个字节数据
        byte[] byteArray = new byte[] {97,98,99};
        String str4 = new String(byteArray);
        //输出字符串
        System.out.println('a' + str1 + 'b');
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}

```

注意：
    连接运算符可以通过运算符+来实现。例如,在文件6-1中,第13行代码中的"a" + str1 + "b"的作用就是将3个字符串拼接到一起并生成一个新的字符串。在Java程序中,如果+两边的操作数中有一个为String类型,那么+就表示字符串连接运算符。


####6.1.2String类的常用方法
    

    1. length()

    方法声明：public int length()

    功能描述：返回此字符串的长度。

    2. charAt(int index)

    方法声明：public char charAt(int index)

    功能描述：返回指定索引位置的字符。

    3. substring(int beginIndex, int endIndex)

    方法声明：public String substring(int beginIndex, int endIndex)

    功能描述：返回从beginIndex开始到endIndex-1位置的子字符串。

    4. indexOf(char c)或indexOf(String str)

    方法声明：public int indexOf(char c) 或 public int indexOf(String str)

    功能描述：返回字符或字符串在字符串中第一次出现的位置，如果没有出现则返回-1。

    5. lastIndexOf(char c)或lastIndexOf(String str)

    方法声明：public int lastIndexOf(char c) 或 public int lastIndexOf(String str)

    功能描述：返回字符或字符串在字符串中最后一次出现的位置，如果没有出现则返回-1。

    6. equals(Object obj)

    方法声明：public boolean equals(Object obj)

    功能描述：比较字符串是否相等。

    7. equalsIgnoreCase(String str)

    方法声明：public boolean equalsIgnoreCase(String str)

    功能描述：比较字符串是否相等，忽略大小写。

    8. startsWith(String prefix)

    方法声明：public boolean startsWith(String prefix)

    功能描述：判断字符串是否以指定的前缀开头。

    9. endsWith(String suffix)

    方法声明：public boolean endsWith(String suffix)

    功能描述：判断字符串是否以指定的后缀结尾。

    10. toUpperCase()

    方法声明：public String toUpperCase()

    功能描述：将字符串转换成大写字母。

    11. toLowerCase()

    方法声明：public String toLowerCase()

    功能描述：将字符串转换成小写字母。

    12. trim()

    方法声明：public String trim()

    功能描述：去除字符串首尾的空格。

    13. replace(char oldChar, char newChar)或replace(CharSequence target, CharSequence replacement)

    方法声明：public String replace(char oldChar, char newChar) 或 public String replace(CharSequence target, CharSequence replacement)

    功能描述：将字符串中的指定字符或字符串替换为另一个字符或字符串。

    14. split(String regex)

    方法声明：public String[] split(String regex)

    功能描述：按照指定的正则表达式分割字符串为字符串数组。

    15. format(String format, Object... args)

    方法声明：public static String format(String format, Object... args)

    功能描述：使用指定的格式化字符串和参数生成一个格式化字符串。

```
1.获取字符串长度以及访问字符串中的字符
package JavaAPI;

// a:为下列输出代码添加注释

public class Test1 {
    public static void main(String[] args) {
        String s = "abaabcacbcabcab";                //定义一个字符串
        //获取字符串长度
        System.out.println(s.length());             // 定义一个名为s的字符串变量并将其赋值为"abaabcacbcabcab"
        //获取指定位置的字符
        System.out.println(s.charAt(2));            // 打印字符串s的长度
        //获取指定字符的位置
        System.out.println(s.indexOf('a'));         // 打印字符串s中索引为2的字符
        //获取指定字符的位置
        System.out.println(s.indexOf('a', 2));      // 打印字符'a'在字符串s中第一次出现的索引
        //获取指定字符串的位置
        System.out.println(s.indexOf("abc"));       // 打印字符'a'在字符串s中从索引2开始第一次出现的索引
        //获取指定字符串的位置
        System.out.println(s.indexOf("abc", 2));    // 打印字符串"abc"在字符串s中第一次出现的索引
    }
}

```


```
2.字符串的转换操作
package JavaAPI;

public class Test2 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("将字符串转换为字符数组后的结果：");
        char[] charArray = str.toCharArray();   // 将字符串转换为字符数组
        for(int i = 0;i < charArray.length;i++){
            if (i != charArray.length - 1) {
                // 如果不是数组的最后一个元素，就输出数组元素后面跟一个逗号
                System.out.print(charArray[i] + ",");
            } else {
                // 如果是数组的最后一个元素，就输出数组元素后面不跟逗号
                System.out.println(charArray[i]);
            }
        }
        System.out.println("将int值转换为String类型之后的结果：" + String.valueOf(12));
        System.out.println("将字符串转换成大写之后的结果：" + str.toUpperCase());
        System.out.println("将字符串转换成小写之后：" + str.toLowerCase());
    }
}
```


```
3.字符串的替换和去除空格操作
package JavaAPI;

public class Test3 {
    public static void main(String[] args) {
        String s = "itcast";
        //字符串替换操作
        System.out.println("将it替换成cn.it的结果：" + s.replace('t', 'T'));    // 将字符串s中的字符't'替换成'T'
        //字符串去除空格操作
        String s1 = "   i t c a s t   ";
        System.out.println("去除字符串两端空格后的结果：" + s1.trim());              // 去除字符串s1中的空格
        System.out.println("去除字符串中所有的空格后的结果：" + s1.replace(" ",""));                  // 打印字符串s1
    }
}

```

```
4字符串判断.
package JavaAPI;

public class Test4 {
    public static void main(String[] args) {
        String s1 = "String";
        String s2 = "String";
        System.out.println("判断s1字符串对象是否以Str开头：" + s1.startsWith("Str"));
        System.out.println("判断字符串对象是否以ng结尾：" + s1.endsWith("ng"));
        System.out.println("判断字符串对象是否包含字符串tri：" + s1.contains("tri"));
        System.out.println("判断字符是否为空：" + s1.isEmpty());
        System.out.println("判断两个字符串是否相等：" + s1.equals(s2));
        System.out.println("判断两个字符串是否相等（忽略大小写）：" + s1.equalsIgnoreCase(s2));

    }
}

```

```
5.字符串的截取和分割操作
package JavaAPI;

public class Test5 {
    public static void main(String[] args) {
        String str = "武汉-青岛-深圳";
        //下面的代码将字符串str以"-"进行分割
        System.out.println("将字符串以-进行分割的结果如下所示：");
        System.out.println("从第5个字符截取到末尾的结果：" + str.substring(4));    // 截取字符串str从索引5开始到末尾的子串
        System.out.println("从第5个字符截取到第6个字符的结果：" + str.substring(4, 6)); // 截取字符串str从索引5开始到索引7之间的子串
        //下面是字符串分割操作
        System.out.println("将字符串以-进行分割的结果如下所示：");
        String[] strArray = str.split("-");         // 将字符串str以"-"进行分割
        for(int i = 0;i < strArray.length;i++){
            if (i != strArray.length - 1) {
                // 如果不是数组的最后一个元素，就输出数组元素后面跟一个逗号
                System.out.print(strArray[i] + ",");
            } else {
                // 如果是数组的最后一个元素，就输出数组元素后面不跟逗号
                System.out.println(strArray[i]);
            }
        }
    }
}

```

字符串索引越界异常
    String字符串在获取某个字符时,会用到字符的索引。当访问字符串中的字符时,如果字符的索引不存在,则会发生StringIndexOutOfBoundException(字符串索引越界异常)。


####6.1.3StringBuffer类
    在Java中,因为String类是final类型的,所以使用String定义的字符串是一个常量,也就是说使用String定义的字符串一旦创建,其内容和长度是不可改变的。为了便于对字符串进行修改,Java提供了StringBuffer类(也称字符串缓冲区)来操作字符串。StringBuffer类和String类最大的区别在于它的内容和长度都是可以改变的。StringBuffer类就像一个字符容器,当在其中添加或删除字符时,操作的都是这个字符容器,因此并不会产生新的StringBuffer对象。


    StringBuffer类是Java中一个线程安全的可变字符串类，它实现了可变字符串的增删改查等操作。下面是StringBuffer类的一些常用方法：



    1. append(String str)或append(Object obj)

    方法声明：public synchronized StringBuffer append(String str) 或 public synchronized StringBuffer append(Object obj)

    功能描述：将指定的字符串或对象添加到当前字符串缓冲区的末尾。

    2. insert(int offset, String str)或insert(int offset, Object obj)

    方法声明：public synchronized StringBuffer insert(int offset, String str) 或 public synchronized StringBuffer insert(int offset, Object obj)

    功能描述：在指定偏移量处插入指定的字符串或对象。

    3. delete(int start, int end)

    方法声明：public synchronized StringBuffer delete(int start, int end)

    功能描述：删除从start开始到end-1位置的字符。

    4. deleteCharAt(int index)

    方法声明：public synchronized StringBuffer deleteCharAt(int index)

    功能描述：删除指定索引位置的字符。

    5. replace(int start, int end, String str)

    方法声明：public synchronized StringBuffer replace(int start, int end, String str)

    功能描述：使用指定的字符串替换从start开始到end-1位置的字符。

    6. substring(int start, int end)

    方法声明：public synchronized String substring(int start, int end)

    功能描述：返回从start开始到end-1位置的字符串。

    7. indexOf(String str)或indexOf(String str, int fromIndex)

    方法声明：public synchronized int indexOf(String str) 或 public synchronized int indexOf(String str, int fromIndex)

    功能描述：返回指定字符串在字符串缓冲区中第一次出现的位置，如果没有出现则返回-1。

    8. lastIndexOf(String str)或lastIndexOf(String str, int fromIndex)

    方法声明：public synchronized int lastIndexOf(String str) 或 public synchronized int lastIndexOf(String str, int fromIndex)

    功能描述：返回指定字符串在字符串缓冲区中最后一次出现的位置，如果没有出现则返回-1。

    9. capacity()

    方法声明：public synchronized int capacity()

    功能描述：返回字符串缓冲区的当前容量。

    10. charAt(int index)

    方法声明：public synchronized char charAt(int index)

    功能描述：返回指定索引位置的字符。

    11. setCharAt(int index, char ch)

    方法声明：public synchronized void setCharAt(int index, char ch)

    功能描述：将指定索引位置的字符设置为指定的字符。

    12. length()

    方法声明：public synchronized int length()

    功能描述：返回字符串缓冲区中字符的数量。

    13. ensureCapacity(int minimumCapacity)

    方法声明：public synchronized void ensureCapacity(int minimumCapacity)

    功能描述：确保字符串缓冲区的容量至少是指定的最小容量。

    14. trimToSize()

    方法声明：public synchronized void trimToSize()

    功能描述：将字符串缓冲区的容量设置为当前字符数量。


```
package JavaAPI;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("1.添加-------------------");
        add();
        System.out.println("2.删除-------------------");
        remove();
        System.out.println("3.修改-------------------");
        update();
        System.out.println("4.查询-------------------");
        query();
    }
    public static void add() {
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefg");
        sb.append("ljc").append("klmn");
        System.out.println("append添加结果：" + sb);
        sb.insert(2,"qq");
        System.out.println("insert添加结果：" + sb);
    }
    public static void remove() {
        StringBuffer sb = new StringBuffer("abcdefg");
        sb.delete(1,5);
        System.out.println("删除指定位置的结果：" + sb);
        sb.deleteCharAt(2);
        System.out.println("删除指定位置的结果：" + sb);
        sb.delete(0,sb.length());
        System.out.println("清空缓冲区的结果：" + sb);
    }
    public static void update() {
        StringBuffer sb = new StringBuffer("abcdefg");
        sb.replace(1,5,"qq");
        System.out.println("修改指定位置的结果：" + sb);
        sb.setCharAt(2,'p');
        System.out.println("修改指定位置的结果：" + sb);
    }
    public static void query() {
        StringBuffer sb = new StringBuffer("abcdefg");
        System.out.println("获取指定位置的字符：" + sb.charAt(2));
        System.out.println("获取指定字符的索引：" + sb.indexOf("c"));
        System.out.println("获取指定字符的索引：" + sb.indexOf("c",3));
        System.out.println("获取指定字符的索引：" + sb.lastIndexOf("c"));
        System.out.println("获取指定字符的索引：" + sb.lastIndexOf("c",3));
        System.out.println("获取指定位置到末尾的子串：" + sb.substring(2));
        System.out.println("获取指定位置到指定位置的子串：" + sb.substring(2,4));
    }
}

```

    注意：
    StringBuffer类
    除了StringBuffer类,还可以使用StringBuffer类修改字符串,StringBuffer类和StringBuilder类的对象都可以被多次修改,且不产生新的未使用对象。StringBuilder类与StringBuffer类的功能相似,且两个类中提供的方法也基本相同。二者最大的不同在于StringBuffer类的方法是线程安全的,而StringBuilder类没有实现线程安全功能,所以性能略高。通常情况下,如果创建一个内容可变的字符串对象,应该优先考虑使用StringBuilder类。

    StringBuilder类同样提供了一系列添加（append）、插入（insert）、替换（raplace)和删除（delete）的方法。

    String、StringBuffer和StringBuilder都是Java中用于处理字符串的类，它们的主要区别在于它们的可变性、线程安全性和性能。

    1. String是不可变的对象，一旦创建就不能被修改。如果需要对字符串进行修改，就必须创建一个新的String对象。String类适合用于存储少量的字符串，例如变量名、常量等。

    2. StringBuffer是可变的对象，可以通过调用append()方法来追加字符串。StringBuffer是线程安全的，因为它的方法被synchronized关键字修饰，可以在多线程环境中使用。但是，由于同步的开销，StringBuffer的性能比StringBuilder略差。

    3. StringBuilder也是可变的对象，可以通过调用append()方法来追加字符串。StringBuilder不是线程安全的，因此不适合在多线程环境中使用，但是由于没有同步的开销，StringBuilder的性能比StringBuffer更好。

    如果需要在多线程环境中使用字符串，或者需要对字符串进行频繁的修改，应该使用StringBuffer；如果不需要考虑线程安全，且需要高性能的字符串操作，应该使用StringBuilder；如果只是需要存储少量的字符串，可以使用String类。


###6.2System类与Runtime类

####6.2.1System类
    System类定义了一些与系统相关的属性和方法,它提供的属性和方法都是静态的,因此,可以使用System类直接引用类中的属性和方法,它提供的属性和方法都是静态的,因此,可以使用System类直接引用类中的属性和方法。

            方法声明                                                    功能描述
    static void array(Object src,int srcPos,                从源数组src的srcPos位置复制length个元素到目标数组dest的destPos位置
    Object dest,int destPos,int lenght)

    static void currentTimeMillis()                         返回以毫秒为单位的当前时间

    static Properties getProperties()                       获取当前系统全部属性

    static String getProperty(String key)                   获取指定键描述的系统属性

    static void gc()                                        运行垃圾回收器,并对内存中的垃圾进行回收

    static void exit(int status)                            用于终止当前正在运行的Java虚拟机,其中参数status表示状态码,若状态码非0,则表示异常中止



1.arraycopy()方法

    arraycopy()方法用于将源数组中的元素复制到目标数组。

    static void arraycopy(object src,int srcPos,Object dest,int destPos,int lenght)

    上述声明中参数含义：

    src:表示数组

    dest:表示目标数组

    srcPos:表示源数组中复制元素的起始位置,即从哪个位置开始复制元素

    destPos:表示复制到目标数组的起始位置,即从哪个位置开始放入复制元素。

    length:表示复制元素的个数

    需要注意的是,在进行数组元素复制时,目标数组必须有足够的空间来存放复制的元素,否则会发生索引越界。

```
package API;

public class Test {
    public static void main(String[] args) {
        int [] fromArray = {10,11,12,13,14,15};
        int [] toArray = {20,21,22,23,24,25,26};
        System.arraycopy(fromArray,2,toArray,3,4);
        //打印复制后数组的元素
        System.out.println("复制后的数组元素为：");
        for (int i = 0;i < toArray.length;i++) {
            System.out.println(toArray[i] + "");
        }
    }
}
```

    2.currentTimeMillis()方法
    currentTimeMillis()方法用于获取当前系统的时间,返回值类型是long,该值表示当前时间与1970年1月1日0时0分0秒之间的时间差,单位是秒,通常也将该值称作时间戳(系统当前时间)。

```
package API;

public class Test1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0;i < 1000000000;i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行的时间为：" + (endTime - startTime) + "ms");
    }
}

```

3.getProperties()和getProperty()方法
    System类和getProperties()方法用于获取当前系统的全部属性,该方法会返回一个Priperties对象,该对象封装了系统的所有属性,这些属性以键值对形式存在。getProperty()方法可以根据系统的属性名获取对应的属性值。

```
package API;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        // getProperties()和getProperty()方法
        //获取当前系统属性
        Properties properties = System.getProperties();
        //获取所有系统属性的键,返回Enumeration对象
        Enumeration propertyNume = properties.propertyNames();
        while (propertyNume.hasMoreElements()) {
            //获取系统属性的键
            String key = (String) propertyNume.nextElement();
            //获取当前键对值
            String value = System.getProperty(key);
            System.out.println(key + "----->" + value);
        }
    }
}

```

注意：
    java.vm.version:虚拟机版本
    user.country:用户所在国家
    os.arch:操作系统架构
    os.name:操作系统名称


4.gc()方法
    在Java中,一个对象如果不再被任何栈内存引用,该对象就称为垃圾对象。一个对象成为垃圾对象后仍会占用内存空间,时间一长,垃圾对象越来越多,就会导致内存空间不足。针对这种情况,java引入了垃圾回收机制。有了这种机制,程序员不需要过多关心垃圾对象回收的问题,Java虚拟机会自动回收垃圾对象所占用的内存空间。
    
    一个对象在成为垃圾对象后,会暂时保留在内存中。当这样的垃圾对象堆积到一定程度时,Java虚拟机就会启动垃圾回收器将这些垃圾对象从内存中释放出来,从而使程序获取更多的可用的空间。除了等待Java虚拟机进行自动回收垃圾外,还可以通过调用System.gc()方法通知Java虚拟机立即进行垃圾回收。在系统回收垃圾对象占用的内存时，会自动调用Object类的finalize()方法,因此可以在类中通过重写finalize()方法观察对象何时被释放。

```
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

```

####6.2.2Runtime类
    Runtime类用于封装Java虚拟机进程,通过Runtime类,可以获取Java虚拟机运行时状态。每一个Java虚拟机都应对应一Runtime类的实例。在JDK文档中使用者不会发现任何有关Runtime类构造方法的定义,这是因为RUntime类本身的构造方法是私有化的（单例设计模式）,若想在程序中获取一个Runtime类实例,只能通过调用getRuntime()方法获取,该方法是Runtime类提供的一个静态方法,用于获取Runtime类实例。

    Runtime run = Runtime.getRuntime();

    由于Runtime类封装了Java虚拟机进程,因此,在程序中通常会通过Runtime类的实例对象获取当前Java虚拟机的相关信息。

        方法声明                                                功能描述
      getRuntime()                                       用于获取Runtime类的实例

      exec(String command)                               用于根据指定的路径执行对应的可执行文件

      freeMemory()                                       用于返回Java虚拟机的空闲内存量,以字节为单位

      maxMemory()                                        用于返回Java虚拟机的最大可用内存量,以字节为单位

      availableProcessors()                              用于返回Java虚拟机的处理器个数

      totalMemory()                                      用于返回Java虚拟机的内存总量,以字节为单位


1.获取当前虚拟机信息
    
```
package API;

public class Test4 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器的个数：" + rt.availableProcessors() + "个");
        System.out.println("空闲内存量：" + rt.freeMemory() / 1024 / 1024 + "MB");
        System.out.println("最大可用内存量：" + rt.maxMemory() / 1024 / 1024 + "MB");
        System.out.println("内存总量：" + rt.totalMemory() / 1024 / 1024 + "MB");
    }
}

```

2.操作系统进程





###6.3Math类与Random类
####6.3.1Math类
####6.3.2Random

###6.4BigInteger类与BigDecimal类
####6.4.1BigInterger类
####6.4.2BigDecimal类

###6.5日期和时间类
####6.5.1Date类
####6.5.2Calendar类
####6.5.3Instant类
####6.5.4LocalDate类
####6.5.5Local Time类与LocalDateTime类
####6.5.6Duration类与Period类

###6.6日期与时间格式化类
####6.6.1DateFormat类
####6.6.2SimpleDateFormat类

###6.7数字格式化类

###6.8包装类

###6.9正则表达式
    在项目开发过程中,经常需要对用户输入的信息进行格式校验。例如,判断输入的字符串是否符合Email格式。若手工编写代码实现校验逻辑,不仅耗时,而且程序健壮性也往往得不到保障。为此,Java提供了正则表达式,通过正则表达式可以快速校验信息格式。
####6.9.1正则表示式和语法
    正则表达式是由普通字符（如字符a~z)和特殊字符（元字符）组成的文本模式。例如正则表达式"[a~z]*"描述了所有仅包含小写字母的字符串,其中a,z为普通字符,连字符、左右中括号及星号则为元字符。

    正则表达式中的元字符包括以下几类
    在Java中，正则表达式中的元字符包括以下内容：

    1. 普通字符：除了元字符以外的所有字符都是普通字符，表示匹配自身。

    2. 转义字符：通过反斜线 \ 转义的字符，如 \d 表示匹配数字字符，\s 表示匹配空白字符。

    3. 字符类：用方括号 [] 包含的字符集合，表示匹配方括号中的任意一个字符。

    4. 限定符：用于指定匹配次数的符号，如 * 表示匹配前一个字符零次或多次，+ 表示匹配前一个字符一次或多次，? 表示匹配前一个字符零次或一次，{n} 表示匹配前一个字符恰好 n 次，{n,} 表示匹配前一个字符至少 n 次，{n,m} 表示匹配前一个字符至少 n 次，最多 m 次。

    5. 分组：用小括号 () 包含的正则表达式，表示匹配括号中的表达式。

    6. 或者：用竖线 | 分隔的多个正则表达式，表示匹配其中任意一个。

    7. 边界匹配符：用于匹配字符串的边界，如 ^ 表示匹配字符串的开头，$ 表示匹配字符串的结尾，\b 表示匹配单词的边界，\B 表示匹配非单词的边界。

    8. 零宽度断言：用于匹配字符的位置而不是字符本身，如 (?=exp) 表示匹配 exp 后面的位置，(?<=exp) 表示匹配 exp 前面的位置，(?!exp) 表示匹配后面不是 exp 的位置，(?<!exp) 表示匹配前面不是 exp 的位置。

    9. 点号 . ：表示匹配除换行符以外的任意一个字符。

    10. 中括号 [] ：用于定义字符集合，表示匹配方括号中的任意一个字符。可以使用连字符 - 表示字符范围，如 [a-z] 表示匹配任意小写字母，[0-9] 表示匹配任意数字。也可以使用脱字符 ^ 表示取反，如 [^a-z] 表示匹配任意非小写字母的字符。

    11. 美元符号 $ ：表示匹配字符串的结尾。

    12. 插入符号 ^ ：在中括号中使用，表示匹配字符串的开头。


匹配次数元字符
    匹配次数元字符用来确定其左侧符号的出现次数。

    常用的匹配次数元字符包括以下内容：

    1. * ：表示匹配前面的字符零次或多次。例如，ab*c 可以匹配 ac、abc、abbc 等字符串。

    2. + ：表示匹配前面的字符一次或多次。例如，ab+c 可以匹配 abc、abbc、abbbc 等字符串。

    3. ? ：表示匹配前面的字符零次或一次。例如，ab?c 可以匹配 ac、abc 两个字符串。

    4. {n} ：表示匹配前面的字符恰好 n 次。例如，a{3} 可以匹配 aaa 字符串。

    5. {n,} ：表示匹配前面的字符至少 n 次。例如，a{3,} 可以匹配 aaa、aaaa、aaaaa 等字符串。

    6. {n,m} ：表示匹配前面的字符至少 n 次，最多 m 次。例如，a{3,5} 可以匹配 aaa、aaaa、aaaaa 三个字符串。

    需要注意的是，以上的匹配次数元字符都是贪婪匹配，即会尽可能地匹配更多的字符。例如，对于表达式 "a.*b"，它会匹配以 a 开头，以 b 结尾，中间包含任意字符的字符串。如果字符串是 "abcdb"，则匹配结果是 "abcdb"，而不是 "ab"。

    如果需要进行非贪婪匹配，可以在匹配次数元字符后面加上 ?，例如，*? 表示非贪婪的零次或多次匹配，+? 表示非贪婪的一次或多次匹配，{n,m}? 表示非贪婪的 n 到 m 次匹配。

其他常用符号
    除了上述的元字符外,正则表达式的其他常用元字符有：


    1. \d ：表示匹配数字字符。等价于 [0-9]。

    2. \D ：表示匹配非数字字符。等价于 [^0-9]。

    3. \s ：表示匹配空白字符，包括空格、制表符、换行符等。等价于 [\f\n\r\t\v]。

    4. \S ：表示匹配非空白字符。等价于 [^\f\n\r\t\v]。

    5. \w ：表示匹配单词字符，包括数字、字母、下划线。等价于 [0-9a-zA-Z_]。

    6. \W ：表示匹配非单词字符。等价于 [^0-9a-zA-Z_]。
    
    7. \B ：非单词边界

    8. \A ：输入的开头
    
    9. \G ：上一个匹配的结尾 


####6.9.2Pattern类与Matcher
    Java正则表达式通过Java.util.regex包下的Pattern类与Matcher类实现,因此,要使用正则表达式,首先要学会着两个类的使用

1.pattern类
    pattern类用于创建一个正则表达式,也可以说创建一个匹配模式。pattern类的构造方法是私有的,不可以直接创建正则表达式,为此,pattern类提供了一个静态的compile()方法,通过compile()方法可以创建一个正则表达式。

    pattern p = pattern.comile("\\w+");

    除了compile()方法,pattern类还提供了其他的方法。

        方法声明                                                            功能描述
    static Pattern compile(String re)                                   将正则表达式编译为模式

    Matcher matcher(CharSequence input)                                 根据模式为字符串input创建匹配器。String类实现了CharSequence接口,CharSequence接口可视为String

    Static boolean matches(String regex,CharSequence input)             判断字符串input是否匹配正则表达式regex。该方法适用于只进行一次匹配的情况

    String pattern()                                                    返回模式使用的正则表达式

    String[] split(CharSequence input)                                  根据模式将字符串input分割为字符串数组

    String[] spilt(CharSequence input,int limit)                        根据模式将字符串input分割为字符串数组,同时指定字串的最大个数为limit

2.Matcher类
    Matcher类用于验证Pattern类定义的模式与字符串是否匹配,因此Matcher实例也称为匹配器。Matcher类的构造方法也是私有的,不能直接创建Matcher实例,只能通过Pattern.marcher()方法获取该类的实例,多个Matcher对象可以使用同一Pattern对象。

        方法声明                                                功能描述
    pattern pattern()                                       返回匹配器的模式

    Matcher usePattern(Pattern p)                           使用模式为p的匹配器

    Matcher reset()                                         重设匹配器到初始状态

    Matcher reset(CharSequence input)                       重设匹配器到初始状态,并以input为目标字符串
    
    boolean find()                                          在目标字符串中查找下一个匹配字符串,若找到则返回true

    int start()                                             求正则表达式匹配的字符串在整个字符串中第一次出现的索引

    int end()                                               求正则表达式匹配的字符串在整个字符串中最后一次出现的索引

    String group()                                          返回匹配的子串

    String group(init i)                                    返回上一次匹配的子串中与第i组匹配的子串。正则表达式中以一对小括号括起来的部分称为组


    boolean matcher()                                       对整个字符串进行匹配,只有整个字符串都匹配才返回true

    boolean lookingAt()                                     从目标字符串的第一个字符开始匹配,若匹配成功则返回true

    String replaceAll(String s)                             将目标字符串中与模式匹配的全部子串替换为s并返回替换后的字符串

    String replaceFirst(String s)                           将目标字符串中与模式匹配的首个子串替换为s并返回替换后的字符串

```
    package API;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test6 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("22bb23");
        System.out.println("字符串是否匹配：" + m.matches());
        Matcher m2 = p.matcher("2223");
        System.out.println("字符串2223与模式p是否匹配：" + m2.matches());
        System.out.println("字符串22bb23与模式p的匹配结果:" + m.lookingAt());
        Matcher m3 = p.matcher("aa2223");
        System.out.println("字符串aa2223与模式p的匹配结果:" + m3.lookingAt());
        System.out.println("字符串22bb23与模式p是否存在下一个匹配结果：" + m.find());
        m3.find();
        System.out.println("字符串aa2223与模式p是否存在下一个匹配结果：" + m3.find());
        Matcher m4 = p.matcher("aabb");
        System.out.println("字符串aabb与模式p是否存在下一个匹配结果：" + m4.find());
        Matcher m1 = p.matcher("aaa222bb");
        m1.find();
        System.out.println("模式p与字符串aaa222bb第一次匹配的索引：" + m1.start());
        System.out.println("模式p与字符串aaa2223bb最后一次匹配的索引：" + m1.end());
        System.out.println("模式p与字符串aaa2223bb匹配的子字符串：" + m1.group());
        Pattern p2 = Pattern.compile("[/]+");
        Matcher m5 = p2.matcher("张三/李四//王五///赵六");
        System.out.println("将字符串张三/李四/王五///赵六中的全部/替换为|：" + m5.replaceAll("|"));
        System.out.println("将字符串张三/李四/王五///赵六中的首个/替换为|：" + m5.replaceFirst("|"));

    }
}
```

####6.9.3String类对正则表达式的支持

        方法声明                                                功能描述
    boolean matches(String regex)                           匹配字符串regex

    String replaceAll(String regex,String replacement)      使用字符串replacement替换regex

    String[] split(String regex)                            拆分字符串regex


```
package API;

public class Test7 {
    public static void main(String[] args) {
        String str = "A1B22DDS34Dsj9D".replaceAll("\\d + ","_");
        System.out.println("字符串替换后为:" + str);
        boolean te = "321123as1".matches("\\d+");
        System.out.println("字符串是否匹配：" + te);
        String[] s = "SDS45d4DD4dDS88D".split("\\d+");
        System.out.println("字符串拆分后为：");
        for(int i = 0;i<s.length;i++) {
            System.out.println(s[i] + " ");
        }
    }
}
```


##第七章集合
###7.1集合概述
    为了存储不同类型的多个对象,Java提供了一系列特殊的类,这些类可以存储任意类型的对象,并且存储的长度可变,这些类统称为集合。集合可以简单地理解为一个长度可变的,可以存储不同数据类型的动态数组。集合都位于Java。util包中,使用集合时必须导入Java.util包。在学习具体的集合之前,先对集合中的接口和类有所了解。

    集合中的核心接口

        接口                              描述
    Collection                      集合中最基本的接口,一般不直接使用该接口

    List                            Collection的子接口,用于存储一组有序、不唯一的对象,是集合中常用的接口之一

    Set                             Collection的子接口,用于存储一组无序、唯一的对象

    Map                             用于存储一组键值对象,提供键到值的映射。


###7.2Collection接口
    Collection接口是Java单列集合中的根接口,它定义了各种具体单列集合的共性,其他单列集合大多直接或间接继承该接口。

    public interface Collection<E> extends Iterable<E> {
        //Query Operations
    }

    由Collection接口的定义可以看到,Collection是Iterable的子接口,Collection和Iterable后面的<E>表示它们都使用了泛型。Collection接口的常用方法。

        方法声明                                            功能描述
    boolean add(Object o)                       向当前集合中添加一个元素

    boolean addAll(Collection c)                将指定集合c中的所有元素添加到当前集合中

    void clear()                                删除当前集合中的所有元素

    boolean remove(Object o)                    删除当前集合中的指定的元素

    boolean removeAll(Collection c)             删除当前集合中包含的集合c中的所有元素

    boolean isEmpty()                           判断当前集合是否为空

    boolean contains(Object o)                  判断当前集合中是否包含某个元素

    boolean containsAll(Collection c)           判断当前集合中是否包含指定集合c中的所有元素

    Iterable iterator()                         返回当前集合的迭代器。迭代器用于遍历中的所有元素

    int size()                                  获取当前集合元素个数

    在开发中,往往很少直接使用Collection接口,基本上都是使用其子接口,Collection接口的子接口主要有List、Set、Queue和SortedSet。

###7.3List接口
####7.3.1List接口简介
    List接口继承自Collection接口,List接口实例中允许存储重复的元素,所有的元素以线性方式存储。在程序中可以通过索引访问List接口实例中存储的元素。另外,List接口实例中存储的元素是有序的,即元素的存入顺序和取处顺序一致。

        方法声明                                                        功能描述
    void add(int index,Object element)                      将元素element插入List的索引index处。

    boolean addAll(int index,Collection c)                  将集合c包含的所有元素插入List结合的索引index处

    Object get(int index)                                   返回集合索引index处的元素

    Object remove(int index)                                删除索引index处的元素

    Object set(int index,Object element)                    将索引index处的元素替换成element对象并将替换后的元素返回

    int indexOf(Object o)                                   返回对象o在List中第一次出现的索引

    int lastIndexOf(Object o)                               返回对象o在List中最后一次出现的索引

    List subList(int fromIndex,int toIndex)                 返回从索引fromIndex(包括)到toIndex(不包括)的所有元素组成的子集合

####7.3.2ArrayList
    ArrayList是List接口的一个实现类,它是程序中最常见的一种集合。ArrayList内部封装了一个长度可变的数组对象,当存入的元素超过数组长度时,ArrayList会在内存中分配一个更大的数组来存储这些元素,因此可以将ArrayList看作一个长度可变的数组。

    ArrayList的大部分方法是从父类Collection和List继承的,其中add()方法和get()方法分别用于实现元素的存入和取出。


```
package API;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        //获取集合中元素的个数
        System.out.println("集合的长度：" + list.size());
        //取出并打印指定位置的元素
        System.out.println("第2个元素是:" + list.get(1));
        //删除索引为3的元素
        list.remove(3);
        System.out.println("删除索引为3的元素：" + list);
        //替换索引为1的元素为李四2
        list.set(1,"李四2");
        System.out.println("替换索引为1的元素为李四2：" + list);
    }
}

```

    将上述代码输出后可以看到,索引为1的元素是集合中第2个元素,这就说明集合和数组一样,索引的取值范围是从0开始,最后一个索引是集合大小写减1,在访问元素时一定要注意索引不可超出此范围,否则会出现索引越界异常。

    由于ArrayList的底层是使用一个数组存储元素,在增加或删除指定位置的元素时,会擦混关键新的数组,效率比较低,因此Arraylist集合不适合做大量的增删操作,而适合元素的查找。


####7.3.3LinkedList
    LinkedList内部维护了一个双向循环列表,链表中的每一个元素都使用引用的方式记录它的前一个元素和后一个元素,从而可以将所有的元素彼此连接起来。当插入一个新元素时,只需要修改元素之间的引用关系即可,删除一个节点也是如此。正因为LinkedList具有这样的存储结构,所以其增删效率非常高。

        方法声明                                              功能描述
    void add(int index,E element)                       在当前集合的索引index处插入元素element

    void addFirst(Object o)                             将指定元素o插入当前集合的开头

    void addLast(Object o)                              将指定元素o添加到当前集合的结尾

    Object getFirst()                                   返回当前集合的第一个元素

    Object getLast()                                    返回当前集合的最后一个元素

    Object removeFirst()                                移除并返回当前集合的第一个元素 

    Object remobeLast()                                 移除并返回当前集合的最后一个元素    

    boolean offer(Object o)                             将指定元素o添加到当前集合的结尾

    boolean offerFirst(Object o)                        将指定元素o添加到当前集合的开头

    boolean offerLast(Object o)                         将指定元素o添加到当前集合的结尾

    Object peekFirst()                                  获取当前集合的第一个元素

    Object peekLast()                                   获取当前集合的最后一个元素

    Object pollFirst()                                  移除并返回当前集合的第一个元素

    Object pollLast()                                   移除并返回当前集合的最后一个元素

    void push(Object o)                                 将指定元素o添加到当前集合的开头


```
package API;

import java.util.*;
public class Test9 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("张三");
        link.add("李四");
        link.add("王五");
        link.add("赵六");
        System.out.println(link.toString());
        link.add(3,"Student");
        link.addFirst("First");
        System.out.println(link);
        System.out.println(link.getFirst());
        link.remove(3);
        link.removeFirst();
        System.out.println(link);
    }
}

```

###7.4集合遍历

####7.4.1Iterator接口
    lterator接口是Java集合框架中的一员,但它与Collection接口和Map接口有所不同,Collection接口和Map接口主要是用于存储元素,而Iterator接口主要用于迭代访问(遍历)集合中的元素,通常情况下Iterator对象也被称为迭代器。


```
package API;

import java.util.*;

public class Test10 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        Iterator it = list.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}

```

    Iterator对象在遍历集合时,内部采用指针的方式来跟踪集合中的元素。在调用Iterator的next()方法之前,Iterator的指针位于第一个元素之前,不指向任何元素;第一次调用Iterator的next()方法时,Iterator的指针会向后移动一位,值向第一个元素并将该元素返回;当第二次调用next()方法时,Iterator的指针会指向第二个元素并将该元素返回;以此类推,直到hasNext()方法返回false,表示已经遍历完成,终止遍历。

注意：
    通过Iterator获取集合中的元素时,这些元素的类型都是Object类型。如果想获取特定类型的元素,则需要对数据类型强制转换。

    并发修改异常：
        在使用Iterator对集合中的元素进行遍历时,如果调用了集合对象的remove()方法删除元素,然后继续使用Iterator遍历元素,会出现异常。


####7.4.2foreach循环
    虽然Iterator可以用来遍历集合中的元素,但在写法上比较繁琐。为了简化书写,从JDK5开始,JDK提供了foreach循环,它是一种更加简洁的for循环,主要用于遍历数组或者集合中的怨怒是

    for(容器中元素类型 临时变量 : 容器变量) {
        执行语句
    }

    由上述foreach循环语句格式可知,与for循环相比,foreach循环不需要获得集合的长度,也不需要根据索引访问集合中的元素,就能自动遍历集合中的元素。


```
package API;

import java.util.*;

public class Test12 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        for(Object obj : list) {
            System.out.println(obj);
        }
    }
}

```

    foreach循环在遍历集合时语法非常简洁,没有循环条件,也没有迭代语句,所有这些工作都交给Java虚拟机执行了。foreach循环的次数是由集合中元素的个数决定的,每次循环时,foreach都通过临时变量将当前循环的元素记住,从而将集合中的元素分别打印出来。

    foreach循环缺陷
    foreach循环虽然书写起来很简洁,但在使用时也存在一定的局限性。当使用foreach循环遍历集合和数组时,只能访问其中的元素,不能对其中的元素进行修改。

```
package API;

import java.util.*;

public class Test13 {
    static String[] strs = {"aaa","bbb","ccc"};
    public static void main(String[] args) {
        for(String str : strs) {
            str = "ddd";
        }
        System.out.println("foreach循环修改后的数组：" + strs[0] + "," + strs[1] + "," + strs[2]);
        for(int i = 0; i < strs.length; i++) {
            strs[i] = "ddd";
        }
        System.out.println("普通for循环修改后的数组：" + strs[0] + "," + strs[1] + "," + strs[2]);
    }
}

```

    从上述代码的输出可以看出,foreach循环并不能修改数组中元素的值。其原因是：第6行代码中的str = "ddd"只是将临时变量str赋值为一个新的字符串,这和数组中的元素没有任何关系,而在普通for循环中,可以通过索引的方式引用数组中的元素并修改其值。


###7.5Set接口
####7.5.1Set接口简介
    Set接口也继承自Collection接口,它的方法与Collection接口的方法基本一致,并没有对Collection接口进行功能上的扩充。与List接口不同的是,Set接口中的元素是无序的,并且都会以某种规则保证存入的元素不出现重复的。

    Set接口常见的实现类有3个,分别是HashSet、LinkedHashSet、TreeSet。其中HashSet根据对象的哈希值确定元素在集合中的存储位置,具有良好的存取和查找性能；LinkedHashSet是链表和哈希表组合的一个数组存储结构；TreeSet则以二叉树的方式存储元素,它可以对集合中的元素进行排序。

####7.5.2HashSet
    HashSet是Set接口的一个实现类,它存储的元素是不可重复的。当向HashSet中添加一个元素时,首先会先调用HashCode()方法确定元素的存储位置,然后再调用equals方法确保位置没有重复元素。Set接口与List接口存取元素的方式是一样的,但是Set集合中的元素是无序的。

```
package API;

import java.util.*;

public class Test14 {
    public static void main(String[] args) {
        HashSet hset = new HashSet();
        hset.add("张三");
        hset.add("李四");
        hset.add("王五");
        hset.add("李四");
        Iterator it = hset.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}

```

    HashSet之所以能确保不出现重复的元素,是因为它在存入元素时做了很多工作。当调用HashSet的add()方法存入元素时,首先调用hashCode()方法获得该元素的哈希值,然后根据哈希值计算存储位置。如果该位置上没有元素,则直接将元素存入；如果该位置上有元素,则调用equals()方法将要存入的元素和该位置上的元素进行比较,根据返回结果确定是否存入元素。如果返回的结果为false就将该元素存入集合；如果返回的结果为true,则说明有重复元素,就要存入的重复元素舍弃。

    当向集合中存入元素时,为了保证集合正常工作,要求在存入元素时重写Object类中的hashCode()和equals()方法。

```
# 向集合中存储自定义类对象

package API;

import java.util.*;

class Student {
    String id;
    String name;
    public Student (String id,String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return id + ":" + name;
    }
}
public class Test15 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Student stu1 = new Student("1","张三");
        Student stu2 = new Student("2","李四");
        Student stu3 = new Student("2","李四");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}
```


```
该写文件 禁止重复元素出现

package API;

import java.util.*;

class Student {
    private String id;
    private String name;
    public Student (String id,String name) {
        this.id = id;
        this.name = name;
    }
    //重写toString类
    public String toString() {
        return id + ":" +name;
    }
    //重写hashCode()类
    public int hashCode() {
        return id.hashCode();
    }
    //重写equals()
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student stu = (Student) obj;
        boolean b = this.id.equals(stu.id);
        return b;
    }
}
public class Test16 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Student stu1 = new Student("1","张三");
        Student stu2 = new Student("2","李四");
        Student stu3 = new Student("2","李四");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}

```

####7.5.3LinkedHashSet
    HashSet存储的元素是无序的,如果想让元素的存取顺序一致,可以使用Java提供的LinkedHashSet类,LinkedHashSet类是HashSet的子类,与LinkedList一样,它也使用双向链表来维护内部元素的关系。

```
package API;

import java.util.*;

public class Test17 {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}

```

####7.5.4TreeSet
    TreeSet是Set接口的另一个实现类,它内部采用二叉树存储元素,这样的结构可以保证集合中没有重复的元素,并且可以对元素进行排序。

        方法声明                                功能描述
    Object first()                          返回集合的第一个元素

    Object last()                           返回集合的最后一个元素    

    Object lower(Object o)                  返回集合中小于给定元素的最大元素,如果没有返回null

    Object floor(Object o)                  返回集合中小与或等于给定元素的最大元素,如果没有返回null

    Object higher(Object o)                 返回集合中大于给定元素的最小元素,如果没有返回null

    Object ceiling(Object o)                返回集合中大于或等于给定元素的最小元素,如果没有返回null

    Object pollFirst()                      移除并返回集合的第一个元素

    Object pollLast()                       移除并返回集合的最后一个元素


```
package API;

import java.util.*;

public class Test18 {
    public static void main(String[] args) {
        //创建集合
        TreeSet ts = new TreeSet();
        //向集合中添加元素
        ts.add(3);
        ts.add(29);
        ts.add(90);
        ts.add(60);
        ts.add(25);
        System.out.println("创建的TreeSet集合为：" + ts);
        //获取首尾元素
        System.out.println("TreeSet集合首元素为：" + ts.first());
        System.out.println("TreeSet集合尾部元素为：" + ts.last());
        //比较并获取元素
        System.out.println("集合中小于或等于9的最大的元素为：" + ts.floor(9));
        System.out.println("集合中大于10的最小的元素为：" + ts.higher(10));
        System.out.println("集合中大于100的最小的元素为：" + ts.higher(100));
        //删除元素
        Object first  = ts.pollFirst();
        System.out.println("删除的第一个元素为：" + first);
        System.out.println("删除第一个元素后TreeSet集合变成：" + ts);
    }
}

```

    使用TreeSet的方法正确完成了集合元素的操作。另外,从输出结果也可以看出,向TreeSet集合添加元素时,不论元素的添加顺序如何,这些元素都能够按照一定的顺序排列。其原因是：每次向TreeSet集合中存入一个元素时,就会在进行比较时都会调用compareTo()方法,该方法是在Compareble接口中定义的,因此要想对集合中的元素进行排序,就必须实现Comparable接口。Java中大部分的类实现了Comparable接口,并默认实现了该接口中的ComparableTo()方法,如Integer、Double和String。

    在实际开发中,除了会向TreeSet集合中存储一些Java默认类型的数据外,还会存储一些用户自定义的类型的数据,如Student类型的数据、Teacher类型的数据等。由于这些自定义类型的数据没有实现Comparable接口,因此也就无法直接在TreeSet集合中进行排序操作。为了解决这个问题,Java提供了两种TreeSet集合的排序规则,分别为自然排序和自定义排序。在默认情况下,TreeSet都采用自然排序。

    1.自然排序
        自然排序要求向TreeSet集合中存储的元素所在类必须实现Comarable接口,并重写compareTo()方法,然后TreeSet集合就会对该类型的元素使用compareTo()方法进行比较。compareTo()方法将当前对象与指定的对象按顺序进行比较,返回值为一个整数,其中,返回负整数、零或正整数分别表示当前对象小于、等于或大于指定对,默认根据比较结果顺序排序。

```

```

    2.自定义排序
    有时如果不想实现Comparable接口或者不想按照实现了comparable接口的类中compareTo()方法的规则进行排序,可以通过自定义比较器的方式对TreeSet集合中的元素自定义排序规则。实现comparable接口的类都是一个自定义比较器,可以在自定义比较器的compare()方法中自定义排序规则。

    在TreeSet集合中自定义排序。排序规则是：先根据Student的id升序排列；如果id相同,则根据name进行升序排列。


```
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

```























































