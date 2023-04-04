package test;

import bean.TowerDefence;

public class TestTowerDefence {
    //在测试类中创建一个TowerDefence对象,通过引用变量给对象赋值,并调用showMessage()方法输出该方法的所在的位置。
    public static void main(String[] args) {
        TowerDefence td = new TowerDefence(10,20);
        td.showMessage();

        //通过引用变量给对象赋值
        td.x = 15;
        td.y = 25;
        //调用showMessage()方法输出该方法的所在的位置
        td.showMessage();

        //通过构造方法给对象赋值
        TowerDefence td2 = new TowerDefence(30, 40);
        td2.showMessage();
    }
}
