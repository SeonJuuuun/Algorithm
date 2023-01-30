import java.util.Scanner;

public class Main {
	static int[] dp;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		dp = new int[N+1];
		dp[0] = 1;
		dp[1] = 2;


		for (int i = 2; i < N; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
		}
		System.out.println(dp[N-1]);
	}

}


