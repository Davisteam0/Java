public class Test2 {
    public static void main(String[] args){

        /*
            Switch语句格式说明：
              * 表达式:(将要匹配的值)取值为byte，short、int、char。
                       JDK5以后可以是枚举，JDK7以后可以是String。
              *  case:后面跟的是要和表达式进行比较的值（被匹配的值）。
              *  break：表示中断，结束的意思，用来结束switch语句
              *  default：表示所有情况都不匹配的时候，就该执行该处的内容，和if语句的else相似。
              *  case后面的值只能是字面量，不能是变量
              *  case给出的值不允许重复
         */



        String noodles = "兰州拉面";
        switch(noodles){
            case "兰州拉面":
            System.out.println("吃兰州拉面");
            break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            case "河南烩面":
                System.out.println("吃河南烩面");
                break;
            default:
                System.out.println("吃老坛酸菜牛肉面");
                break;
        }
    }
}
