package hackerrank.helper.scala

object System {
  private var _in: InputStream = _

  def setIn(in: InputStream): Unit = _in = in
  def in(): InputStream = _in
}
