
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] dp;
	static int N;
	static int count = 0;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		dp = new int[N];


		fib(N);
		System.out.print(count + " ");
		count = 0;
		fibonacci(N);
		System.out.println(count);






	}

	public static int fib(int num) {
		if (num == 1 || num == 2) {
			count++;
			return 1;
		}
		else
			return (fib(num - 1) + fib(num - 2));
	}

	public static int fibonacci(int num) {
		dp[0] = dp[1] = 1;
		for (int i = 2; i < N; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
			count++;
		}

		return count;
	}
}
