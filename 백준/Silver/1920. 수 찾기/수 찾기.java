
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		StringBuilder sb = new StringBuilder();

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			if (find(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append('\n');
			} else
				sb.append(0).append('\n');
		}

		System.out.println(sb);

	}

	private static int find(int num) {
		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;  // mid = 2
			if (num < arr[mid]) {
				hi = mid - 1;  // hi = 1
			}
			else if (num > arr[mid]) {
				lo = mid + 1;   // mid = 3;
			}
			else {
				return mid;
			}

		}
		return -1;
	}
}
