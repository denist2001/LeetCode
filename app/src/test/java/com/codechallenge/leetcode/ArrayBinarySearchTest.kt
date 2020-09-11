package com.codechallenge.leetcode

import org.junit.Assert.*
import org.junit.Test

class ArrayBinarySearchTest {
    val subject = ArrayBinarySearch()

    @Test
    fun `when input array is empty should return -1`() {
        val input = intArrayOf()
        assertEquals(-1, subject.search(input, 0))
    }

    @Test
    fun `when input array is ordered and contains value should return index`() {
        val input = intArrayOf(-1,0,3,5,9,12)
        assertEquals(4, subject.search(input, 9))
    }

    @Test
    fun `when input array is ordered and doesn't contains value should return -1`() {
        val input = intArrayOf(-1,0,3,5,9,12)
        assertEquals(-1, subject.search(input, 2))
    }

    @Test
    fun `when input array is ordered and has two value should return index`() {
        val input = intArrayOf(2, 5)
        assertEquals(0, subject.search(input, 2))
    }
}