package mercari.test.array;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'countMoves' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */
    public static void main(String[] args) {
        List <Integer> test = new ArrayList <>();
        test.add(2);
        test.add(2);
        test.add(6);
        test.add(5);

        System.out.println(countMoves(test));
    }

    private long iterationAmount = 0;

    public static long countMoves(List <Integer> numbers) {
        // Write your code here
        return recursiveArray(numbers, 0);
    }

    private static long recursiveArray(List <Integer> numbers, long iteration) {
        if (verifyAllEqual(numbers)) {
            return iteration;
        }
            int maxValueIndex = 0;
            int maxValue = 0;

            maxValueIndex = getMaxValueIndex(numbers, maxValueIndex, maxValue);
            increaseNumbers(numbers, maxValueIndex);

            iteration = recursiveArray(numbers, ++iteration);
            return iteration;
    }

    private static void increaseNumbers(List <Integer> numbers, int maxValueIndex) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i != maxValueIndex) {
                numbers.set(i, numbers.get(i) + 1);
            }
        }
    }

    private static int getMaxValueIndex(List <Integer> numbers, int maxValueIndex, int maxValue) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= maxValue) {
                maxValueIndex = i;
                maxValue = numbers.get(i);
            }
        }
        return maxValueIndex;
    }

    private static boolean verifyAllEqual(List <Integer> list) {
        return new HashSet <>(list).size() <= 1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List <Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long result = Result.countMoves(numbers);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
