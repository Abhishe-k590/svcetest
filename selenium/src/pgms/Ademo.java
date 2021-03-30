package pgms;

import java.util.ArrayList;
import java.util.Collections;

public class Ademo {
	public static void main(String[] args) {
		
	
	ArrayList l1 =new ArrayList();
l1.add(10);
l1.add(2);
l1.add(30);
l1.add(60);
l1.add(50);
l1.add(20);


	 for(int i=0;i<l1.size(); i++){
		 Object s = l1.get(i);
		 System.out.println(s);
	 }
	 
	}
}

