package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Predicate<Student> studentPredicate = (student -> student.getGpa()>=3);

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()//we can also use parallel steam which runs under the hood
                .filter(student -> student.getGradeLevel()>=3.9)//lambda predicate
                .filter(studentPredicate)//custom lambda predicate
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);


        //LifeCycle
        studentMap = StudentDataBase.getAllStudents()
                .stream()//Initial stage
                .filter(student -> student.getGradeLevel() >= 3.9)//Intermediate operators
                .filter(studentPredicate)//Intermediate operators
                .collect(Collectors.toMap(Student::getName, Student::getActivities));//Final terminal operation
                                                                // (this is ths start of the pipeline)
        /*No intermediate operation is invoked until the terminal operation is invoked or present*/

        //Note the difference between collections and streams

        //Collections-> Can add or modify elements at any point of time
        //Example: list.add(<element>)
        //Streams -> Cannot add or modify or delete elements in stream. It is fixed data set

        //Collections->Elements can be accessed in any order.Example: list.get(4).
        // Performs external iteration
        //Streams->Elements can be accessed in sequence
        //Performs internal iteration

        //Collections->It is eagerly constructed and can be traversed any no of times
        //Streams->It is lazily constructed and can be traversed once
        //Example
        List<String> names = Arrays.asList("java8", "java11", "java17");
        Stream<String> stringStrem = names.stream();//Note data type is stream and not collection
        stringStrem.forEach(System.out::println);
        stringStrem.forEach((s -> System.out.printf("%-8s",s)));//will throw an error
    }
}

