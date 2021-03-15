package FunctionalIntefaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    public static void predicateAnd(){
        Predicate<Integer> integerPredicate = (integer -> integer%2==0);
        Predicate<Integer> integerPredicate2 = (integer -> integer%5==0);

        System.out.println(integerPredicate.and(integerPredicate2).test(10));

    }

    public static void predicateOr(){
        Predicate<Integer> integerPredicate = (integer -> integer%2==0);
        Predicate<Integer> integerPredicate2 = (integer -> integer%5==0);

        System.out.println(integerPredicate.or(integerPredicate2).test(8));

    }

    public static void predicateNegate(){
        Predicate<Integer> integerPredicate = (integer -> integer%2==0);
        Predicate<Integer> integerPredicate2 = (integer -> integer%5==0);

        System.out.println(integerPredicate.or(integerPredicate2).negate().test(9));

    }

    static Predicate<Student> p1 = (student -> student.getGradeLevel()>=3);
    static Predicate<Student> p2 = (student -> student.getGpa()>=3.9);

    public static void filterStudentByGradeLevel(){
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });

    }

    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = (integer -> integer%2==0);
        //Predicate<Integer> integerPredicate = (integer -> {return integer%2==0;});
        System.out.println(integerPredicate.test(4));

        predicateAnd();
        predicateOr();
        predicateNegate();
        filterStudentByGradeLevel();
    }
}
