package recurssionDemo;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public static void main(String[] args) {
		int arr[] = {2,3,6,7};
		List<Integer> lst = new ArrayList<>();
		int target = 7;
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
 		printSubSequ(0, arr, target, lst, ans);
 		
 		System.out.println(ans);
		
	}
	
	public static void printSubSequ(int i,int arr[],int target,List<Integer> lst,List<List<Integer>> ans) {
		if(i==arr.length)
		{
			if(target == 0)
				ans.add(new ArrayList<>(lst));
			return;
			
		}
		if(target - arr[i] >= 0)
		{
			lst.add(Integer.valueOf(arr[i]));
			printSubSequ(i, arr, target - arr[i], lst, ans);
			lst.remove(lst.size()-1);
		}
		printSubSequ(i+1, arr, target, lst, ans);
		
	}
}
