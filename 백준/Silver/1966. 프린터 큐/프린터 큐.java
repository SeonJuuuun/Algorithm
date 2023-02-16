import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/*
1. Brute-force
2. Queue 사용

enqueue 4 3 2 1 dequeue

 */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int K = Integer.parseInt(br.readLine());

		while (K-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			LinkedList<int[]> queue = new LinkedList<>();
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < N; i++)
				queue.offer(new int[] {i, Integer.parseInt(st.nextToken())});

			int count = 0;

			while (!queue.isEmpty()) {
				int temp[] = queue.poll();
				boolean isMax = true;

				for (int i = 0; i < queue.size(); i++) {
					if (temp[1] < queue.get(i)[1]) {
						queue.offer(temp);
						for (int j = 0; j < i; j++)
							queue.offer(queue.poll());

						isMax = false;
						break;
					}
				}

				if (isMax == false)
					continue;

				count++;

				if (temp[0] == M)
					break;
			}

			sb.append(count).append('\n');
		}

		System.out.println(sb);
	}

}
