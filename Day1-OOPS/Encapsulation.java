import java.util.Random;

     class BankAccount{
        private String accountHolderName;
        private int accountNumber;
        private  int accountBalance;

        public BankAccount(String accountHolderName){
            this.accountHolderName = accountHolderName;
            this.accountNumber = createAccountNumber();
        }
        
        public int createAccountNumber() {
            Random rand = new Random();
            int randomAccountNumber = rand.nextInt(99999999 - 10000000 + 1) + 10000000;
            return randomAccountNumber;
        }

        int depositBalance(int amount){
            // certain operation you want
            accountBalance += amount;
            return accountBalance;
        }

        int getAccountNumber(){
            return accountNumber;
        }

        int getAccountBalance(){
            return accountBalance;
        }

    }

public class Encapsulation {
    public static void main(String [] args){
            BankAccount account1 = new BankAccount("shubham");
            System.out.println( account1.getAccountNumber());
            System.out.println(account1.getAccountBalance());


            // outside of the class we dont call these directly
            // System.out.println(account1.accountNumber);
            // System.out.println(account1.accountBalance);
              
    }

}
