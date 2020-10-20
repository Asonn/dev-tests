package grades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Grade {

    private List<Integer> maths;
    private List<Integer> physics;
    private List <Integer> english;

    public Grade(List <Integer> maths, List <Integer> physics, List <Integer> english) {
        this.maths = maths;
        this.physics = physics;
        this.english = english;
    }

    public List <Integer> getMaths() {
        return new ArrayList <>(maths);
    }

    public List <Integer> getPhysics() {
        return new ArrayList <>(physics);
    }

    public List <Integer> getEnglish() {
        return new ArrayList <>(english);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grade)) return false;
        Grade grade = (Grade) o;
        return Objects.equals(getMaths(), grade.getMaths()) &&
                Objects.equals(getPhysics(), grade.getPhysics()) &&
                Objects.equals(getEnglish(), grade.getEnglish());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaths(), getPhysics(), getEnglish());
    }
}
