import java.util.Scanner;

public class Main {

	final static int Red = 1;
	final static int Green = 2;
	final static int Blue = 3;

	static int[][] Cost;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Cost = new int[N+1][4];

		for (int i = 1; i <= N; i++) {
			Cost[i][Red] = sc.nextInt();
			Cost[i][Green] = sc.nextInt();
			Cost[i][Blue] = sc.nextInt();
		}


		for (int i = 2; i <= N; i++) {
			Cost[i][Red] = Math.min(Cost[i - 1][2], Cost[i - 1][3]) + Cost[i][1];
			Cost[i][Green] = Math.min(Cost[i - 1][1], Cost[i - 1][3]) + Cost[i][2];
			Cost[i][Blue] = Math.min(Cost[i - 1][1], Cost[i - 1][2]) + Cost[i][3];
		}

		System.out.println(Math.min(Cost[N][Red],Math.min(Cost[N][Blue],Cost[N][Green])));

	}
}


