package com.codechallenge.leetcode

import junit.framework.Assert.assertEquals
import org.junit.Test

class ArrayRemoveDuplicatesFromSortedArrayTest {

    val subject = ArrayRemoveDuplicatesFromSortedArray()

    @Test
    fun removeDuplicates112_shouldReturn2() {
        val intArray = intArrayOf(1, 1, 2)
        val result = subject.removeDuplicates(intArray)
        assertEquals(2, result)
    }

    @Test
    fun removeDuplicates0011122334_shouldReturn5() {
        val intArray = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val result = subject.removeDuplicates(intArray)
        assertEquals(5, result)
    }

    @Test
    fun removeDuplicates111_shouldReturn1() {
        val intArray = intArrayOf(1, 1, 1)
        val result = subject.removeDuplicates(intArray)
        assertEquals(1, result)
    }

    @Test
    fun removeDuplicates00000_shouldReturn1() {
        val intArray = intArrayOf(0,0,0,0,0)
        val result = subject.removeDuplicates(intArray)
        assertEquals(1, result)
    }

    @Test
    fun removeDuplicates_3_1_100000_shouldReturn3() {
        val intArray = intArrayOf(-3,-1,-1,0,0,0,0,0)
        val result = subject.removeDuplicates(intArray)
        assertEquals(3, result)
    }
}