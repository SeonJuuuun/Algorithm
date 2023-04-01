import java.io.*;
import java.util.*;

public class Main {
	static Queue<Integer> q;
	static List<Integer> list;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		q = new LinkedList<>();
		list = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			q.add(i);      //if N = 4 q = 1 2 3 4
		}

		while(!q.isEmpty()){
			list.add(q.poll());
			if(q.peek() != null) {
				Integer T = q.poll();
				q.add(T);
			}
		}

		for(int i : list){
			System.out.print(i + " ");
		}

	}
}