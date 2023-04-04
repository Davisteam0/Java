public class Figure {
    //编写三个方法,利用方法重载实现计算矩形、梯形的面积
    //圆的面积：3.14*半径*半径
    //矩形的面积：长*宽
    //梯形的面积：(上底+下底)*高/2
    public static void main(String[] args) {
        System.out.println("圆的面积为：" + getArea(5));
        System.out.println("矩形的面积为：" + getArea(5, 6));
        System.out.println("梯形的面积为：" + getArea(5, 6, 7));
    }
    //计算圆的面积
    public static double getArea(double r) {
        return 3.14 * r * r;
    }
    //计算矩形的面积
    public static double getArea(double length, double width) {
        return length * width;
    }
    //计算梯形的面积
    public static double getArea(double top, double bottom, double height) {
        return (top + bottom) * height / 2;
    }
}
