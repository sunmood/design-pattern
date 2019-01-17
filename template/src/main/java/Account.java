
/**
 * Created by sunmood on 2019/1/17.
 * 抽象账户类
 */
public abstract class Account {
    /**
     * 验证登录信息
     * 基本方法——具体方法
     * @param account
     * @param password
     * @return
     */
    public boolean validate(String account, String password){
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
        if (account.equals("tom") && password.equals("123")){
            return true;
        } else {
            return false;
        }
    }

    /**
     * 计算利息
     * 基本方法——抽象方法
     */
    public abstract void calculateInterest();

    /**
     * 显示利息
     * 基本方法——具体方法
     */
    public void display(){
        System.out.println("显示利息！");
    }

    /**
     * 模板方法
     * @param account
     * @param password
     */
    public void handle(String account, String password){
        if (!validate(account,password)){
            System.out.println("账户或密码错误！");
            return;
        }

        calculateInterest();
        display();
    }
}
