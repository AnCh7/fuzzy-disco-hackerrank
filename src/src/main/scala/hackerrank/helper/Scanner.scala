package hackerrank.helper

class Scanner(in: InputStream) {
  def nextInt() = in.getNextInt()
  def nextString() = in.getNextString()
  def nextLine() = in.getNextString()
  def next() = in.getNextString()
  def close() = in.close()
}
