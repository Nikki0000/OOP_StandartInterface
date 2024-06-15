import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {

    List<StudentStream> studentStream = new ArrayList<>();

    public void sortStream(List<StudentStream> streams) {
        Collections.sort(streams, new StreamComporator());
    }
    
}
