package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streamsdebug {

    public static void main(String[] args) {
        Predicate<Student> studentPredicate_1 = (student) -> student.getName().startsWith("A");
        Predicate<Student> studentPredicate_2 = (student) -> student.getName().startsWith("E");

        List<Student> studentlist = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() > 2.5)
                .peek(System.out::println)//Peek is used to debug the code
                .filter(studentPredicate_1.or(studentPredicate_2))
                .peek(student -> System.out.println("Starts here \n"+student))
                .collect(Collectors.toList());
      //  System.out.println(studentlist);

    }
}
