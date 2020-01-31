package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    for (counterOuterLoop <- 0 until array.length) {
      val item = array(counterOuterLoop)
      val arr:Array[Int] = new Array[Int](1)
      arr(0) = counterOuterLoop

      while (arr(0)> 0 && array(arr(0) - 1) > item) {
        array(arr(0)) = array(arr(0) - 1)
        arr(0) = arr(0) - 1
      }
      array(arr(0)) = item
    }
     array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    def swapElements(array: Array[Int], start: Int, end: Int) {
      val tmp = array(start)
      array(start) = array(end)
      array(end) = tmp
    }
    val arr:Array[Int] = new Array[Int](3)
    arr(0) = 0
    while (arr(0) < (array.length - 1)) {
      arr(2)= arr(0) // arr(2) contains minimum
      arr(1) = arr(0) + 1

      while (arr(1) < array.length) {
        if (array(arr(1)) < array(arr(2))) {
          arr(2) = arr(1)
        }
        arr(1) += 1
      }

      swapElements(array, arr(0), arr(2))
      arr(0) += 1
    }
    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic
    val sizeOfArray: Int = array.length
    for (counterOuterLoop <- 1 to sizeOfArray-1) {
      for (counterInnerLoop <- counterOuterLoop-1 to 0 by -1) {

        if (array(counterInnerLoop) > array(counterInnerLoop + 1)) {
          val temporarySwap = array(counterInnerLoop+1)
          array(counterInnerLoop+1) = array(counterInnerLoop)
          array(counterInnerLoop) = temporarySwap
        }
      }
    }
    array
  }
}
