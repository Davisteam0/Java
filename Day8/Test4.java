public class Test4 {
    public static void main(String[] args){
        /*for(int i=0; i <= 5;i++){
            if(i == 3){
                //结束符本次循环
                continue;
            }
            System.out.println("小老虎在吃" + i + "个包子");
        }*/
        for(int i = 0;i <= 5;i++){
            System.out.println("小老虎在吃" + i + "个包子");
            if(i == 3){
                //结束整个循环
                break;
            }
        }
    }
}
