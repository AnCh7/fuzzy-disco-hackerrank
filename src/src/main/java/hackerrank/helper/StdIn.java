package hackerrank.helper;

import java.util.LinkedList;
import java.util.List;

public final class StdIn {

    private LinkedList<String> _input = new LinkedList<>();

    private String getNext() {
        if (_input.isEmpty()) return "";
        else return _input.pop();
    }

    public void setInputData(List<String> in) {
        in.forEach((x) -> _input.add(x));
    }

    public Integer readInt() {
        return Integer.parseInt(this.getNext());
    }

    public String readLine() {
        return this.getNext();
    }
}



