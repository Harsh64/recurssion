package recurssionDemo;

import java.util.ArrayList;
import java.util.List;

public class findSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,1,2};
		int n = arr.length;
		List<Integer> lst = new ArrayList<>();
		printSubSequ(arr, lst,0,n);
//		
		
	}

	
	public static void printSubSequ(int arr[],List<Integer> lst,int i,int n) {
		if(i==n)
		{
			System.out.println(lst);
			return;
		}
		lst.add(Integer.valueOf(arr[i]));
		printSubSequ(arr, lst,i+1,n);
		lst.remove(Integer.valueOf(arr[i]));
		printSubSequ(arr, lst,i+1,n);
	}
}
