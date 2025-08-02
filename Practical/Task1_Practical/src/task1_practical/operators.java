package task1_practical;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("enter your 1 st number to add ");
 int a=sc.nextInt();
 System.out.println("enter your 2nd number to add");
 int b=sc.nextInt();
 int c=a+b;
 int d=a-b;
 int e=a*b;
 int f=a%b;
 int u=a/b;
 
 System.out.println("sum of the two numbers is:"+c);
 System.out.println("difference of the two numbers is:"+d);
 System.out.println("multiplication of the two numbers is:"+e);
 System.out.println("modulus of the two numbers is:"+f);
System.out.println("divison of the two number is:"+u);
sc.close();

	}
	
}
