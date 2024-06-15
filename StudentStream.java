import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>, Comparable<StudentStream> { 

    public List<StudentGroup> studentStream = new ArrayList<>();

    public void addStudentGroup(StudentGroup studentGroup) {
        studentStream.add(studentGroup);
    }

    @Override
    public String toString() {
        return studentStream.toString();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentStream.iterator();
    }

    @Override
    public int compareTo(StudentStream o) {
        return this.studentStream.size() - o.studentStream.size();
    }
    
}
