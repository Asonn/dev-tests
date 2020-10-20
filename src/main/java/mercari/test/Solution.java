package mercari.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'subsetA' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List <Integer> subsetA(List <Integer> arr) {
        // Write your code here
        Collections.sort(arr, Collections.reverseOrder());
        List <Integer> subsetA = new ArrayList <>();

        for (int i = 0; i < arr.size() ; i++) {
            subsetA = arr.subList(0, i);
            List <Integer> subsetB = arr.subList(i, arr.size() -1);
            int sumA = subsetA.stream()
                    .mapToInt(a -> a)
                    .sum();
            int sumB = subsetB.stream()
                    .mapToInt(a -> a)
                    .sum();
            if (sumA >= sumB) {
                break;
            }
        }

        Collections.reverse(subsetA);
        return subsetA;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List <Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List <Integer> result = Result.subsetA(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

