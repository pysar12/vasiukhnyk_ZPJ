import java.util.*;
import java.util.stream.*;

class University {
    private String StudentName;
    public void setStudentName(String name) {
        this.StudentName = name;
    }
    public String getStudentName() {
        return StudentName;
    }
}
class Student {
    private String Surname;
    private Optional<University> Course;
    public String getSurname() {
        return Surname;
    }
    public void setCity(String Surname) {
        this.Surname = Surname;
    }
    public void setCourse(Optional<University> Course) {
        this.Course = Course;
    }
    public Optional<University> getCourse() {
        return Course;
    }

}
class UsingOfMethod{
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        Map<String, List<String>> petNamesByCity = student.stream()
                .collect(Collectors.groupingBy(
                        Student::getSurname,
                        Collectors.flatMapping(
                                person -> person.getCourse().map(University::getStudentName).stream(),
                                Collectors.toList()
                        )
                ));
    }
}