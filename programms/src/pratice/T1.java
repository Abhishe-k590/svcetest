package pratice;

public class T1 {
	public static void disp(int no){
		if(no<=10){
			if(no%2==0){
				
			
			System.out.println(no);
			}
		no++;
		disp(no);
		}
	}
public static void main(String[] args){
	disp(1);
}
}
