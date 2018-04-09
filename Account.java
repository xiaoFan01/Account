public class Account {
    private double balance;

    public Account() {
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double balance1) {
        this.balance += balance1;
    }

    public void withdraw(double balance2) throws Account.MyException {
        this.balance -= balance2;
        if (this.balance < 0.0D) {
            throw new Account.MyException("帐户余额不足，请及时充钱");
        } else {
            System.out.println("取钱" + balance2 + "元");
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100.0D);

        try {
            account.withdraw(120.0D);
        } catch (Account.MyException var3) {
            System.err.println(var3.getMessage());
            var3.getStackTrace();
        }

    }

    class MyException extends Exception {
        public MyException() {
        }

        public MyException(String msg) {
            super(msg);
        }
    }
}
