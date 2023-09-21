package banking_system;

public class Bank {

    private class Account {
        private int acctNum;
        private int acctBal;
    }
    int size0 = 0;
    int size1 = 0;

    private Account[] accts = new Account[100]; // several users and classes
    private ATM[] atms = new ATM[100];


//    public banking_system.Bank(int s) {
//        size0 = s;
//        atms = new banking_system.ATM[size0];
//        size1 = 0;
//    }

    public int createAccount() {
        Account user = new Account();
        user.acctNum = 20220 + size0;
        user.acctBal = 0;
        accts[size0] = user;
        size0++;
        return user.acctNum;
    }

    public void attachATM(ATM atm) {
        atms[size1] = atm;
        atm.setBank(this);
        size1++;
        // machine1 = atm;
        // atm gets a reference to the banking_system.Bank
    }

    protected boolean checkTheAcct(int acctNum) // individual method to check if account exists or not
    {
        for (int i = 0; i < accts.length; i++) {
            if (accts[i] == null) {
                return false;
            } else if (accts[i].acctNum == acctNum) {
                return true;
                // how to keep track of the acctNUM?
            }
        }
        return false;
    }

    public int accessAcctInfo(int acctNum) throws Exception {

        for (int i = 0; i < accts.length; i++) {
            if (accts[i] == null) {
                throw new Exception("Exception: This account number does not exist!");
            }
            if (accts[i].acctNum == acctNum) {
                return accts[i].acctBal;
            }
        }
        throw new Exception("Exception: This account number does not exist!");

    }

    protected boolean updateAcctBal(int acctNum, int diff) throws Exception {

        for (int i = 0; i < accts.length; i++) {
            if (accts[i] == null) {
                throw new Exception("Exception: This account number does not exist!");
            }
            if (accts[i].acctNum == acctNum) {
                accts[i].acctBal += diff;
                if (accts[i].acctBal < 0){
                    accts[i].acctBal -= diff;
                    throw new Exception("Exception: The resulting balance is negative!"); // I created my func. in that way so that the customer cannot withdraw money is
                }
                System.out.println("The balance after update function is: " + accts[i].acctBal);
                return true;
            }
        }
        throw new Exception("Exception: This account number does not exist!");
    }
}
