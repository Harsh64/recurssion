package recurssionDemo;

import java.util.ArrayList;
import java.util.List;

public class findSubSequenceWithSumN {
	public static void main(String[] args) {
		
		int arr[] = {1,2,1};
		int n = arr.length;
		List<Integer> lst = new ArrayList<>();
		System.out.println("Find all subsequnces whose sum is K");
		printSubSequ(arr, lst,0,n,2,0);
		System.out.println("-----------------------------------");
		System.out.println("Find only one subsequnces whose sum is K");
		printOnlyOneSubSequ(arr, lst, 0, n, 2, 0);
		System.out.println("-----------------------------------");
		System.out.println("Find count of subsequnces whose sum is K");
		System.out.println(printCountOfSubSequnce(arr, 0, n, 2, 0));
		System.out.println("-----------------------------------");
	}
	
	
	public static void printSubSequ(int arr[],List<Integer> lst,int i,int n,int sum,int s) {
		if(i==n)
		{
			if(s == sum)
			System.out.println(lst);
			return;
		}
		lst.add(Integer.valueOf(arr[i]));
		s+=arr[i];
		printSubSequ(arr, lst,i+1,n,sum,s);
		lst.remove(Integer.valueOf(arr[i]));
		s-=arr[i];
		printSubSequ(arr, lst,i+1,n,sum,s);
	}
	
	public static boolean printOnlyOneSubSequ(int arr[],List<Integer> lst,int i,int n,int sum,int s) {
		if(i==n)
		{
			if(s == sum)
			{
				System.out.println(lst);
				return true;
			}
			else
			{
				return false;
			}
		}
		lst.add(Integer.valueOf(arr[i]));
		s+=arr[i];
		if(printOnlyOneSubSequ(arr, lst,i+1,n,sum,s) == true) 
			return true;
		lst.remove(Integer.valueOf(arr[i]));
		s-=arr[i];
		if(printOnlyOneSubSequ(arr, lst,i+1,n,sum,s) == true)
			return true;
		else return false;
	}
	
	public static int printCountOfSubSequnce(int arr[],int i,int n,int sum,int s) {
		if(i==n)
		{
			if(s == sum)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		s+=arr[i];
		int l = printCountOfSubSequnce(arr,i+1,n,sum,s); 
		s-=arr[i];
		int r = printCountOfSubSequnce(arr,i+1,n,sum,s);
		return l+r;
	}
}
