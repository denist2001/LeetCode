package com.codechallenge.leetcode

import kotlin.math.abs

class FindTwoNumbersWithKnownSum {

    @ExperimentalUnsignedTypes
    fun findIndexesWithSumOfValues(source: IntArray, sum: Int): IntArray {
        for ((index, value) in source.withIndex()) {
            for (subIndex in index + 1 .. source.lastIndex) {
                if (value + source[subIndex] == sum
                    || (abs(value - source[subIndex])) == sum) {
                    return intArrayOf(index, subIndex)
                }
            }
        }
        return intArrayOf()
    }
}