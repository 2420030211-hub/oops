package task1_oops;
import java.util.Scanner;
class datatypes {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("hello user enter your name");
		String name = sc.nextLine();
		System.out.println("Enter User's university");
		String clg=sc.nextLine();
		System.out.println("enter user age");
		int age= sc.nextInt();
		sc.nextLine();
		System.out.println("enter user's Gender");
		String gender = sc.nextLine();
		
		System.out.println("enter user's cgpa");
		float cgpa = sc.nextFloat();
		System.out.println("Name: " +name+ " age: " +age+ " Gender: " +gender+ " cgpa: " +cgpa);
		
		
		
	}

}
