import java.util.Comparator;

public class StreamComporator implements Comparator<StudentStream>{

    @Override
    public int compare(StudentStream o1, StudentStream o2) {
        return o1.studentStream.size() - o2.studentStream.size();
    }
    
}
