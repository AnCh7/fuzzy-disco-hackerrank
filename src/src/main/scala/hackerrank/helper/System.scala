package hackerrank.helper

object System {

  private var _in: InputStream = _
  private var _out: PrintStream = _

  def setIn(in: InputStream): Unit = _in = in
  def setOut(out: PrintStream): Unit = _out = out
  def in(): InputStream = _in
  def out(): PrintStream = _out
}
