package FunctionalIntefaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {
    public static void nameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        BiConsumer<String,List<String>> biConsumer = (name,activities)->{
            System.out.println("Name"+name+" Activities"+activities);
        };

        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }



    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b)->{
            System.out.println("a:"+a.toUpperCase()+" b:"+b.toUpperCase());
        };

        biConsumer.accept("java8","java11");

        BiConsumer<Integer,Integer> mul=(a,b)->{
            System.out.println("Multiply "+a*b);
        };
        BiConsumer<Integer,Integer> div=(a,b)->{
            System.out.println("Divide "+a/b);
        };

        mul.andThen(div).accept(10,11);

        nameAndActivities();

    }
}
