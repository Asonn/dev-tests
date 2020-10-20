package StreamingTest;



import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Stream;

public class Answer
{
    public static Stream <String> Filter(List <Person> persons)
    {
    	return  persons.stream()
                .filter(person -> isAbove18(person.DateOfBirth))
                .sorted((person, person2) -> person.City.compareToIgnoreCase(person2.City))
                .map(person -> person.Name);
	}

	private static boolean isAbove18(LocalDate dob) {
        return LocalDate.from(dob).until(LocalDate.now(), ChronoUnit.YEARS) >= 18;
    }
}
