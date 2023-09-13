package java_practice;

public class prime {
	public static void main(String args[]) {
		
		int b=5;
		int count=0;
		
		for(int i=1;i<=b;i++) {
		    if(b%i==0) {
		    	System.out.println(i);
		    	count=count+1;
		    }
		}
		if(count==2) {
			System.out.println("prime");	
			
		}
		else {
			System.out.println("not prime");
		}
		
		
		
		boolean flag;
		int c=20;		
		for(int num=2;num<=c;num++) {
			flag=true;
			for (int j=2;j<=num/2;j++) {			
				if(num%j==0) {					
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.print(num+" ");
			}
		}
		
		
		System.out.println("reverse string");
		String st="madam";
		String sm1="";
		for(int i=(st.length()-1);i>=0;i--) {
			sm1=sm1+st.charAt(i);			
			System.out.print(sm1);
		}
		if(st.equals(sm1)) {
			System.out.println("   polindrom ");
		}else {
			System.out.println("   Not polindrom ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
