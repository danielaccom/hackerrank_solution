package easy.sherlockAndArray.kotlin.bruteForce.code

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
 * Complete the 'balancedSums' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun sumArray(arr: Array<Int>, startIdx: Int, endIdx: Int) : Int{
    var sum = 0
    for (i in startIdx..endIdx) {
        if(i < 0 || i >= arr.size|| endIdx < 0 || endIdx >= arr.size) {
            continue
        }
        sum += arr[i]
    }
    return sum
}

fun balancedSums(arr: Array<Int>): String {
    // Write your code here
    for (i in 0..arr.size-1) {
        val leftSum = sumArray(arr, 0, i-1)
        val rightSum = sumArray(arr, i+1, arr.size-1)

        if(leftSum == rightSum) {
            return "YES"
        }
    }

    return "NO"

}

fun main(args: Array<String>) {
    val T = readLine()!!.trim().toInt()

    for (TItr in 1..T) {
        val n = readLine()!!.trim().toInt()

        val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = balancedSums(arr)

        println(result)
    }
}
