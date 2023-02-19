import java.util.*;
import java.io.*;

public class Main {
	static int[] arrA;
	static int[] arrB;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arrA = new int[M];
		arrB = new int[M];


		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			arrA[i] = Integer.parseInt(st.nextToken());   // 6개입
			arrB[i] = Integer.parseInt(st.nextToken());   // 낱개
		}

		Arrays.sort(arrA);
		Arrays.sort(arrB);

		int	min = Math.min((N/6 +1) * arrA[0],Math.min(N*arrB[0],(N / 6) * arrA[0] + (N % 6) * arrB[0]));
		System.out.println(min);

	}
}

