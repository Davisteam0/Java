// a:2106011014
// b:编写一个银行卡类BankCard，包含卡号、密码、余额、姓名、身份证号等属性，以及存款、取款、修改密码、查询余额、查询姓名、查询密码等方法。
// c:编写一个构造方法，初始化银行卡的身份证号和姓名。
// d:编写一个toString方法，返回银行卡的信息。
// f:编写一个测试类Test，测试银行卡类的各个方法。


public class BankCard {
    long cardNumber;    // 卡号
    String password;    // 密码
    double balance;     // 余额
    String name;        // 姓名
    String idNumber;    // 身份证号

    // 构造方法，初始化银行卡的身份证号和姓名
     BankCard(String idNumber,String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    // toString方法，返回银行卡的信息
    public void toString(double money) {
        balance += money;
    }

    public void deposit(double money) {
        balance += money;
    }

    public void drawMoney(double money) {
        balance -= money;
    }

    public void changePassword(String newPassword) {
        password = newPassword;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return "卡号 = " + cardNumber + "姓名：" + name + "身份证号：" + idNumber + "余额：" + balance;
    }
}



