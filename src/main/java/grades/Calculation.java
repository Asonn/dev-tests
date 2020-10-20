package grades;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculation {

    private Double topAverageScore = 0.0;
    private Student studentWithTopAverageScore;

    public Double calculateTopAverageScore(Map <Student, Grade> scores) {
        scores.forEach((student, grade) -> {
            Double average = getAverageScore(grade);
            if (average > topAverageScore) {
                topAverageScore = average;
            }
        });

        return topAverageScore;
    }

    public Student findStudentWithTopAverageScore(Map <Student, Grade> scores) {
        scores.forEach((student, grade) -> {
            Double average = getAverageScore(grade);
            if (average > topAverageScore) {
                topAverageScore = average;
                studentWithTopAverageScore = student;
            }
        });
        return studentWithTopAverageScore;
    }

    public List <Student> findStudentWithMathAverageAbove4AndSpeaksPolish(Map <Student, Grade> scores) {
        List <Student> polishStudentsWithMathAverageAbove4 = new ArrayList <>();

        scores.forEach((student, grade) -> {
            if ("PL".equals(student.getLanguage())) {
                Double average = getAverage(grade.getMaths());
                if (average > 4) {
                    polishStudentsWithMathAverageAbove4.add(student);
                }
            }
        });

        return polishStudentsWithMathAverageAbove4;
    }


    private Double getAverageScore(Grade grade) {
        Double average = getAverage(grade.getEnglish());
        average += getAverage(grade.getPhysics());
        average += getAverage(grade.getMaths());
        return average / 3;
    }

    private Double getAverage(List <Integer> maths) {
        return maths
                .stream()
                .mapToDouble(Integer::doubleValue)
                .sum() / maths.size();
    }


}
