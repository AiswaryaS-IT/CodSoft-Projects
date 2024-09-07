/*
ATM INTERFACE
1.Create a class to represent the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account
balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.
*/
import java.util.Scanner;
class UserAccount{
    double AccountBalance=1500;
}
class ATM{
    UserAccount ua=new UserAccount();
    public double Withdraw(int amount){
        if(ua.AccountBalance-amount<0){
            return ua.AccountBalance;
        }
        ua.AccountBalance=ua.AccountBalance-amount;
        return ua.AccountBalance;
    }
    public double Deposit(int amount){
        ua.AccountBalance=ua.AccountBalance+amount;
        return ua.AccountBalance;
    }
    public double Checkbalance(){
        return ua.AccountBalance;
    }
}
public class Main
{
	public static void main(String[] args) {
	    ATM atm=new ATM();
	    Scanner sc=new Scanner(System.in);
	    int select;
	    int amount;
		System.out.println("     ________________________________________________________________________");
		System.out.println();         
		System.out.println("                                    ----ATM----                              ");
		System.out.println("     ________________________________________________________________________");
		System.out.println();
		System.out.println("                                    Welcome :)");
		System.out.println("                    ________________________________________________");
		System.out.println("                   |                                                |");
		System.out.println("                   |   NOTE: Minimum Balance should be 1500 or      |");
		System.out.println("                   |         you will be charged Rs.50 as fine      |");
		System.out.println("                   |________________________________________________|");
		System.out.println();
		System.out.println("                     1> Withdraw  2> Deposit  3> Balance  4> Exit");
		do{
		System.out.print("                  Click any of the numbers above to proceed further: ");
		select=sc.nextInt();
		switch(select){
		    case 1:
		        System.out.print("                  Enter the amount to withdraw: ");
		        amount=sc.nextInt();
		        if(atm.Checkbalance()<=0||atm.Checkbalance()-amount<0){
		            System.out.println("                  Withdraw failed :( ");
		            break;
		        }
		        else{
		        atm.Withdraw(amount);
		        if(atm.Withdraw(amount)<1500){
		        System.out.println("                  Rs."+amount+" has been withdrawn");
		        System.out.println("                  You will be charged Rs. 150 as fine");
		        }
		        break;
		        }
		    case 2:
		        System.out.print("                  Enter the amount to deposit: ");
		        amount=sc.nextInt();
		        if(atm.Checkbalance()<1500){
		            if(amount>=150){
		            amount=amount-150;
		            }
		            else{
		                amount=0;
		            }
		            System.out.println("                  Rs. 150 fine amount deducted");
		        }
		            atm.Deposit(amount);
		        System.out.println("                  Rs."+amount+" has been deposited");
		        break;
		    case 3:
		        System.out.println("                  Balance: "+atm.Checkbalance());
		        break;
		    case 4:
		        break;
		    default:
		        System.out.println("                  Invalid entry :(");
		        break;
		}
		}while(select!=4);
		System.out.println("                  Have a Nice Day :)");
		System.out.println("     ________________________________________________________________________");
	}
}
