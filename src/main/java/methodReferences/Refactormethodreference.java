package methodReferences;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class Refactormethodreference {

    static Predicate<Student> studentPredicate = Refactormethodreference::greatherThanGradeLevel;

    static public boolean greatherThanGradeLevel(Student student){
        return student.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        System.out.println(studentPredicate.test(StudentDataBase.studentSupplier.get()));
    }
}
