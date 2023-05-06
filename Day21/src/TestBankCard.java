public class TestBankCard {
    public static void main(String[] args) {
        BankCard card = new BankCard("2106011016", "牛津创(黄毛)");
        System.out.println("初始余额：" + card.getBalance());
        card.deposit(1000.0);
        System.out.println("存款后余额：" + card.getBalance());
        card.drawMoney(500.0);
        System.out.println("取款后余额：" + card.getBalance());
        card.changePassword("ljcsgxhm");
        System.out.println("新密码：" + card.getPassword());
        System.out.println("卡信息：" + card.toString());
    }
}
