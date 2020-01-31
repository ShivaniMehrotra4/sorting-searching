package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {

    @scala.annotation.tailrec
    def binaryRecursive(array: Array[Int], elem: Int, startIndex: Int, endIndex: Int): Boolean = {
      if (startIndex>endIndex)
        false
      else {
        val midIndex = startIndex + (endIndex - startIndex + 1) / 2
        array match {
          case testArray: Array[Int] if testArray(midIndex) == elem => true
          case testArray: Array[Int] if testArray(midIndex) > elem => binaryRecursive(array, elem, startIndex, midIndex - 1)
          case testArray: Array[Int] if testArray(midIndex) < elem => binaryRecursive(array, elem, midIndex + 1, endIndex)
        }
      }
    }
    binaryRecursive(array, elem, 0, array.length-1)
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    for(arrayElement <- array) {
        if(arrayElement == elem)
          {
            true
          }
      }
    false
  }
}
