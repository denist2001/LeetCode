package com.codechallenge.leetcode

class LinearSearch_ValidMountainArray {

    fun validMountainArray(A: IntArray): Boolean {
        if (A.size < 3) return false
        var pikeIndex = 0
        for (index in 0 until A.lastIndex) {
            if (A[index] > A[index + 1]) {
                pikeIndex = index
                break
            }
            if (A[index] == A[index + 1]) {
                return false
            }
        }
        for (index in pikeIndex until A.lastIndex) {
            if (index == 0) return false
            if (A[index] < A[index + 1]) {
                return false
            }
            if (A[index] == A[index + 1]) {
                return false
            }
        }
        return true
    }
}