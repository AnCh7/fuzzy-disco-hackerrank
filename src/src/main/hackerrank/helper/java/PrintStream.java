package hackerrank.helper.java;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public final class PrintStream {

    private LinkedList<String> _output = new LinkedList<>();

    public void setOutputData(List<String> in) {
        in.forEach((x) -> _output.add(x));
    }

    public void println() {
    }

    public void println(Object any) {

        if (!_output.isEmpty()) {
            String elem = _output.pop();
            assert Objects.equals(any, elem) : any.toString() + " not equals " + elem;
        }
    }
}