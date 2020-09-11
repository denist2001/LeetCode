package com.codechallenge.leetcode

import org.junit.Assert.*
import org.junit.Test

class FindTwoNumbersWithKnownSumTest {
    val subject = FindTwoNumbersWithKnownSum()

    @ExperimentalUnsignedTypes
    @Test
    fun findIndexesFromRandomPositiveForSum() {
        val source = intArrayOf(4,2,9,15,0,81,1)
        val result = subject.findIndexesWithSumOfValues(source, 10)
        assertTrue(intArrayOf(2, 6).contentEquals(result))
    }

    @ExperimentalUnsignedTypes
    @Test
    fun findIndexesFromRandomNegativeForSum() {
        val source = intArrayOf(4,2,9,15,0,81,1)
        val result = subject.findIndexesWithSumOfValues(source, 66)
        assertTrue(intArrayOf(3, 5).contentEquals(result))
    }

    @ExperimentalUnsignedTypes
    @Test
    fun findIndexesFromInvalidValuesForSum() {
        val source = intArrayOf(4,2,9,15,0,81,1)
        val result = subject.findIndexesWithSumOfValues(source, 12)
        assertTrue(intArrayOf().contentEquals(result))
    }

    @ExperimentalUnsignedTypes
    @Test
    fun findIndexesFromEmptyForSum() {
        val source = intArrayOf()
        val result = subject.findIndexesWithSumOfValues(source, 12)
        assertTrue(intArrayOf().contentEquals(result))
    }

    @ExperimentalUnsignedTypes
    @Test
    fun findIndexesFromOneValueForSum() {
        val source = intArrayOf(1)
        val result = subject.findIndexesWithSumOfValues(source, 12)
        assertTrue(intArrayOf().contentEquals(result))
    }
}