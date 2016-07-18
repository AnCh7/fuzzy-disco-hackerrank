package hackerrank.helper;

import java.util.LinkedList;
import java.util.List;

public class InputStream {

    private LinkedList<String> _input = new LinkedList<>();

    private String getNext() {
        if (_input.isEmpty()) return "";
        else return _input.pop();
    }

    public void setInputData(List<String> in) {
        in.forEach((x) -> _input.add(x));
    }

    public String getNextString() {
        return this.getNext();
    }

    public Integer getNextInt() {
        return Integer.parseInt(this.getNext());
    }
}
