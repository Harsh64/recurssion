package recurssionDemo;

public class SumOfNNumbers {
	public static void main(String[] args) {
		int n = sum(4);
		sum(4, 0);
		System.out.println(n);
	}
	
	//Functional way 
	public static int sum(int n)
	{
		if(n<=0)
			return 0;
		return n+sum(n-1);
	}
	
	//Parametarized way
	public static void sum(int n,int sum) {
		if(n==0)
		{
			System.out.println(sum);
			return;
		}
		sum(n-1,sum+n);
	}
}
