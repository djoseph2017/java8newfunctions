package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFlatMap(){
        Optional<Student> studentOptional =  Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
            Optional<Bike> bikeOptional= studentOptional.
                    flatMap(Student::getBike); //only way to get to another embedded optional object
            System.out.println("bikeOptional : " + bikeOptional);
        }
    }

    public static void optionalMap(){
        Optional<Student> studentOptional =  Optional.ofNullable(StudentDataBase.studentSupplier.get());;

        if(studentOptional.isPresent()){
            Optional<String> nameOptional= studentOptional.
                    map(Student::getName); //
            System.out.println("nameOptional : " + nameOptional);
        }
    }

    public static void optionalFilter(){

       Optional.ofNullable(StudentDataBase.studentSupplier.get())
                .filter(student -> student.getGpa()>=4.3)
                .ifPresent(System.out::println);

    }

    public static void main(String[] args) {
        optionalFlatMap();
        optionalMap();
        optionalFilter();
    }
}

