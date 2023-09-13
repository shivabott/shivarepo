package java_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting {
	public static void main(String args[]) {
		List a=new ArrayList();
		a.add(3.99);
		a.add(7.99);
		a.add(2.99);
		a.add(1.99);
		Collections.sort(a);
		System.out.println(a);
	}

}
