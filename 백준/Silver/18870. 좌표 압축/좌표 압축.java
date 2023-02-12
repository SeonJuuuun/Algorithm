import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[] origin;
	static int[] sorted;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<Integer, Integer> map = new HashMap<>();

		N = Integer.parseInt(br.readLine());
		origin = new int[N];
		sorted = new int[N];
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(sorted);

		for (int v : sorted) {
			if (!map.containsKey(v)) {
				map.put(v, count);
				count++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int key : origin) {
			int ranking = map.get(key);
			sb.append(ranking).append(" ");
		}
		System.out.println(sb);

	}
}