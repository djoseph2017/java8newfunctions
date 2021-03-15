package streamsOperations;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.List;

//basically you are calling a static method from another class
import static java.util.stream.Collectors.*;

public class StreamsMapExample {

    private static List<String> namesUpperCase(List<Student> names){
        List<String> namesUpperCase = names.stream() //Stream<Student>
                .map(Student::getName) //Stream<Student>->Stream<String>.
                // Convert from one type to another(Student to student name)
                .map(String::toUpperCase) //Stream<String>->Stream<String>
                //student name to upper case string
                .collect(toList()); // returns List // terminal operation
        return namesUpperCase;
    }

    private static Set<String> namesSetUpperCase(List<Student> students){
        Set<String> namesUpperCase = students.stream() //Stream<Student>
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) // Stream<String> -> UpperCase
                .collect(toSet()); // returns List // terminal operation
        return namesUpperCase;
    }

    private static Map<String, Integer> namesLengthMap(ArrayList<String> names){

        Map<String, Integer> namesLengthMap = names.stream()//Stream<String>
                .collect(toMap(String::toString,String::length)); // returns Map

        return namesLengthMap;
    }


    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("dan");
        names.add("jenny");

        System.out.println("namesUpperCase List : " + namesUpperCase(StudentDataBase.getAllStudents()));
        System.out.println("namesUpperCase Set : " + namesSetUpperCase(StudentDataBase.getAllStudents()));
        System.out.println("namesLengthMap : " + namesLengthMap(names));

    }

}
