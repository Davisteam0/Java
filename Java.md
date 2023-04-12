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























































































































































































































