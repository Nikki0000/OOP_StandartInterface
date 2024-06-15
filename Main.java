import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        
        Student ivan = new Student("Van", 4);
        Student igor = new Student("Igorevich", 3);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 1);
        Student anna = new Student("Anna", 4);
        Student elena = new Student("Elena", 3);
        Student elizaveta = new Student("Elizaveta", 2);


        StudentGroup studentGroup1 = new StudentGroup();
        StudentGroup studentGroup2 = new StudentGroup();
        StudentGroup studentGroup3 = new StudentGroup();


        studentGroup1.addStudent(ivan);
        studentGroup1.addStudent(igor);
        studentGroup1.addStudent(alex);
        studentGroup1.addStudent(alexey);

        studentGroup2.addStudent(anna);
        studentGroup2.addStudent(elena);
        studentGroup2.addStudent(elizaveta);
        
        studentGroup3.addStudent(ivan);
        studentGroup3.addStudent(igor);
        studentGroup3.addStudent(alexey);
        studentGroup3.addStudent(elena);
        studentGroup3.addStudent(anna);


        StudentStream studentStream1 = new StudentStream();
        studentStream1.addStudentGroup(studentGroup1);
        studentStream1.addStudentGroup(studentGroup2);

        StudentStream studentStream2 = new StudentStream();
        studentStream2.addStudentGroup(studentGroup3);
        
        StudentStream studentStream3 = new StudentStream();
        studentStream3.addStudentGroup(studentGroup1);
        studentStream3.addStudentGroup(studentGroup2);
        studentStream3.addStudentGroup(studentGroup3);

        

        List<Student> arrayListstudents = new ArrayList<>(List.of(ivan, igor, alex, alexey, anna, elena, elizaveta));

        System.out.println("Не отсортированный список студентов:");
        System.out.println(arrayListstudents);

        Collections.sort(arrayListstudents);

        System.out.println("Отсортированный список студентов по длине имени:");
        System.out.println(arrayListstudents);

        System.out.println(" ");


        List<StudentGroup> arrayList = new ArrayList<>(List.of(studentGroup1, studentGroup2, studentGroup3));

        System.out.println("Не отсортированный список групп студентов:");
        System.out.println(arrayList);

        Collections.sort(arrayList);

        System.out.println("Отсортированный список групп студентов по количеству студентов в группе:");
        System.out.println(arrayList);

        System.out.println(" ");



        List<StudentStream> studentStreams = new ArrayList<>(List.of(studentStream1, studentStream2, studentStream3));

        System.out.println("Не отсортированный список потока студентов:");
        for (StudentStream stream : studentStreams) {
            System.out.println(stream + " (количество групп : " + stream.studentStream.size() + ")");
        }

        System.out.println(" ");

        StreamService streamService = new StreamService();

        streamService.sortStream(studentStreams);

        System.out.println("Отсортированный список потока студентов по количеству групп:");
        for (StudentStream stream : studentStreams) {
            System.out.println(stream + " (количество групп : " + stream.studentStream.size() + ")");
        }


    }


}
