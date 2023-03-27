public class Test7 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        boolean flag = contain(arr,89);
        System.out.println(flag);
    }

    public static boolean contain(int [] arr,int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        //什么时候才能断定89在数组中不存在
        //当数组里面所有的数据全部比较完毕后
        return false;
    }
}

/*
    return break 关键字的区别：
        return：其实跟循环没有什么关系，跟方法有关，表示1结束方法的，2返回结果
                如果方法执行到了return，那么整个方法全部结束，里卖的循环也会随之结束了
        break：其实跟方法没什么关系，结束循环或者switch的
 */
