package com.codechallenge.leetcode

import org.junit.Test

import org.junit.Assert.*

class LinearSearch_ValidMountainArrayTest {

    val subject = LinearSearch_ValidMountainArray()

    @Test
    fun validMountainArray_when21_returnFalse() {
        val array = intArrayOf(2,1)
        assertFalse(subject.validMountainArray(array))
    }

    @Test
    fun validMountainArray_when355_returnFalse() {
        val array = intArrayOf(3,5,5)
        assertFalse(subject.validMountainArray(array))
    }

    @Test
    fun validMountainArray_when0321_returnTrue() {
        val array = intArrayOf(0,3,2,1)
        assertTrue(subject.validMountainArray(array))
    }
}