package skill2;



class immutability_skill2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello";
		str.concat(str);
		System.out.println("after concat:"+str);
		str=str.concat("User");
		System.out.println("after reassigning:"+str);
	
	  

	}

}
