package max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxLambda {

    public void findMaxDoubleInList(List<Double> values) {
        Double maxValue = values
                .stream()
                .mapToDouble(v -> v)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public void findMaxObjectValueInList(List<Person> values) {
        Person maxAge = values
                .stream()
                .max(Comparator.comparing(Person::getAge))
                .orElseThrow(NoSuchElementException::new);
    }

    public void findMaxInArray(int[] values) {
        int maxValue = Arrays.stream(values)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }
}
