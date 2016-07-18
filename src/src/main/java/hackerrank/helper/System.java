package hackerrank.helper;

public final class System {

    public static InputStream in = null;
    public static PrintStream out = null;

    static public void setIn(InputStream inputStream) {
        in = inputStream;
    }

    static public void setOut(PrintStream outputStream) {
        out = outputStream;
    }
}