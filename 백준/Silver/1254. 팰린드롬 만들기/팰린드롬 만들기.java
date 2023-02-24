import java.util.Scanner;
import java.io.*;

public class Main {



	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int answer = str.length();

		for (int i = 0; i < str.length(); i++) {
			if(isPallen(str.substring(i))){
				break;
			}
			answer++;
		}
		System.out.println(answer);


	}

	private static boolean isPallen(String length) {
		int start = 0;
		int end = length.length()-1;
		while(start<=end) {
			if (length.charAt(start) != length.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}


		return true;
	}

}
