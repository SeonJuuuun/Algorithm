import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static Map<String, Integer> map;
	static String[] findstr;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		map = new HashMap<>();

		int count = 0;
		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), 0);
		}
		for (int i = 0; i < M; i++) {
			if (map.containsKey(br.readLine())) {
				count++;
			}
		}


		System.out.println(count);

	}
}