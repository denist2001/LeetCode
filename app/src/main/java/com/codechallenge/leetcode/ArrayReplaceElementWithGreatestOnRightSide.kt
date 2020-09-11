package com.codechallenge.leetcode

class ArrayReplaceElementWithGreatestOnRightSide {

    fun replaceElements(arr: IntArray): IntArray {
        if (arr.isEmpty()) return arr
        for (index in 0 until arr.lastIndex) {
            arr[index] = arr[index + 1]
            for (subIndex in  index + 1 .. arr.lastIndex) {
                if (arr[index] < arr[subIndex]) {
                    arr[index] = arr[subIndex]
                }
            }
        }
        arr[arr.lastIndex] = -1
        return arr
    }
}