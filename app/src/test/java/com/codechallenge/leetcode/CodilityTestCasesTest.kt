package com.codechallenge.leetcode

import junit.framework.Assert.assertEquals
import org.junit.Test

class CodilityTestCasesTest {
    val subject = CodilityTestCases()

    @Test
    fun solution() {
        val numberOfRaws = 2
        val orderedPlaces = "1A 2F 1C"
        assertEquals(2, subject.solution(numberOfRaws, orderedPlaces))
    }
}