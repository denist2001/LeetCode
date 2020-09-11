package com.codechallenge.leetcode

class StringRotation {
    fun reorder(source: String): String {
        val splittedSource = source.split(" ").toMutableList()
        val storedString = splittedSource[2]
        splittedSource[2] = splittedSource[0]
        splittedSource[0] = storedString
        return splittedSource.joinToString(separator = " ")
    }
}
//val arrayString = "asdfgh lkjhg"
//val arrayChars = arrayString.toCharArray()
//for (char in arrayChars) {
//
//}