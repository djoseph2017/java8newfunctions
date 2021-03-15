package streamsTreminalOperation;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsAggregateOperation {

    public static Optional<Student> minBy_example(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy_example(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static int sum(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNotebook));
    }

    public static double average(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNotebook));
    }
    public static void main(String[] args) {

        System.out.println(minBy_example());
        System.out.println(maxBy_example());
        System.out.println("Total no of Notebooks : " + sum());
        System.out.println("Average no of Notebooks : " + average());
    }
}
