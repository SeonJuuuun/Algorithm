import java.io.*;
import java.util.*;

public class Main {
	static Map<Long, Long> map;
	static int P;
	static int Q;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());


		long N = Long.parseLong(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		map = new HashMap<>();

		System.out.println(find(N));


	}
	static long find(long num){

		if(num == 0){
			return 1;
		}
		if(map.containsKey(num)){
			return map.get(num);
		}

		map.put(num,find(num/P)+find(num/Q));
		return map.get(num);


	}
}