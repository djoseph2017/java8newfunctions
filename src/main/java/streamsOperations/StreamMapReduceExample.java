package streamsOperations;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceExample {
    private static int noOfNoteBooks(){

        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter((student -> student.getGradeLevel()>=3))
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNotebook) //Stream<Integer>
                //.reduce(0,(a,b)-> a+b);
                .reduce(0,Integer::sum);

    }

    public static void main(String[] args) {

        System.out.println("noOfNoteBooks : " + noOfNoteBooks());
    }
}
