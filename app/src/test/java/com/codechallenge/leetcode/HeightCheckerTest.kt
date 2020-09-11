package com.codechallenge.leetcode

import junit.framework.Assert.assertEquals
import org.junit.Test

class HeightCheckerTest {

    val subject = ArrayHeightChecker()

    @Test
    fun `when input 1,1,4,2,1,3 should return 3`() {
        val input = intArrayOf(1, 1, 4, 2, 1, 3)
        assertEquals(3, subject.heightChecker(input))
    }

    @Test
    fun `when input 5,1,2,3,4 should return 5`() {
        val input = intArrayOf(5, 1, 2, 3, 4)
        assertEquals(5, subject.heightChecker(input))
    }

    @Test
    fun `when input 1,2,3,4,5 should return 0`() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(0, subject.heightChecker(input))
    }
}