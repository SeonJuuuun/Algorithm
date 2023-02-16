

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] aArr;
	static int[] bArr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		aArr = new int[N];
		bArr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			aArr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			bArr[i] = Integer.parseInt(st.nextToken());

		}

		Arrays.sort(aArr);
		Arrays.sort(bArr);
		int sum = 0;

		for (int i = 0; i < N; i++) {
			sum += aArr[i] * bArr[N - 1 - i];
		}
		System.out.println(sum);

	}
}
