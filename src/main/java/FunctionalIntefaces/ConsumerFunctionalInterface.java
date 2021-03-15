package FunctionalIntefaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
/*Consumer functional interface - one type of functional interface*/
public class ConsumerFunctionalInterface {
    public static void printName(){
        List<Student> allStudents = StudentDataBase.getAllStudents();
        Consumer<Student> consumer = (student -> System.out.println(student));
        allStudents.forEach(consumer);
    }

    public static void printNameAndActivities(){
        List<Student> allStudents = StudentDataBase.getAllStudents();
        Consumer<Student> consumerDisplayName = (student -> System.out.println(student.getName()));
        Consumer<Student> consumerDisplayActivities = (student ->
                System.out.println(student.getActivities()));

        //no filters
        allStudents.forEach(consumerDisplayName.andThen(consumerDisplayActivities));
        //with filters
        System.out.println("With Filters");
        allStudents.forEach(student -> {
            if(student.getGpa()>2.5){
                consumerDisplayName.andThen(consumerDisplayActivities).accept(student);
            }
        });
    }



    public static void main(String[] args) {

        Consumer<String> consumer=(s -> System.out.println(s.toUpperCase()));
        consumer.accept("java8");

        printName();
        System.out.println("__________________________________________________");
        printNameAndActivities();



    }
}
