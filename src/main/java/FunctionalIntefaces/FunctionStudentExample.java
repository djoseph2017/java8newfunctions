package FunctionalIntefaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.function.Function;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String, Double>> studentFunction = (studentList -> {

        Map<String, Double> studentGrademap = new HashMap<>();
        studentList.forEach((student -> {
            if(PredicateFunctionalInterface.p1.test(student)){
                studentGrademap.put(student.getName(),student.getGpa());
            }

        }));
        return studentGrademap;

    });

    public static void main(String[] args) {

        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

    }



}
