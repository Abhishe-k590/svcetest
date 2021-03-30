package pgms;


public class Impotant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2 };
		int count = b.length;
		if (a.length > count) {
			count = a.length;
		}
		int c[] = new int[count];

		for (int i = 0; i < count; i++) {
			try {
				c[i] = a[i] + b[i];
			}

			catch (Exception e) {
				// TODO: handle exception
				
			
			try{
				 c[i] = b[i];
			}
			catch (Exception o) {
				// TODO: handle exception
				c[i] = a[i];
			}                                                  
			}
			System.out.println(c[i]);
		}
		

	}



	}


