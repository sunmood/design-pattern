/**
 * Created by sunmood on 2019/1/17.
 */
public class Client {
    public static void main(String[] args) {
        Account account;
        account = new CurrentAccount();
        account.handle("tom","1234");
        account.handle("tom","123");
    }
}
