package outside;

import outside.Customer;
import banking_system.Bank;
import banking_system.ATM;

public class Tester {
    public static void main(String[] args){
        Bank halyk = new Bank();
        Bank jusan = new Bank();
        ATM ala = new ATM();
        ATM ast = new ATM();

        halyk.attachATM(ala);
        jusan.attachATM(ast);

        Customer Talgat = new Customer(halyk, ala);
        Customer Jansaya = new Customer(jusan, ast);
        Customer Henry = new Customer(halyk, ala);

        Talgat.openAccount(); // works
        Talgat.depositMoney(2000);
        Talgat.withdrawMoney(1000);
        System.out.println("Talgat has " + Talgat.checkBalance()); // works

        Jansaya.openAccount();
        Jansaya.depositMoney(12000);
        System.out.println("Jansaya has " + Jansaya.checkBalance());

        Henry.openAccount();
        Henry.withdrawMoney(1000);
        System.out.println("Henry has " + Henry.checkBalance());


//        ala.loginToAccount(Talgat.acctNum); // works
//        ala.deposit(555); // works
//
//        ala.withdraw(200);
//        System.out.println(ala.getBalance()); // works
//        ala.logout();
//        System.out.println(ala.getBalance()); // works
//
//        Henry.openAccount();
//        Henry.depositMoney(3000);
//        System.out.println(Henry.acctNum); // works
//        ala.loginToAccount(Henry.acctNum); // works
//        ala.deposit(555); // works
//        System.out.println(ala.getBalance()); // works
//        ala.withdraw(20000);
//        System.out.println(ala.getBalance()); // works
//        ala.logout();
//        System.out.println(ala.getBalance()); // works
//
//        Jansaya.openAccount();
//        Jansaya.depositMoney(12000);
//        System.out.println(Jansaya.acctNum); // works
//        ast.loginToAccount(Jansaya.acctNum); // works
//        ast.deposit(555); // works
//        System.out.println(ast.getBalance()); // works
//        ast.withdraw(200);
//        System.out.println(ast.getBalance()); // works
//        ast.logout();
//        System.out.println(ast.getBalance()); // works
//        System.out.println(Jansaya.checkBalance()); // works




    }
}
