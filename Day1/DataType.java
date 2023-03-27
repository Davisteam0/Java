public class DataType {
    public static void main(String[] args){
        //byte
        byte b = 10;
        System.out.println(b);
        //short
        short s = 20;
        System.out.println(s);
        //int
        int i = 30;
        System.out.println(i);
        //long
        //如果要定义long类型变量的时候
        // 在数据值的后面需要加一个L作为后缀
        //L可以大小写
        //建议使用L
        long l = 60L;
        System.out.println(l);
        //float
        //如果要定义float类型变量的时候
        // 在数据值的后面需要加一个F作为后缀
        float f = 9.9F;
        System.out.println(f);
        //double
        double d = 99.99;
        //char
        char c = 'n';
        System.out.println(c);
        //boolean
        boolean B = true;
        System.out.println(B);

        //Java语言数据类型分为：基本数据类型，引用数据类型
        //byte取值范围：[-128~127]
        //整数和小数取值范围大小关系：
        //double > float > long > int > short > byte
    }
}
