package com.codechallenge.leetcode

import org.junit.Assert.*
import org.junit.Test

class BinarySearchInRotatedSortedArrayTest {
    val subject = BinarySearchInRotatedSortedArray()

    @Test
    fun`if array is empty should return -1`() {
        val input = intArrayOf()
        assertEquals(-1, subject.search(input, 0))
    }

    @Test
    fun`if array is 4,5,6,7,0,1,2 and target = 0 should return 4`() {
        val input = intArrayOf(4,5,6,7,0,1,2)
        assertEquals(4, subject.search(input, 0))
    }

    @Test
    fun`if array is 4,5,6,7,0,1,2 and target = 3 should return -1`() {
        val input = intArrayOf(4,5,6,7,0,1,2)
        assertEquals(-1, subject.search(input, 3))
    }

    @Test
    fun`if array is 0,1,2,4,5,6,7 and target = 3 should return -1`() {
        val input = intArrayOf(4,5,6,7,0,1,2)
        assertEquals(-1, subject.search(input, 3))
    }

    @Test
    fun`if array is 0,1,2,4,5,6,7 and target = 7 should return 6`() {
        val input = intArrayOf(0,1,2,4,5,6,7)
        assertEquals(6, subject.search(input, 7))
    }

    @Test
    fun`if array is 0,1,2,4,5,6,7 and target = 0 should return 0`() {
        val input = intArrayOf(0,1,2,4,5,6,7)
        assertEquals(0, subject.search(input, 0))
    }

    @Test
    fun`if array is 1,2,4,5,6,7,0 and target = 0 should return 6`() {
        val input = intArrayOf(1,2,4,5,6,7,0)
        assertEquals(6, subject.search(input, 0))
    }

    @Test
    fun`if array is 1,3,5 and target = 0 should return -1`() {
        val input = intArrayOf(1,3,5)
        assertEquals(-1, subject.search(input, 0))
    }

    @Test
    fun`if array is 1,3,5 and target = 3 should return 1`() {
        val input = intArrayOf(1,3,5)
        assertEquals(1, subject.search(input, 3))
    }

    @Test
    fun`if array is 5,1,3 and target = 0 should return -1`() {
        val input = intArrayOf(5,1,3)
        assertEquals(-1, subject.search(input, 0))
    }

    @Test
    fun`if array is 1 and target = 1 should return 0`() {
        val input = intArrayOf(1)
        assertEquals(0, subject.search(input, 1))
    }
}