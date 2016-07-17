package hackerrank.helper.java;

public class Scanner {

    private final InputStream _in;

    public Scanner(InputStream in) {
        _in = in;
    }

    public Integer nextInt() {
        return _in.getNextInt();
    }

    public String nextString() {
        return _in.getNextString();
    }

    public String nextLine() {
        return _in.getNextString();
    }

    public String next() {
        return this.nextString();
    }

    public void close() {
    }
}
