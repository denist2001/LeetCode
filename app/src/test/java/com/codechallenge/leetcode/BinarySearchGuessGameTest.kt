package com.codechallenge.leetcode

import org.junit.Assert.*
import org.junit.Test

class BinarySearchGuessGameTest {
    val subject = BinarySearchGuessGame()

    @Test
    fun `when number is 1 should return 1`() {
        assertEquals(1, subject.guessNumber(1))
    }

    @Test
    fun `when number is 10 from 15 should return 10`() {
        assertEquals(10, subject.guessNumber(15))
    }
}