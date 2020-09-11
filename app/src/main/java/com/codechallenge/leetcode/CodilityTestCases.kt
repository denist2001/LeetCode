package com.codechallenge.leetcode

class CodilityTestCases {

    fun solution(N: Int, S: String): Int {
        val arrayOfOrderedPlaces = S.split(" ")
        //space btw columns CD & GH. I doesn't exist
        for (currentRaw in 1..N) {
            val raw = mutableListOf<Boolean>(
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false,
                false
            )
            for (sit in arrayOfOrderedPlaces) {
                if (sit.startsWith(currentRaw.toString(), false)) {
                    val currentChar = sit.last().toInt()// - 64 //a=66, i=73, k=75
                    val index = when (currentChar) {
                        in 66..72 -> currentChar - 65
                        in 74..75 -> currentChar - 66
                        else -> 0
                    }
                    raw[index] = true
                }
            }
            var previousPlase = 0
            for (rawIndex in raw.indices) {
                if (!raw[rawIndex]) {
                    val place = rawIndex
                }
            }

        }

        return 0
    }
}