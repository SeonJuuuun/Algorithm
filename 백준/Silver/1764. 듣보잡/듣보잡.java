import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static HashSet<String> first;
	static List<String> result;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		first = new HashSet<>();
		result = new ArrayList<>();


		for (int i = 0; i < N; i++) {
			first.add(br.readLine());
		}

		for (int i = 0; i < M; i++) {
			String second = br.readLine();
			if(first.contains(second)){
				result.add(second);
			}

		}

		System.out.println(result.size());
		Collections.sort(result);

		for (String s : result) {
			System.out.println(s);
		}

	}

}