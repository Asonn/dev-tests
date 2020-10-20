import grades.Calculation;
import grades.Grade;
import grades.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class CalculationTest {

    private Map <Student, Grade> entries;
    private Calculation calculation;

    @BeforeEach
    void setUp() {
        this.entries = prepareData();
        this.calculation = new Calculation();
    }

    @Test
    public void Should_Return4dot117_When_calculateTopAverageScoreWithDataSet() {
        //Arrange
        //Act
        Double result = calculation.calculateTopAverageScore(entries);
        //Assert
        Assertions.assertEquals(4.17, result, 0.1);
    }

    @Test
    public void Should_ReturnStudentWithLastNameLos_When_findStudentWithTopAverageScoreWithDataSet() {
        //Arrange
        //Act
        Student result = calculation.findStudentWithTopAverageScore(entries);
        //Assert
        Assertions.assertEquals("Los", result.getLastName());
    }

    @Test
    public void Should_ReturnStudentWithLastNameLos_When_findStudentWithMathAverageAbove4AndSpeaksPolishWithDataSet() {
        //Arrange
        //Act
        List<Student> result = calculation.findStudentWithMathAverageAbove4AndSpeaksPolish(entries);
        //Assert
        Assertions.assertEquals("Los", result.get(0).getLastName());
    }

    @Test
    public void Should_ReturnListSizeOfOne_When_findStudentWithMathAverageAbove4AndSpeaksPolishWithDataSet() {
        //Arrange
        //Act
        List<Student> result = calculation.findStudentWithMathAverageAbove4AndSpeaksPolish(entries);
        //Assert
        Assertions.assertEquals(1, result.size());
    }


    private Map <Student, Grade> prepareData() {
        Map <Student, Grade> entries = new HashMap <>();
        List <Integer> example1 = Arrays.asList(2, 3, 4, 5, 1); // average of 3
        List <Integer> example2 = Arrays.asList(2, 5, 5, 5, 5); // average of 4.4
        List <Integer> example3 = Arrays.asList(2, 3, 4, 5, 5, 5, 2); // average of 3.67
        entries.put(new Student("Jan", "Kowalski"), new Grade(example1, example2, example3));
        entries.put(new Student("Magda", "Nowak", "EN"), new Grade(example3, example3, example1));
        entries.put(new Student("Kamila", "Los", "PL"), new Grade(example2, example2, example3));
        return entries;
    }
}