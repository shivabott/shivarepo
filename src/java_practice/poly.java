package java_practice;

public class poly {
	public static void main(String args[]) {
		
		int n1=0,n2=1;
		//int n3=0;
		for(int i=0;i<=10;i++) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			n3=n1;			
			System.out.println(n3);				
		}
		
		
		int a1=10,b1=20;
		
		System.out.println(a1+"-"+b1);
		int rev=0;
		int num=1234;
		while(num>0) {
			int rem =num%10;
			rev=rev*10+rem;
			num=num/10;						
		}
		System.out.println(rev);
		
		//printing 1 to 30 only 5 divisible
		for (int x=1;x<=30;x++) {
			if(x%5==0) {
				System.out.println(x);
			}	
		}
		
		
		for(int y=0;y<=20;y++) {
			if(y%2==0) {
				if(y%4!=0){
					System.out.println(y);
				}
			}
		}
		
		for (int c1=1;c1<=10;c1++) {
			int l=c1*c1;
			System.out.println(l);
		}
		
		int d1=3,d2=4;
		int d=d1*d2/2;
		System.out.println("avg is - "+d);
		
		
		int count1=0;
		String s="shivakumar";
		for (int g=0;g<s.length();g++) {
			if(s.charAt(g)=='a'||s.charAt(g)=='e'||s.charAt(g)=='i' ||s.charAt(g)=='o'||s.charAt(g)=='u') {
				count1=count1+1;	
		}
		}
		System.out.println(count1);
		
		int count2=0;
		String ss="This is shiva kumar";
		ss.replaceAll(" ", "");
		System.out.println(ss);
		for (int i1=0;i1<ss.length();i1++) {
			if(ss.charAt(i1)>='a'&& ss.charAt(i1)<='z') {
				count2=count2+1;
				System.out.println();
			}
		}
		System.out.println(count2);
		
		int i2;
		String ss2="mahesh";
		for (i2=ss2.length();i2>0;i2--) {
			System.out.print(ss2.charAt(i2-1));
		}
		
		
		int x1=1,x2=35,x3=6;
		if(x1>x2 && x1>x3) {
			System.out.println(x1);
		}
		else if(x2>x1 && x2>x3) {
			System.out.println(x2);
		}
		else{
			System.out.println(x3);
		}
		
		
		String sf="shiva";
		int counts=0;
		int y3;
		for (y3=sf.length();y3>0;y3--) {
			System.out.print(sf.charAt(y3-1));
			counts=counts+1;
		}
		System.out.println(" length of string "+counts);
		
		
		String sg="welcome to shiva kumar";
		int countw=1;
		for(int w1=1;w1<sg.length();w1++) {
			if(sg.charAt(w1-1)==' ') {
				countw=countw+1;
				sg=sg.replaceAll("\\s", "");
			}			
		}
		System.out.println("after remove white spaces - "+sg+  " - number of words "+ countw);
		
		
		
		
		
		
		
		
		
		
	}

}
