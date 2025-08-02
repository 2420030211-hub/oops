package task1_practical;

import java.util.Scanner;

class Arrays_java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      
	      System.out.println("Enter the size of your array:");
	      int n=sc.nextInt();
	      int []numbers= new int[n];
	      System.out.println("Enter your elements into the array:");
	      for(int i=0;i<n;i++) {
	    	  	numbers[i]=sc.nextInt();
	      }
	      for(int i=0;i<n;i++) {
	    	  System.out.println("located at which index: " +i+ " Element present in the index:"+numbers[i]);
	      }
	      
	      sc.close();
	      
	      
		}

	}


