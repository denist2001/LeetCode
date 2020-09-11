package com.codechallenge.leetcode

import org.junit.Assert.*
import org.junit.Test

class StringRotationTest {
    val subject = StringRotation()

    @Test
    fun changeWordsOrder() {
        val source = "мама мыла раму"
        assertEquals("раму мыла мама", subject.reorder(source))
    }
}