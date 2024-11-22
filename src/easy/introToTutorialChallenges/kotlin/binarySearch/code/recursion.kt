package easy.introToTutorialChallenges.kotlin.binarySearchRecursion.code

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'introTutorial2' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER V
 *  2. INTEGER_ARRAY arr
 */

fun binarySearchRecursion(arr: Array<Int>, v: Int, min: Int, max: Int): Int {
    if (max < min) {
        return -1
    }

    val mid = (max + min) / 2

    if (arr[mid] == v) {
        return mid
    } else if (arr[mid] > v) {
        return binarySearchRecursion(arr, v, min, mid-1)
    } else {
        return binarySearchRecursion(arr, v, mid+1, max)
    }
}

fun introTutorial2(V: Int, arr: Array<Int>): Int {
    // Write your code here
    return binarySearchRecursion(arr, V, 0, arr.size-1)
}

fun main(args: Array<String>) {
    val V = readLine()!!.trim().toInt()

    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = introTutorial2(V, arr)

    println(result)
}
