package com.codechallenge.leetcode

import org.junit.Assert.*
import org.junit.Test

class Sqrt_XTest {
    val subject = Sqrt_X()

    @Test
    fun `when number is 0 should return 0`() {
        assertEquals(0, subject.mySqrt(0))
    }

    @Test
    fun `when number is 1 should return 1`() {
        assertEquals(1, subject.mySqrt(1))
    }

    @Test
    fun `when number is 2 should return 1`() {
        assertEquals(1, subject.mySqrt(2))
    }

    @Test
    fun `when number is 3 should return 1`() {
        assertEquals(1, subject.mySqrt(3))
    }

    @Test
    fun `when number is 4 should return 2`() {
        assertEquals(2, subject.mySqrt(4))
    }

    @Test
    fun `when number is 8 should return 2`() {
        assertEquals(2, subject.mySqrt(8))
    }

    @Test
    fun `when number is 9 should return 3`() {
        assertEquals(3, subject.mySqrt(9))
    }

    @Test
    fun `when number is 10 should return 3`() {
        assertEquals(3, subject.mySqrt(10))
    }

    @Test
    fun `when number is 15 should return 3`() {
        assertEquals(3, subject.mySqrt(15))
    }

    @Test
    fun `when number is 2_147_395_599 should return 46339`() {
        assertEquals(46339, subject.mySqrt(2_147_395_599))
    }

    @Test
    fun `when number is 2_147_483_647 should return 46340`() {
        assertEquals(46340, subject.mySqrt(2_147_483_647))
    }
}