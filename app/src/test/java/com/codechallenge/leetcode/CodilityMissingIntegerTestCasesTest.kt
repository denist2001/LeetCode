package com.codechallenge.leetcode

import org.junit.Test

import org.junit.Assert.*
//This is a demo task.
//
//Write a function:
//
//fun solution(A: IntArray): Int
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//Given A = [1, 2, 3], the function should return 4.
//
//Given A = [−1, −3], the function should return 1.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [−1,000,000..1,000,000].
class CodilityMissingIntegerTestCasesTest {

    val subject = CodilityMissingIntegerTestCases()

    @Test
    fun solutionTest1() {
        val input = intArrayOf(1, 3, 6, 4, 1, 2)
        assertEquals(5, subject.solution(input))
    }

    @Test
    fun solutionTest2() {
        val input = intArrayOf(1, 2, 3)
        assertEquals(4, subject.solution(input))
    }

    @Test
    fun solutionTest3() {
        val input = intArrayOf(-1 , -3)
        assertEquals(1, subject.solution(input))
    }
}