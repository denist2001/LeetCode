package com.codechallenge.leetcode

/**
Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.
 */
class ArrayHeightChecker {

    fun heightChecker(heights: IntArray): Int {
        val resultArray = heights.copyOf()
        for (index in 0 .. resultArray.lastIndex) {
            for (subIndex in index + 1 .. resultArray.lastIndex) {
                if (resultArray[index] > resultArray[subIndex]) {
                    val temporary = resultArray[index]
                    resultArray[index] = resultArray[subIndex]
                    resultArray[subIndex] = temporary
                }
            }
        }
        var result = 0
        for (resultIndex in resultArray.indices) {
            if (heights[resultIndex] != resultArray[resultIndex]) {
                result +=1
            }
        }
        return result
    }

}