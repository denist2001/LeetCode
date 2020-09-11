package com.codechallenge.leetcode

class BinarySearchInRotatedSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return -1
        if (nums.size == 1) return if (nums[0] == target) 0 else -1
        var border = 0
        for (index in 0 until nums.lastIndex) {
            border = index
            if (nums[index] == target) return index
            if (nums[index] > nums[index + 1]) {
                break
            }
        }
        return searchIn(nums, border + 1, nums.lastIndex, target)
    }

    private fun searchIn(nums: IntArray, startIndex: Int, stopIndex: Int, target: Int): Int {
        if (stopIndex <= startIndex) {
            return if (nums[stopIndex] == target) stopIndex else -1
        }
        val mid = startIndex + (stopIndex - startIndex) / 2
        val currentValue = nums[mid]
        return when {
            currentValue == target -> mid
            currentValue < target -> searchIn(nums, mid + 1, stopIndex, target)
            else -> searchIn(nums, startIndex, mid - 1, target)
        }
    }
}