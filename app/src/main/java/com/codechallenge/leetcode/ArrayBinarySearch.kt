package com.codechallenge.leetcode

class ArrayBinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return -1

        return searchIn(nums, 0, nums.lastIndex, target)
    }

    private fun searchIn(nums: IntArray, startIndex: Int, lastIndex: Int, target: Int): Int {
        if (startIndex == lastIndex || lastIndex - startIndex == 1) {
            if (nums[lastIndex] == target) {
                return lastIndex
            }
            if (nums[startIndex] == target) {
                return startIndex
            }
            return -1
        }
        val midIndex: Int = startIndex + (lastIndex - startIndex) / 2
        return when {
            nums[midIndex] == target -> {
                midIndex
            }
            nums[midIndex] > target -> {
                searchIn(nums, startIndex, midIndex - 1, target)
            }
            else -> {
                searchIn(nums, midIndex + 1, lastIndex, target)
            }
        }
    }
}