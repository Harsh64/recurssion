package recurssionDemo;

public class printNnumbrs {
	public static void main(String[] args) {
		System.out.print("Print N to 1 numbers  ");
		printNto1(4,4);
		System.out.println("\n");
		System.out.print("Print 1 to N numbers  ");
		print1toN(1,4);
		System.out.println("\n");
		System.out.print("Print 1 to N numbers using backtracking  ");
		print1toNBackTracking(4,4);
		System.out.println("\n");
		System.out.print("Print N to 1 numbers using backtracking  ");
		printNto1backTracking(1, 4);
	}
	
	public static void printNto1(int i,int n) {
		if(i<1)
			return;
		System.out.print(i);
		printNto1(i-1,n);
	}
	
	public static void print1toN(int i,int n) {
		if(i>n)
			return;
		System.out.print(i);
		print1toN(i+1,n);
	}
	
	public static void print1toNBackTracking(int i,int n) {
		if(i<1)
			return;
		print1toNBackTracking(i-1,n);
		System.out.print(i);
	}
	
	public static void printNto1backTracking(int i,int n) {
		if(i>n)
			return;
		printNto1backTracking(i+1,n);
		System.out.print(i);
	}
}
