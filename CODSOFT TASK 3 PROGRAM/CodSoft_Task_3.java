import java.util.*;//package for Scanner class is invoked.

interface Processing //interface for creating options such as withdrawing, depositing, and checkingbalance.
{
    double withdrawing(double amount);
    double depositing(double amount);
    double checkingbalance();
}

abstract class Implementations implements Processing
{
    double balance;

    public double withdrawing(double amount)//method for withdrawing money.
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            return amount;
        }
        else
        {
            System.out.println("Insufficient amount...");
            return 0;
        }
    }

    public double depositing(double amount)//method for depositing money.
    {
        balance += amount;
        return amount;
    }

    public double checkingbalance()//method for checking money.
    {
        return balance;
    }
} 

//Class which represents the user's bank account.
class UserBankAccount extends Implementations
{
    public UserBankAccount(double initialAmount)
    {
        this.balance = initialAmount;//amount is stored.
    }
}

public class CodSoft_Task_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);//Scanner class is invoked.

        System.out.println("----------A T M   I N T E R F A C E----------");
        System.out.println("Enter the amount of money in the bank account of the user: ");
        double initialAmount = sc.nextDouble();

        //object of class UserBankAccount is created.
        UserBankAccount obj = new UserBankAccount(initialAmount);
        
        while(true)
        {
            //The options for ATM processes are given.
            System.out.println("ATM PROCESSES: ");
            System.out.println("1.WITHDRAW MONEY. ");
            System.out.println("2.DEPOSIT MONEY. ");
            System.out.println("3.CHECK BANK BALANCE. ");
            System.out.println("4.EXIT: ");

            //Here we have to enter our choice...
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1: //If choice is 1, then we can withdraw the money.
                        System.out.println("Enter the amount of money to be withdrawn: ");
                        double withdrawAmount = sc.nextDouble();
                        System.out.println("Withdrawal money is: " + obj.withdrawing(withdrawAmount));
                        break;
            
               case 2: //If choice is 2, then we can deposit the money.
                       System.out.println("Enter the amount of money to be deposited: ");
                       double depositedAmount = sc.nextDouble();
                       System.out.println("Deposited money is: " + obj.depositing(depositedAmount));
                       break;

                case 3: //If choice is 3, then we will check the balance left in the ATM.
                        System.out.println("Remaining Bank Balanace is: " + obj.checkingbalance());
                        break;

                default: //If none of the choice are executed then user has given an inavlid choice.
                         System.out.println("INVALID CHOICE...");
                         System.exit(0);
            }
        }
    }
}