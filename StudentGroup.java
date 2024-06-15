import java.util.Iterator;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

    public StringBuilder students = new StringBuilder();

    public void addStudent(Student student) {
        students.append(student).append(" ");
    }

    @Override
    public String toString() {
        return students.toString();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public int compareTo(StudentGroup o) {
        return this.students.length() - o.students.length();
    }

    
    
}
