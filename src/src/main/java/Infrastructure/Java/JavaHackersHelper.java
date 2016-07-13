package Infrastructure.Java;

import java.util.LinkedList;
import java.util.List;

public class JavaHackersHelper {

    static class StdIn {

        private LinkedList<String> _input = new LinkedList<>();

        private String getNext() {
            if (_input.isEmpty()) return "";
            else return _input.poll();
        }

        public void setInputData(List<String> in) {
            in.forEach((x) -> _input.push(x));
        }

        public Integer readInt() {
            return Integer.parseInt(this.getNext());
        }

        public String readLine() {
            return this.getNext();
        }

    }

//    class InputStream {
//        private var input: mutable.Queue[String] = mutable.Queue()
//        private def getNext: String = if (input.isEmpty) "" else input.dequeue
//
//        def setInputData(in: mutable.Queue[String]) = input = in
//        def getNextString: String = this.getNext
//        def getNextInt: Int = getNext.toInt
//    }
//
//    object System {
//        private var _in: InputStream = _
//
//        def setIn(in: InputStream): Unit = _in = in
//        def in(): InputStream = _in
//    }
//
//    class Scanner(in: InputStream) {
//        def nextInt() = in.getNextInt
//        def nextString() = in.getNextString
//        def nextLine() = in.getNextString
//    }
//
//    object Console {
//        private var output: mutable.Queue[String] = mutable.Queue()
//
//        def setOutputData(out: mutable.Queue[String]) = output = out
//        def println() = {}
//        def println(x: Any) = {
//            if (output.nonEmpty) {
//                val elem = output.dequeue
//                assert(x.toString == elem, s"$x not equals $elem")
//            }
//        }
//    }
}
