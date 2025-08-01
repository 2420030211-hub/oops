/**
 * 
 */
package task1_oops;
import java.util.Scanner;
/**
 * 
 */
class switch_case_control_structures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result=0;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number:");
		int first=sc.nextInt();
		System.out.println("Enter your Second number:");
		int second=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the option you want to perform\n1.'+'\n2.'-' \n3.'/'\n4.'*'\n5.'%'");
		String operation=sc.nextLine();
		switch (operation){
			case "+":
				result=first+second;
				System.out.println("the addition of 2 numbers is:"+result);
				break;
			case "-":
				result=first-second;
				System.out.println("the Subtraction of 2 numbers is:"+result);
				break;
			case "/":
				result=first/second;
				System.out.println("the Division of 2 numbers is:"+result);
				break;
			case "*":
				result=first*second;
				System.out.println("the Multiplication of 2 numbers is:"+result);
				break;
			case "%":
				result=first%second;
				System.out.println("the Modulus of 2 numbers is:"+result);
				break;
				default:
					System.out.println("please enter a valid operation!!!");
		}
		sc.close();
	}

}
