package com.codechallenge.leetcode

import java.util.ArrayList

class ArrayThirdMaximumNumber {

    fun thirdMax(nums: IntArray): Int {
        val resultArray = arrayListOf<Int?>(null, null, null)
        for ((index, value) in nums.withIndex()) {
            for ((resIndex, resValue) in resultArray.withIndex()) {
                if (resValue == null) {
                    resultArray[resIndex] = value
                    break
                }
                if (value == resValue) {
                    break
                }
                if (value > resValue) {
                    insertValue(resultArray, resIndex, value)
                    break
                }
            }
        }
        return if (resultArray[resultArray.lastIndex] == null) resultArray[0]!!
        else resultArray[resultArray.lastIndex]!!
    }

    private fun insertValue(resultArray: ArrayList<Int?>, resIndex: Int, value: Int) {
        for (index in resultArray.lastIndex downTo resIndex + 1) {
            resultArray[index] = resultArray[index - 1]
        }
        resultArray[resIndex] = value
    }
}