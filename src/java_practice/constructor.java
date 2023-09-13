package java_practice;

class constructor {
	
	constructor(int a,String s) {
		int num= a;
		String name= s;
		System.out.println(num+" "+name);
	}

	constructor(){
		
		System.out.println("shiva");
		
		
	}
	
	public static void main(String args[]) {
		constructor c=new constructor(2,"kumar");
		//c.m1(1, "shiva");
		constructor cc=new constructor();
			
	}

}
