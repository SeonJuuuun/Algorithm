

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(find(Integer.parseInt(br.readLine())));




	}

	public static int find(int num) {
		int count = 0;

		if(num < 100){
			return num;
		}
		else
			count = 99;
		for (int i = 100; i <= num; i++) {
			int hun = i / 100;
			int ten = (i / 10) % 10;
			int one = i % 10;
			if((hun-ten) == (ten - one)){
				count++;
			}
		}
		return count;
	}
}
