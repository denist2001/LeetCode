package com.codechallenge.leetcode

class Sqrt_X {

    fun mySqrt(x: Int): Int {
        if (x < 2) return x

        return searchIn(0, x, x)
    }

    private fun searchIn(startIndex: Int, lastIndex: Int, num: Int): Int {
        if (lastIndex - startIndex < 2) {
            if (lastIndex * lastIndex <= num) return lastIndex
            if (startIndex * startIndex <= num) return startIndex
            return startIndex - 1
        }
        val midIndex: Int = startIndex + (lastIndex - startIndex) / 2
        val multipliedValue: Double = midIndex.toDouble() * midIndex.toDouble()
        var rounded: Int = multipliedValue.toInt()
        if (multipliedValue > Int.MAX_VALUE) rounded = -1
        return when {
            rounded == num -> {
                midIndex
            }
            rounded > num || rounded == -1 -> {
                searchIn(startIndex, midIndex - 1, num)
            }
            else -> {
                searchIn(midIndex + 1, lastIndex, num)
            }
        }
    }
}