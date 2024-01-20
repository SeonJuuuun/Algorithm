import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String s = sc.next();

        long r = 1;
        long sum = 0;
        int M = 1234567891;

        for (int i = 0; i < T; i++) {
            sum += ((s.charAt(i) - 'a' + 1) * r) % M;
            r = (r * 31) % M;
        }

        System.out.println(sum % M);
    }
}
