import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String s = sc.next();
        char[] array = s.toCharArray();

        int r = 31;
        int sum = 0;

        int[] newArray = new int[T];

        for (int i = 0; i < T; i++) {
            newArray[i] = array[i] - '0' - 48;
            sum += newArray[i] * Math.pow(r, i);
        }

        System.out.println(sum);
    }
}
