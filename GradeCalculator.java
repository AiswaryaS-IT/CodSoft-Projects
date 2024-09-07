/*
STUDENT GRADE CALCULATOR
Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user
*/

import java.util.Scanner;
public class Main
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    int total;
	    double percent;
	    System.out.println("          ___________________________________________________________________");
	    System.out.println();
		System.out.println("                          --- STUDENT GRADE CALCUKULATOR ---                 ");
		System.out.println("          ___________________________________________________________________");
		System.out.println();
		System.out.print("                    Enter the total number of Subjects: ");
		int subs=sc.nextInt();
		System.out.println("                    Enter marks for each Subject ");
		total=TotalMarks(subs,0);
		System.out.println("          ___________________________________________________________________");
		System.out.println();
		System.out.println("                                    --- RESULTS ---                          ");
		System.out.println("          ___________________________________________________________________");
		System.out.println();
		System.out.println("                         Total: "+total);
		percent=Percentage(subs,total);
		System.out.println("                    Percentage: "+percent+"%");
		System.out.println("                         Grade: "+Grade(percent));
		System.out.println("          ___________________________________________________________________");
	}
	public static int TotalMarks(int subs,int total){
	    int[] marks=new int[subs];
	    for(int i=0;i<subs;i++){
	        System.out.print("                    Subject("+(i+1)+"): ");
	        marks[i]=sc.nextInt();
	        total+=marks[i];
	    }
	    return total;
	}
	public static double Percentage(int subs,int total){
	    return (total/subs);
	}
	public static char Grade(double percent){
	    if(percent>90){
	        return 'A';
	    }
	    else if(percent>80){
	        return 'B';
	    }
	    else if(percent>70){
	        return 'C';
	    }
	    else if(percent>60){
	        return 'D';
	    }
	    else if(percent>50){
	        return 'E';
	    }
	    else{
	        return 'F';
	    }
	}
}
