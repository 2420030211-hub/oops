package task1_oops;
import java.util.Scanner;

class controlstructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=sc.nextInt();
	if(age>=18) {
		System.out.println("ur are eligible to vote ");
		
	}
	else
		System.out.println("ur not eligible to vote ");

	}

}
