package pratice;

public class Demo {
	public static void main(String[]args){
		
		int arr[]={10,30,5,20,2};
		int n=arr.length;
		for(int i=1;i<=n-1;i++){
			for(int j=1;j<n-1;j++){
				if(arr[j]<arr[j+1])
				{
					int tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}
			}
		}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}