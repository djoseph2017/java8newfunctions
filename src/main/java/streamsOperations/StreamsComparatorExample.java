package streamsOperations;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName(){

        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpa(){

        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpaReversed(){

        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static List<Student> sortsAllTogether()
    {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed()
                        .thenComparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by NAME");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by GPA");
        sortStudentsByGpa().forEach(System.out::println);

        System.out.println("Students sorted by GPA Higher to Lower");
        sortStudentsByGpaReversed().forEach(System.out::println);

        System.out.println("Sorts based on grade if equal then on name");
        sortsAllTogether().forEach(System.out::println);
    }
}
