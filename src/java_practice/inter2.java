package java_practice;

class mac2 implements mac{
	public void m2() {
		System.out.println("kumar");
	}
	public void m1() {
		System.out.println("shiva");
	}
	@Override
	public void m3() {
		System.out.println("raj");
		
	}
}
public class inter2 {
	public static void main(String[] args) {		
		mac2 m=new mac2();
		m.m2();
		m.m1();
		m.m3();
	}
}


