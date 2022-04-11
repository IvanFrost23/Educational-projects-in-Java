import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseSum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> q = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        int ma = 0;

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            Scanner scanner2 = new Scanner(s);
            int cnt = 0;
            while (scanner2.hasNextInt()) {
                arr.add(scanner2.nextInt());
                cnt++;
            }
            ma = Math.max(ma, cnt);
            q.add(cnt);
        }
        int[][] sums = new int[q.size()][ma];
        int index = 0;
        for (int i = 0; i < q.size(); i++) {
            for (int j = 0; j < ma; j++) {
                if (j >= q.get(i)) {
                    int sum = 0;
                    if (i > 0) {
                        sum += sums[i - 1][j];
                    }
                    if (j - 1 >= 0) {
                        sum += sums[i][j - 1];
                    }
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        sum -= sums[i - 1][j - 1];
                    }
                    sums[i][j] = sum;
                } else {
                    int sum = arr.get(index);
                    if (i > 0) {
                        sum += sums[i - 1][j];
                    }
                    if (j - 1 >= 0) {
                        sum += sums[i][j - 1];
                    }
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        sum -= sums[i - 1][j - 1];
                    }
                    sums[i][j] = sum;
                    index++;
                    System.out.print(sums[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
