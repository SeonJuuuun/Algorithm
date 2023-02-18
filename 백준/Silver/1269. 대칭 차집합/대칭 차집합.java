import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static Set<Integer> set;
	static Set<Integer> set1;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		set = new HashSet<>();
		set1 = new HashSet<>();
		int count = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < B; i++) {
			set1.add(Integer.parseInt(st.nextToken()));
		}
		for (int num : set) {
			if (!set1.contains(num)) {
				count++;
			}
		}


		for (int num : set1) {
			if(!set.contains(num)){
				count++;
			}
		}


		System.out.println(count);





	}
}