package easy.introToTutorialChallenges.kotlin.binarySearch.code

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'introTutorial' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER V
 *  2. INTEGER_ARRAY arr
 */

fun binarySearch(arr: Array<Int>, v: Int): Int {
    var min = 0
    var max = arr.size-1

    while(max >= min) {
        val mid = (max + min) / 2

        if (arr[mid] == v) {
            return mid
        } else if (arr[mid] > v) {
            max = mid - 1
        } else {
            min = mid + 1
        }
    }

    return -1
}

fun introTutorial(V: Int, arr: Array<Int>): Int {
    // Write your code here
    return binarySearch(arr, V)
}

fun main(args: Array<String>) {
    val V = readLine()!!.trim().toInt()

    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = introTutorial(V, arr)

    println(result)
}