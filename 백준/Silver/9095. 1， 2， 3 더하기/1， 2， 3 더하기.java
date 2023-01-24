import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		int[] DP = new int[11];
		int a;

		DP[0] = 0;
		DP[1] = 1;
		DP[2] = 2;
		DP[3] = 4;

		for (int i = 0; i < N; i++) {
			a = in.nextInt();
			for (int j = 4; j <= a; j++) {
				DP[j] = DP[j - 1] + DP[j - 2] + DP[j - 3];
			}
			System.out.println(DP[a]);
		}




	}

}