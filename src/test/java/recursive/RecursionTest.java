package recursive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    public void Should_ExpectedBehavior_When_Condition() {
        //Arrange
        //Act
        //Assert
        Recursion recursion = new Recursion();

        Integer result = recursion.findGreatestCommonDivisor(1, 11);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void Should_ExpectedBehavior_When_Condition2() {
        //Arrange
        //Act
        //Assert
        Recursion recursion = new Recursion();

        Integer result = recursion.findGreatestCommonDivisor(11, 0);

        assertThat(result).isEqualTo(11);
    }

    @Test
    public void Should_ExpectedBehavior_When_reverse() {
        //Arrange
        //Act
        //Assert
        String result = Recursion.reverse("hallo w");

        assertThat(result).isEqualTo("w ollah");

    }

    @Test
    public void Should_ExpectedBehavior_When_Factorial() {
        //Arrange
        //Act
        //Assert
        int result = Recursion.factorial(4);

        assertThat(result).isEqualTo(24);
    }
}