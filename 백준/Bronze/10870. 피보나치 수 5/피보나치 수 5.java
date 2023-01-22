import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		
		
		System.out.println(fib(n));
		
	
	}

	public static int fib(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1) return n;
		return fib(n-2) + fib(n-1);
	}
	
	
	

}