import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> q = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            Scanner scanner2 = new Scanner(s);
            int cnt = 0;
            while (scanner2.hasNextInt()) {
                arr.add(scanner2.nextInt());
                cnt++;
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
