package streamsOperations;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){
        //without using flat map!!!!!!!!!
        List<List<String>> collect = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .collect(toList());
        //By using flat map!!!!!!!!!
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) //Stream<String>
                .collect(toList());



        return studentActivities;
    }

    public static long getStudentActivitiesCount(){

        long noOfStudentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) //Stream<String>
                .distinct() //Stream<String> -> with distinct function performed
                .count();
        //u can also use sort its the same

        return noOfStudentActivities;
    }


    public static void main(String[] args) {

        System.out.println("printStudentActivities : " + printStudentActivities());
        System.out.println("getStudentActivitiesCount : " + getStudentActivitiesCount());
    }
}
