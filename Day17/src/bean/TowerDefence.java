package bean;

public class TowerDefence {
    //两个属性,分别是int类型的x横坐标和y纵坐标坐标
    public int x;
    public int y;

    //定义一个方法showMessage(),该方法输出防御塔的坐标位置。
    public void showMessage() {
        System.out.println("防御塔的坐标位置为:(" + x + "," + y + ")");
    }
    public TowerDefence(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
