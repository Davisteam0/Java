//基本数据类型之间的自动类型转换和强制转换

//11行：char类型和int类型相加，会将char类型自动转换成int类型。
//12行：char类型和int类型相减，同上。
//13行：byte类型和float类型相乘，会将byte类型自动转换成float类型。
//19行：在tcDouble的计算中，tcFloat和tcInt都是浮点数类型，所以tcInt会被自动转换成浮点数类型进行计算。
//21行：将double类型的tcDouble强制转换成int类型，小数部分会被舍弃。

public class Test4 {
    public static void main(String[] args) {
        final  double MY_CONST = 6.89;
        char myChar = 'h';
        byte myByte = 6;
        int myInt = 100;
        long myLong = 89L;
        float myFloat = 8.77F;
        double myDouble = 6.99;
        int tcInt = myChar + myInt;             // char和int相加，char会自动转换成int
        long tcLong = myChar - myInt;           // char和int相减，char会自动转换成int
        float tcFloat = myByte * myFloat;       // byte和float相乘，byte会自动转换成float
        double tcDouble = tcFloat / tcInt + myDouble;       // tcInt自动转换为浮点型进行计算
        System.out.println("tcInt = " + tcInt);
        System.out.println("tcLong = " + tcLong);
        System.out.println("tcFloat = " + tcFloat);
        System.out.println("tcDouble = " + tcDouble);
        tcInt = (int)tcDouble;       // 强制将double类型的tcDouble转换成int类型
        System.out.println("tcInt = " + tcInt);
        tcInt = (int)MY_CONST + (int) myChar;    // 强制转换MY_CONST和myChar的数据类型为int类型再相加
        System.out.println("tcInt = " + tcInt);
    }
}
