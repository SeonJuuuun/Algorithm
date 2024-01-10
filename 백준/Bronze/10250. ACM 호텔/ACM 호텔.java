import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int baseValue = 100;

            List<Integer> map = new ArrayList<>();

            for (int j = 1; j <= W; j++) {
                for (int k = 1; k <= H; k++) {
                    int currentValue = baseValue * k + j;
                    map.add(currentValue);
                }
            }
            System.out.println(map.get(N - 1));
        }
    }
}
