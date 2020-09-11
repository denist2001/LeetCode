package com.codechallenge.leetcode

import org.junit.Assert.*
import org.junit.Test

class ArrayFindAllDisappearedNumbersTest {
    private val subject = ArrayFindAllDisappearedNumbers()

    @Test
    fun `when Input 4,3,2,7,8,2,3,1, Output 5,6`() {
        val input = intArrayOf(4,3,2,7,8,2,3,1)
        assertTrue(subject.findDisappearedNumbers(input).containsAll(listOf(5,6)))
    }

    @Test
    fun `when Input 1,1, Output 2`() {
        val input = intArrayOf(1,1)
        assertTrue(subject.findDisappearedNumbers(input).containsAll(listOf(2)))
    }
}