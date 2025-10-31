//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public static void main(String[] args) {
        Hdfc AshishAccount = new Hdfc("Ashish Gaur","abc",1000);
        System.out.println(AshishAccount.getAccountNo());
        AshishAccount.deposit(1000);
        System.out.println(AshishAccount.checkBalance("xyz"));
        System.out.println(AshishAccount.checkBalance("abc"));
        AshishAccount.withdraw(1000, "xyz");
        AshishAccount.withdraw(1000, "abc");
        AshishAccount.withdraw(5000, "abc");
        System.out.println(AshishAccount.calculateInterest(2));
    }
}
