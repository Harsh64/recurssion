package recurssionDemo;

public class palindrome {
	public static void main(String[] args) {
		String s = "madam"; //masda
		char arr[] = s.toCharArray();
		System.out.println(reverse(arr, 0));
	}
	
	public static boolean reverse(char arr[],int i)
	{
		int n = arr.length;
		if(i>=n/2)
			return true;
		if(arr[i]!=arr[n-i-1])
			return false;
		return reverse(arr, i+1);	
	}
}
