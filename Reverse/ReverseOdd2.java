import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseOdd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> q = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            Scanner scanner2 = new Scanner(s);
            int cnt = 0;
            int r = 0;
            while (scanner2.hasNextInt()) {
                int num = scanner2.nextInt();
                if ((r + q.size()) % 2 == 1) {
                    arr.add(num);
                    cnt++;
                }
                r++;
            }
            q.add(cnt);
        }
        int now = arr.size() - 1;
        for (int i = q.size() - 1; i >= 0; i--) {
            for (int j = 0; j < q.get(i); j++) {
                System.out.print(arr.get(now) + " ");
                now--;
            }
            System.out.println();
        }
    }
}
