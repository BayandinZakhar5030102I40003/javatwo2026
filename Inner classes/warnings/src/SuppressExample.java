import java.util.List;
import java.util.ArrayList;

public class SuppressExample {
    @SuppressWarnings("unchecked")
    public void useRawList() {
        List rawList = new ArrayList();
        rawList.add("String");
    }

    @SuppressWarnings({"unchecked", "deprecation"})
    public void multipleWarnings() {
        List rawList = new ArrayList();
    }

    @SuppressWarnings("all")
    public void suppressAll() {
    }
}