import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int add = 0;
		while (true) {
			int total = N + add;
			int count = 0;
			while (total > 0) {
				if (total % 2 != 0)
					count++;
				total /= 2;
			}
			if (count <= K)
				break;
			add++;
		}
		System.out.println(add);
	}

}


