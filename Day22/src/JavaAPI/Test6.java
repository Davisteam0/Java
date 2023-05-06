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
