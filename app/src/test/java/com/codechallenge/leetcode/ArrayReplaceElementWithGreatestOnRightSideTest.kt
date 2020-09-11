package com.codechallenge.leetcode

import org.junit.Assert.assertTrue
import org.junit.Test

class ArrayReplaceElementWithGreatestOnRightSideTest {
    val subject = ArrayReplaceElementWithGreatestOnRightSide()

    @Test
    fun checkIfInputRandomSequence_shouldReturnDownSequence() {
        val input = intArrayOf(17, 18, 5, 4, 6, 1)
        assertTrue(intArrayOf(18, 6, 6, 6, 1, -1).contentEquals(subject.replaceElements(input)))
    }

    @Test
    fun checkIfInputEmpty_shouldReturnEmpty() {
        val input = intArrayOf()
        assertTrue(subject.replaceElements(input).isEmpty())
    }

    @Test
    fun checkIfInputGrows_shouldReturnEqualValues() {
        val input = intArrayOf(-5, -3, 0, 1, 2, 3, 4, 5, 6, 7)
        val result = subject.replaceElements(input)
        assertTrue(intArrayOf(7,7,7,7,7,7,7,7,7,-1).contentEquals(result))
    }

    @Test
    fun checkIfInputOneValue_shouldReturnMinusOne() {
        val input = intArrayOf(7)
        val result = subject.replaceElements(input)
        assertTrue(intArrayOf(-1).contentEquals(result))
    }
}