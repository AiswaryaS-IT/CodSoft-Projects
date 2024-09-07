import java.util.Random;
import java.util.Scanner;
public class Main
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("      ____________________________________________________________");
		System.out.println();
		System.out.println("                             GUESS THE NUMBER                     ");
		System.out.println("      ____________________________________________________________");
		System.out.println();
		System.out.print("        Choose the limit to generate random number: ");
		int limit=sc.nextInt();
		System.out.println("        Initial points: 300  Initial Life: 3");
		System.out.print("        Guess the number: ");
		int num=sc.nextInt();
		RandomNumberGenerator(limit,num,3,300);
		System.out.println();
		System.out.println("      ____________________________________________________________");
		
	}
	public static void RandomNumberGenerator(int lim,int number,int life,int points){
	    Random random=new Random();
	    // Generate random integers in range 0 to lim
	    int randnum=random.nextInt(lim);
	    while(true){
	    if(randnum==number){
	        System.out.println("        Hurray! You won with "+points+" points!");
	        break;
	    }
	    else if(randnum<number){
	        System.out.println("        Ouch! You lost a life...");
	        System.out.println("        The number you entered is greater than the random number");
	        life--;
	        points=points-100;
	        System.out.println("        Points left: "+points+"  Life: "+life);
	        if(life==0){
	            System.out.println("        You Lost, Better Luck Next Time ;^)");
	            break;
	        }
	        System.out.print("        Try again, Enter the number: ");
	        number=sc.nextInt();
	    }
	    else if(randnum>number){
	        System.out.println("        Oops! You lost a life...");
	        System.out.println("        The number you entered is less than the random number");
	        life--;
	        points=points-100;
	        System.out.println("        Points left: "+points+"  Life: "+life);
	        if(life==0){
	            System.out.println("        You Lost, Better Luck Next Time :)");
	            break;
	        }
	        System.out.print("        Try again, Enter the number: ");
	        number=sc.nextInt();
	    }
	    }
	    
	}
}
