package com.codechallenge.leetcode

import org.junit.Assert.*
import org.junit.Test

class ArraySortArrayByParityTest {
    private val subject = ArraySortArrayByParity()

    @Test
    fun `when input array is empty should return empty array`() {
        val inputArray = intArrayOf()
        assertTrue(subject.sortArrayByParity(inputArray).isEmpty())
    }

    @Test
    fun `when unsorted array should sort first even then odd values`() {
        val inputArray = intArrayOf(3,1,2,4)
        val outputArray = intArrayOf(2,4,1,3)
        assertTrue(subject.sortArrayByParity(inputArray).contentEquals(outputArray))
    }
}