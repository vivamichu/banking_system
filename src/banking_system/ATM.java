package banking_system;

public class ATM {

    private int customerID = 0;
    private Bank name;

    protected void setBank(Bank b){
        name = b;
    }
    public boolean loginToAccount(int acctNum){
        if (name.checkTheAcct(acctNum)){
            customerID = acctNum;
            return true;
        }
        else
        {
            return false;
        }
    }


    public boolean deposit(int amount) {
        if (customerID == 0)
        {
            return false;
        }

        try {

            if (name.updateAcctBal(customerID, amount)) {
                return true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public boolean withdraw(int amount) {
        if (customerID == 0)
        {
            return false;
        }
//        balance = accessAcctInfo(customerID);
//        balance -= amount;
        try {

            if (name.updateAcctBal(customerID, -amount)) {
                return true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public int getBalance() {
        int bal = 0;
        if (customerID == 0)
        {
            return bal;
        }

        try {
           bal = name.accessAcctInfo(customerID);
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return bal;
        //return acctBal;
    }

    public void logout(){

        customerID = 0;

    }


}
