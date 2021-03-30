package pratice;

public class Demo1 {
	public static void mul(int no)
	{
		if(no<=10)
		{
			if(no%2==0){
			System.out.println(no);
			
		}
		no++;
			mul(no);
		}
	}
	public static void main(String[] args) {
		mul(1);
		
	}

}
