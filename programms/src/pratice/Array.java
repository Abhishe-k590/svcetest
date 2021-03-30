package pratice;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20.5);
		l1.add('A');
		System.out.println(l1);
		l1.add(2, 'A');
		System.out.println(l1);
		ArrayList l2=new ArrayList();
		l2.add("hello");
		l2.add("hiii");
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println(l2);
		
		

	}

}
