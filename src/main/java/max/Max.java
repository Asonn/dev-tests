package max;

import java.util.Collections;
import java.util.List;

public class Max {

    public static int getMaxValueInArray(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static Double getMaxValueInList(List <Double> values) {
        Double maxValue = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) > maxValue) {
                maxValue = values.get(i);
            }
        }
        return maxValue;
    }

    public static int getMaxValueInObjectList(List <Person> values) {
        int maxValue = values.get(0).getAge();
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i).getAge() > maxValue) {
                maxValue = values.get(i).getAge();
            }
        }
        return maxValue;
    }

    // The ugly collection hack if you don't work with numbers
    private <T extends Object & Comparable<? super T>> T findMax(List<T> list) {
        return Collections.max(list);
    }


}
