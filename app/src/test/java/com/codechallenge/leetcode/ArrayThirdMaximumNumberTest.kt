package com.codechallenge.leetcode

import org.junit.Assert.*
import org.junit.Test

class ArrayThirdMaximumNumberTest {
    private val subject = ArrayThirdMaximumNumber()

    @Test
    fun `when input 3, 2, 1, output 1`() {
        val input = intArrayOf(3, 2, 1)
        assertEquals(1, subject.thirdMax(input))
    }

    @Test
    fun `when input 1, 2, output 2`() {
        val input = intArrayOf(1, 2)
        assertEquals(2, subject.thirdMax(input))
    }

    @Test
    fun `when input 2, 2, 3, 1, output 1`() {
        val input = intArrayOf(2, 2, 3, 1)
        assertEquals(1, subject.thirdMax(input))
    }
}