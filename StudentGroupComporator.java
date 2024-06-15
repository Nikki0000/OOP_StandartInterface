import java.util.Comparator;

public class StudentGroupComporator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.students.length() - o2.students.length();
    }
    
}
