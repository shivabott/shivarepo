package java_practice;

class in1 {
	
	int a=1,b=6;
	
	public Object  m1() {
		System.out.println(a);
		return b;
	}
}	
class in2  extends in1{
	String s="shiva";
	public void m2() {
		in1 i1=new in1();
		System.out.println(s);
		System.out.println(i1.m1());
	}
}
class in3 extends in2{
	public void m3(String ss) {
		in2 i2=new in2();
		String s3=ss;
		System.out.println(s3);
		i2.m2();
	}
	
}

	
public class inheritance{	
public static void main(String[] args) {
		
		in3 i=new in3();
		i.m3("kumar");
		//System.out.println(i.m2());
		
	}
}

