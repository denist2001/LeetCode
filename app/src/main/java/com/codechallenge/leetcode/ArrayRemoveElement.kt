package com.codechallenge.leetcode

class ArrayRemoveElement {

    fun removeGivenNumberFromArray(nums: IntArray, `val`: Int): Int {
        var numberOfDeletedItems = 0
        for (index in nums.indices) {
            if (index + numberOfDeletedItems >= nums.size) {
                break
            }
            if (nums[index] == `val`) {
                var offset = 0
                for (backIndex in (nums.lastIndex - numberOfDeletedItems) downTo 0) {
                    if (nums[backIndex] == `val`) {
                        offset++
                    } else {
                        break
                    }
                }
                val leftValue = nums[index]
                numberOfDeletedItems += offset
                if (nums.lastIndex - numberOfDeletedItems <= 0
                    || nums.lastIndex == index
                    || index + numberOfDeletedItems >= nums.lastIndex) break
                nums[index] = nums[nums.lastIndex - numberOfDeletedItems]
                nums[nums.lastIndex - numberOfDeletedItems] = leftValue
                numberOfDeletedItems++
            }
        }
        return nums.size - numberOfDeletedItems
    }
}