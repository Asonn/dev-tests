package mercari.test.depth;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'minimumSteps' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY loggedMoves as parameter.
     */

    public static int minimumSteps(List <String> loggedMoves) {
        // Write your code here
        int depth = 0;

        for (int i = 0; i < loggedMoves.size(); i++) {
            String operation = loggedMoves.get(i);
            if (operation.equals("../")) {
                depth += -1;
            } else if(!(operation.equals("./"))) {
                depth += 1;
            }
        }
        return depth;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int loggedMovesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List <String> loggedMoves = IntStream.range(0, loggedMovesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        int result = Result.minimumSteps(loggedMoves);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
