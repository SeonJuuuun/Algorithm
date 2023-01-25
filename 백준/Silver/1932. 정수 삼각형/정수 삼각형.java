import java.util.Scanner;

public class Main {

	static int n;
	static Integer[][] DP;
	static int[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n][n];
		DP = new Integer[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			DP[n - 1][i] = arr[n - 1][i];
		}

		System.out.println(solution(0, 0));

	}

	static int solution(int i, int j) {

		if (i == n - 1) {
			return DP[i][j];
		}

		if (DP[i][j] == null) {
			DP[i][j] = Math.max(solution(i + 1, j), solution(i + 1, j + 1)) + arr[i][j];
		}

		return DP[i][j];
	}

}




