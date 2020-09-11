package com.codechallenge.leetcode

class LinearSearch_CheckIfNAndItsDoubleExist {

    fun checkIfExist(arr: IntArray): Boolean {
        for (index in 0 until arr.lastIndex) {
            for (subIndex in index + 1 .. arr.lastIndex) {
                if (arr[index] == arr[subIndex] * 2
                    || arr[subIndex] == arr[index] * 2) {
                    return true
                }
            }
        }
        return false
    }
}