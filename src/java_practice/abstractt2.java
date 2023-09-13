package java_practice;

class ab extends abs{
		void m1() {
			System.out.println("shiva");
			m2();
		}
		@Override
		void m3() {
			System.out.println("kumar");	
		}
		void m2() {
			System.out.println("raj");
			m3();
		}
	}
public class abstractt2 {
	public static void main(String[] args) {
		ab a=new ab();
		a.m1();
		a.m3();
		a.m2();
		a.m4();

	}
}

