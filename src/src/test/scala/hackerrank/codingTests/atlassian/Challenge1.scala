package hackerrank.codingTests.atlassian

import hackerrank.helper.scala.{Console, Scanner, _}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

import scala.collection.mutable

@RunWith(classOf[JUnitRunner])
class Challenge1 extends FunSuite {

  object Solution {

    class LinkedListNode(node_value: String) {
      var value: String = node_value
      var next: LinkedListNode = _
    }

    def _insert_node_into_singlylinkedlist(head: LinkedListNode, value: String): LinkedListNode = {
      var head_copy: LinkedListNode = head
      if (head_copy == null) {
        head_copy = new LinkedListNode(value)
      }
      else {
        var end: LinkedListNode = head
        while (end.next != null) {
          end = end.next
        }
        val node: LinkedListNode = new LinkedListNode(value)
        end.next = node
      }
      head_copy
    }

    def startsWith(list: LinkedListNode, sublist: LinkedListNode): Boolean = {
      var pointer = list
      var subPointer = sublist
      while (subPointer != null) {
        if (pointer == null || pointer.value != subPointer.value) return false
        pointer = pointer.next
        subPointer = subPointer.next
      }
      true
    }

    def find(list: LinkedListNode, sublist: LinkedListNode): Int = {
      var counter = 0
      var pointer = list
      while (pointer != null) {
        if (startsWith(pointer, sublist)) {
          return counter
        }
        counter = counter + 1
        pointer = pointer.next
      }
      return -1
    }

    def main(args: Array[String]) {
      val sc = new Scanner(System.in)
      val _list_size: Int = sc.nextInt()
      var _list: LinkedListNode = null
      val _list_i: Int = 0
      for (_list_i <- 1 to _list_size) {
        val _list_item = sc.nextLine()
        _list = _insert_node_into_singlylinkedlist(_list, _list_item)
      }
      val _sublist_size: Int = sc.nextInt()
      var _sublist: LinkedListNode = null
      val _sublist_i: Int = 0
      for (_sublist_i <- 1 to _sublist_size) {
        val _sublist_item = sc.nextLine()
        _sublist = _insert_node_into_singlylinkedlist(_sublist, _sublist_item);
      }
      val res = find(_list, _sublist)
      Console.println(res)
    }
  }

  test("Sample 0") {

    val inputData = mutable.Queue(
      "5",
      "1",
      "2",
      "3",
      "4",
      "5",
      "3",
      "3",
      "4",
      "5"
    )

    val inputStream = new InputStream()
    inputStream.setInputData(inputData)
    System.setIn(inputStream)

    val outputData = mutable.Queue(
      "2"
    )

    Console.setOutputData(outputData)
    Solution.main(null)

    Console.assertIsEmpty()
  }

}