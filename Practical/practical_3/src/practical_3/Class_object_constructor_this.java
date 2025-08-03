package practical_3;
import java.util.Scanner;

class student{
	String name;
	int age;
	String rollno;
	
	student(String name,int age,String rollno){
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		
	}
	void display() {
		System.out.println("Student name: "+name+" Student age: "+age+" Student rollno: "+rollno);
	}
}

public class Class_object_constructor_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the first Student name:");
	        String name1 = sc.nextLine();
	        System.out.println("Enter Roll No:");
	        String rollno1 = sc.nextLine();
	        System.out.println("Enter Age:");
	        int age1 = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter the second Student name:");
	        String name2 = sc.nextLine();
	        System.out.println("Enter Roll No:");
	        String rollno2 = sc.nextLine();
	        System.out.println("Enter Age:");
	        int age2 = sc.nextInt();
	         student s1=new student(name1,age1,rollno1);
	         student s2=new student(name2,age2,rollno2);
	         s1.display();
	         s2.display();
	         sc.close();

		
		

	}

}
