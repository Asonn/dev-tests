package rockstar;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumbers {


    public static Collection <Integer> findUniqueNumbers(Collection <Integer> numbers) {
        List <Integer> resultWithoutDuplicates = new ArrayList <Integer>();
        Map <Integer, Integer> map = new HashMap <>();
        for (int i : numbers) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                resultWithoutDuplicates.add(entry.getKey());
            }
        }
        return resultWithoutDuplicates;
    }

    public static Collection <Integer> findUniqueNumbersLambda(Collection <Integer> numbers) {
        return numbers
                .stream()
                .filter(integer -> Collections.frequency(numbers, integer) == 1)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Collection <Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbersLambda(numbers))
            System.out.println(number);
    }
}