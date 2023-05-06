package API;

public class Test4 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器的个数：" + rt.availableProcessors() + "个");
        System.out.println("空闲内存量：" + rt.freeMemory() / 1024 / 1024 + "MB");
        System.out.println("最大可用内存量：" + rt.maxMemory() / 1024 / 1024 + "MB");
        System.out.println("内存总量：" + rt.totalMemory() / 1024 / 1024 + "MB");
    }
}
