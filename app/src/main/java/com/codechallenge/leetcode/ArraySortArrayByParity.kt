package com.codechallenge.leetcode

class ArraySortArrayByParity {

    fun sortArrayByParity(A: IntArray): IntArray {
        if (A.isEmpty()) return A
        for (writeIndex in 0 until A.lastIndex) {
            if (A[writeIndex] % 2 != 0 ) {
                var targetIndex = writeIndex + 1
                for (readIndex in writeIndex + 1 .. A.lastIndex) {
                    if (A[readIndex] % 2 == 0) {
                        targetIndex = readIndex
                        break
                    }
                }
                val temporaryValue  = A[writeIndex]
                A[writeIndex] = A[targetIndex]
                A[targetIndex] = temporaryValue
            }
        }
        return A
    }

}