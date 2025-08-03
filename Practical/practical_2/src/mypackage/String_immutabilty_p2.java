package mypackage;
import java.util.Scanner;


class String_immutabilty_p2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	String kridhay="hello";
	kridhay.concat("user");
    System.out.println("before immuting the String:"+kridhay);
    String hi="User";
    kridhay=kridhay+hi;
    System.out.println("after immuting the string:"+kridhay);
sc.close();
	}

}
