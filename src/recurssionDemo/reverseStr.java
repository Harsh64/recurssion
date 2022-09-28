package recurssionDemo;

public class reverseStr {

	public static void main(String[] args) {
		
		String s= "Harsh";
		char arr[] = s.toCharArray();
		reverse(arr, arr.length, 0);
		
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i];
		}
		System.out.println(ans);
	}
	
	public static void reverse(char arr[],int n,int i) {
		if(i>=n/2)
			return;
		char ch = arr[i];
		arr[i] = arr[n-i-1];
		arr[n-i-1] = ch;
		
		reverse(arr, n, i+1);
	}
}
