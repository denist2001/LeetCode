package com.codechallenge.leetcode

class ArrayMoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        if (nums.isEmpty()) return
        for (writeIndex in 0 until nums.lastIndex) {
            if (nums[writeIndex] == 0 ) {
                var targetIndex = writeIndex + 1
                for (readIndex in writeIndex + 1 .. nums.lastIndex) {
                    if (nums[readIndex] != 0) {
                        targetIndex = readIndex
                        break
                    }
                }
                nums[writeIndex] = nums[targetIndex]
                nums[targetIndex] = 0
            }
        }
    }
}