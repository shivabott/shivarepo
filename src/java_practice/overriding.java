package java_practice;

class over1 {
	void m7() {
		System.out.println("kumar");
	}
}

class over2 extends over1{
	void m7() {
		System.out.println("shiva");
		
	}
}
class over3 extends over2{
	void m7() {
		System.out.println("raj");
		System.out.println("laal");
	}
	
}
public class overriding{
	public static void main(String[] args) {
		
		over3 h=new over3();
		h.m7();
		
	}
}
	
