package mercari.birthdaycake;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {


    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int candleAmounts = ar.length;
        int candleMaxCount = 0;
        int tallestCandle = 0;
        for (int i = 0; i < candleAmounts; i++) {
            if (ar[i] >= tallestCandle) {
                if (ar[i] > tallestCandle) {
                    candleMaxCount = 0;
                }
                candleMaxCount += 1;
                tallestCandle = ar[i];
            }
        }
        return candleMaxCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
