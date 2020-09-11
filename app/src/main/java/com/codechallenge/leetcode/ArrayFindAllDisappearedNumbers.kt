package com.codechallenge.leetcode

class ArrayFindAllDisappearedNumbers {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        for (index in 0 .. nums.lastIndex) {
            val value = Math.abs(nums[index]) - 1
            nums[value] = Math.abs(nums[value]) * -1
        }
        val result = mutableListOf<Int>()
        for ((resultIndex, resultValue) in nums.withIndex()) {
            val currentValue = resultIndex + 1
            if (resultValue > 0) {
                result.add(currentValue)
            }
        }
        return result
    }
}