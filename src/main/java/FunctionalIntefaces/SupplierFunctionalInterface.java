package FunctionalIntefaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {

    public static Supplier<Student> studentSupplier = () -> {
        return  new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"), 17);
    };

    public static  Supplier<List<Student>> studentsSupplier = () -> StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        /*Consumer doesn take anyimput but only gives output*/
        Student student = studentSupplier.get();

        System.out.println("Student is : " + student);

        System.out.println("Students are : " + studentsSupplier.get());
    }
}
