package methodReferences;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> studentConsumer = System.out::println;
    static Consumer<Student> studentConsumer_1 = Student::printAllActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studentConsumer);
        StudentDataBase.getAllStudents().forEach(studentConsumer_1);
    }
}
