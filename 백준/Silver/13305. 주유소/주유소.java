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

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] distance = new int[N-1];
		int[] gas = new int[N];

		for (int i = 0; i < distance.length; i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			gas[i] = Integer.parseInt(st.nextToken());
		}

		int sum = 0;
		int minCost = gas[0];	// 이전 까지의 과정 중 주유 최소 비용

		for(int i = 0; i < N - 1; i++) {

			/*
			 *  현재 주유소가 이전 주유소의 기름값보다 쌀 경우
			 *  minCost를 갱신해준다.
			 */
			if(gas[i] < minCost) {
				minCost = gas[i];
			}

			sum += (minCost * distance[i]);
		}

		System.out.println(sum);




	}
}