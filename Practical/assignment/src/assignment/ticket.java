package assignment;
import java.util.Scanner;

class movieticket{
	String name;
	long ticket;
	String seattype;
	movieticket(String name,long ticket,String seattype){
		this.name=name;
		this.ticket=ticket;
		this.seattype=seattype;
		
	}
	void display() {
		System.out.println("name :" +name+"\n"+"ticket no: "+ticket+ "\n"+"Seat type: "+seattype+"\n");
	}
}

class ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
	System.out.println("enter your movie name");
	String str1=sc.nextLine();
	System.out.println("enter your ticket no");
	long ticketno=sc.nextLong();
	sc.nextLine();
	
	System.out.println("enter to your seat type");
	String str2=sc.nextLine();
	movieticket m= new movieticket(str1,ticketno,str2);
	m.display();
	System.out.println("Enjoy :D");
	
	sc.close();
	



	}

}
