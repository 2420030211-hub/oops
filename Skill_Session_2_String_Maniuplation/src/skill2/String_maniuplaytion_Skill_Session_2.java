package skill2;
import java.util.Scanner;


class String_maniuplaytion_Skill_Session_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your String");
		String kridhay= sc.nextLine();
		char lastchar=kridhay.charAt(kridhay.length()-1);
		String cat="hello";
		
		
		
		System.out.println("the length of the String is:"+kridhay.length());
		System.out.println("converting the String to UpperCase:"+kridhay.toUpperCase());
		System.out.println("converting the string to LowerCase:"+kridhay.toLowerCase());
		System.out.println("the first letter of the String is:"+kridhay.charAt(0));
		System.out.println("the last letter of the String is:"+lastchar);
		System.out.println("Concatinating the String with 'hi we get:"+kridhay +cat);
			sc.close();
		
		
		

	}

}
