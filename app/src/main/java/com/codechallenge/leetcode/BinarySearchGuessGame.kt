package com.codechallenge.leetcode

class BinarySearchGuessGame {

    fun guessNumber(n: Int): Int {
        if (n == 1) return 1
        return findNumber(1, n)
    }

    private fun findNumber(startNumber: Int, lastNumber: Int): Int {
        if (lastNumber - startNumber < 2) {
            if (guess(startNumber) == 0) return startNumber
            if (guess(lastNumber) == 0) return lastNumber
        }
        val average = startNumber + (lastNumber - startNumber) / 2
        val result = guess(average)
        return when {
            result == 0 -> average
            result > 0 -> findNumber(startNumber, average - 1)
            else -> findNumber(average + 1, lastNumber)
        }
    }

    fun guess(num: Int): Int {
        return when {
            num > 10 -> 1
            num < 10 -> -1
            else -> 0
        }
    }
}