package com.codechallenge.leetcode

import org.junit.Assert.*
import org.junit.Test

class ArrayMoveZeroesTest {
    val subject = ArrayMoveZeroes()

    @Test
    fun `check if empty array doesn't crash`() {
        val input = intArrayOf()
        subject.moveZeroes(input)
        assertTrue(input.isEmpty())
    }

    @Test
    fun `check if unsorted array should move 0's to the end`() {
        val input = intArrayOf(0,1,0,3,12)
        val result = intArrayOf(1,3,12,0,0)
        subject.moveZeroes(input)
        assertTrue(input.contentEquals(result))
    }
}