package com.codechallenge.leetcode

class CodilityMissingIntegerTestCases {


    fun solution(A: IntArray): Int {
        val arrayMoreThen0Vals = mutableListOf<Int>()
        for (value in A) {
            if (value > 0) {
                arrayMoreThen0Vals.add(value)
            }
        }
        if (arrayMoreThen0Vals.isEmpty()) return 1
        val biggestVal = arrayMoreThen0Vals.max()
        for (current in 1 .. biggestVal!!) {
            if (!arrayMoreThen0Vals.contains(current)) {
                return current
            }
        }
        return biggestVal + 1
    }
}