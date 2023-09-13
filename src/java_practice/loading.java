package java_practice;

public class loading {

	void m1() {
		System.out.println("m1");
	}
	
	void m1(int a) {
		System.out.println(a);
	}
	
	void m1(int a, String s) {
		System.out.println(a+ "  "+s);
	}
	
	
	
	public static void main(String[] args) {
		loading l=new loading();
		l.m1();
		l.m1(3);
		l.m1(2, "shiva");
	}

}
