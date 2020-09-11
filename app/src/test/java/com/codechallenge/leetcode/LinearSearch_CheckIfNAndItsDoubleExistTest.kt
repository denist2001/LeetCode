package com.codechallenge.leetcode

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class LinearSearch_CheckIfNAndItsDoubleExistTest {

    private val subject = LinearSearch_CheckIfNAndItsDoubleExist()

    @Test
    fun checkIfExist_when10253_shouldReturnTrue() {
        val array = intArrayOf(10, 2, 5, 3)
        assertTrue(subject.checkIfExist(array))
    }

    @Test
    fun checkIfExist_when711411_shouldReturnTrue() {
        val array = intArrayOf(7, 1, 14, 11)
        assertTrue(subject.checkIfExist(array))
    }

    @Test
    fun checkIfExist_when31711_shouldReturnFalse() {
        val array = intArrayOf(3, 1, 7, 11)
        assertFalse(subject.checkIfExist(array))
    }

    @Test
    fun checkIfExist_when0000_shouldReturnTrue() {
        val array = intArrayOf(0, 0, 0, 0)
        assertTrue(subject.checkIfExist(array))
    }

    @Test
    fun checkIfExist_whenEmpty_shouldReturnFalse() {
        val array = intArrayOf()
        assertFalse(subject.checkIfExist(array))
    }

    @Test
    fun checkIfExist_whenNegativeValues_shouldReturnFalse() {
        val array = intArrayOf(-10,-5,-1,0,1,5,10)
        assertTrue(subject.checkIfExist(array))
    }
}