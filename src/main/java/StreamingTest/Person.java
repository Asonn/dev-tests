package StreamingTest;

import java.time.LocalDate;


public class Person
{
	public Person(String name, String city, LocalDate dateOfBirth)
	{
		this.Name = name;
		this.City = city;
		this.DateOfBirth = dateOfBirth;
	}
	public String Name;
	public String City;
	public LocalDate DateOfBirth;
}