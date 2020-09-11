package com.codechallenge.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

class ArrayRemoveElementTest {

    val arrayRemoveElement = ArrayRemoveElement()

    @Test
    fun givenNumsArray_shouldRemoveGivenNum() {
        val givenArray: IntArray = intArrayOf(3,2,2,3)
        val result = arrayRemoveElement.removeGivenNumberFromArray(givenArray, 3)
        assertEquals(2, result)
    }

    @Test
    fun givenMixedNumsArray_shouldRemoveGivenNum() {
        val givenArray: IntArray = intArrayOf(0,1,2,2,3,0,4,2)
        val result = arrayRemoveElement.removeGivenNumberFromArray(givenArray, 2)
        assertEquals(5, result)
    }

    @Test
    fun givenOnlyRemovedNumsArray_shouldReturnSize() {
        val givenArray: IntArray = intArrayOf(2,2,2,2,2,2,2,2)
        val result = arrayRemoveElement.removeGivenNumberFromArray(givenArray, 2)
        assertEquals(0, result)
    }

    @Test
    fun givenTwoNumsArray_shouldReturnOne() {
        val givenArray: IntArray = intArrayOf(4,5)
        val result = arrayRemoveElement.removeGivenNumberFromArray(givenArray, 5)
        assertEquals(1, result)
    }

    @Test
    fun givenThreeNumsArray_shouldReturnTwo() {
        val givenArray: IntArray = intArrayOf(2,2,3)
        val result = arrayRemoveElement.removeGivenNumberFromArray(givenArray, 3)
        assertEquals(2, result)
    }

    @Test
    fun givenNineNumsArray_shouldReturnFour() {
        val givenArray: IntArray = intArrayOf(0,4,4,0,4,4,4,0,2)
        val result = arrayRemoveElement.removeGivenNumberFromArray(givenArray, 4)
        assertEquals(4, result)
    }
}