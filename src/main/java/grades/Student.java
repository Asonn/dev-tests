package grades;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String language;

    public Student(String firstName, String lastName, String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.language = language;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getFirstName().equals(student.getFirstName()) &&
                getLastName().equals(student.getLastName()) &&
                Objects.equals(getLanguage(), student.getLanguage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getLanguage());
    }

    @Override
    public String toString() {
        return "grades.Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
