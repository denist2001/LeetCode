package com.codechallenge.leetcode

class ArrayRemoveDuplicatesFromSortedArray {

    fun removeDuplicates(nums: IntArray): Int {
        var length = nums.size
        for (index in nums.lastIndex - 1 downTo 0) {
            if (nums[index] == nums[index + 1]) {
                for (subIndex in index + 1 .. nums.lastIndex) {
                    nums[subIndex - 1] = nums[subIndex]
                }
                length--
            }
        }
        return length
    }

    fun removeDuplicatesTwoPointersTechnique(nums: IntArray?): Int {
        // Check for edge cases.
        if (nums == null) {
            return 0
        }
        // Use the two pointer technique to remove the duplicates in-place.
        // The first element shouldn't be touched; it's already in its correct place.
        var writePointer = 1
        // Go through each element in the Array.
        for (readPointer in 1 until nums.size) {
            // If the current element we're reading is *different* to the previous
            // element...
            if (nums[readPointer] != nums[readPointer - 1]) {
                // Copy it into the next position at the front, tracked by writePointer.
                nums[writePointer] = nums[readPointer]
                // And we need to now increment writePointer, because the next element
                // should be written one space over.
                writePointer++
            }
        }
        // This turns out to be the correct length value.
        return writePointer
    }
}