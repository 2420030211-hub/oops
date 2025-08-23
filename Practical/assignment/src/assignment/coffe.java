package assignment;
import java.util.Scanner;

class coffeorder{
	String size;
	int small=50;
	int medium=70;
	int large=90;
	
	
	coffeorder(String size){
		this.size=size.toLowerCase();
		
		
		
	}
	void display() {
		if(size.equals("small"))
	System.out.println("your coffee is served is small:"+small);
		else if(size.equals("large"))
			System.out.println("your coffee is served large:"+large);
		else if(size.equals("medium"))
			System.out.println("your coffee is served medium:"+medium);
		else
			System.out.println("your coffee size is invalid");
		
	}
}
class coffe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your Size for ur coffee");
		String str1=sc.nextLine();
		coffeorder c= new coffeorder  (str1);
		c.display();
		sc.close();
		
		
		
	}

}

