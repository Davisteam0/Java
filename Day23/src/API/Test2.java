package API;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        // getProperties()和getProperty()方法
        //获取当前系统属性
        Properties properties = System.getProperties();
        //获取所有系统属性的键,返回Enumeration对象
        Enumeration propertyNume = properties.propertyNames();
        while (propertyNume.hasMoreElements()) {
            //获取系统属性的键
            String key = (String) propertyNume.nextElement();
            //获取当前键对值
            String value = System.getProperty(key);
            System.out.println(key + "----->" + value);
        }
    }
}
