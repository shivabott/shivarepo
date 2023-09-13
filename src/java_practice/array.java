package java_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class array {
	public static void main(String args[]) {
		
		int temp=0;
		int ar[]= {3,4,5,6,1,2};
		for (int i=0;i<ar.length;i++) {
			
			for (int j=i+1;j<ar.length;j++) {
				
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
			System.out.print(ar[i]+" ");
		}
		
		
		int a[]= {1,2,3,4};
		int max=a[0];
		for (int i1=0;i1<a.length;i1++) {
			if(max<a[i1]) {
				max=a[i1];
			}
		}
		System.out.println("max number is "+(max-1));
		
		
		int a1[]= {1,3,5,2,9};
		int sum=0;
		for (int i2=0;i2<a1.length;i2++) {
			sum=sum+a1[i2];
		}
		System.out.println(sum);
		
		
		int a2[]= {1,2,2,3,3,4};
		for(int x=0;x<a2.length;x++) {
			for(int y=x+1;y<a2.length;y++) {
				if(a2[x]==a2[y]) {
					System.out.println(a2[x]);
				}
			}	
		}
		System.out.println();
		
		int arr[]= {2,6,44,1,3};
		for (int m=0;m<arr.length;m++) {
			for (int n=m+1;n<arr.length;n++) {
				if(arr[m]>arr[n]) {
					int temp1=arr[m];
					arr[m]=arr[n];
					arr[n]=temp1;
				}
			}
			System.out.println(arr[m]);
		}
		
		
		int arrr[]= {2,6,7,44,11};
		boolean flag=false;
		for(int m1=0;m1<arrr.length;m1++) {
			if(arrr[m1]==6) {
				System.out.println("element found at "+(m1+1)+" position");
				flag=true;
				//break;
			}
		}
		if(flag==false) {
			System.out.println("elment not found ");
		}
		
		
		int n1[]= {1,2,3,5};
		int k;
		int sum1=0;
		int sum2=0;
		for( k=1;k<=5;k++) {
			sum1=sum1+k;
		}
		for(int k1=0;k1<n1.length;k1++) {
			sum2=sum2+n1[k1];
			System.out.println(sum2);
		}
		System.out.println(sum2+" "+sum1);
		System.out.println(sum1-sum2);
		
		
		
		ArrayList list=new ArrayList();
		list.add("shiva");
		list.add("kumar");
		list.add("ram");
		for(Object ls: list) {
			System.out.println(ls);
		}
		
		String st[]={"shiva","ram"};
		for(Object ob:st) {
			if(ob=="shiva") {
				System.out.println(ob);
			}
		}
		
		Map ob1=new HashMap();
		ob1.put("name", "shiva");
		ob1.put("num", 3456);
		System.out.println(ob1);
		System.out.println(ob1.get("num"));
		if(ob1.containsKey("name")) {
			System.out.println(ob1.get("name"));
		}
		
		
		Set set=new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		for(Object set1:set) {
			if(set1.equals(3)) {
				System.out.println(set1);
			}
			//System.out.println(set1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
