package outside;

import banking_system.Bank;
import banking_system.ATM;

public class Customer {
    private Bank bank;
    private ATM machine;
    protected int acctNum;

    public Customer(Bank name, ATM atm)
    {
        bank = name;
        machine = atm;
    }

    public boolean openAccount(){
        acctNum = bank.createAccount();
        return true;
    }

    public boolean depositMoney(int amount) {
        machine.loginToAccount(acctNum);
        machine.deposit(amount);
        machine.logout();
        return true;
    }

    public boolean withdrawMoney(int amount) {
        machine.loginToAccount(acctNum);
        machine.withdraw(amount);
        machine.logout();
        return true;
    }

    public int checkBalance() {
        machine.loginToAccount(acctNum);
        int bal = machine.getBalance();
        machine.logout();
        return bal;
    }
}
