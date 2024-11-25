package easy.findDigits.kotlin.linearSearch.code

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
 * Complete the 'findDigits' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun findDigits(n: Int): Int {
    // Write your code here
    val digits = n.toString()
    var numberOfDivisor = 0

    for (digit in digits) {
        if (digit.digitToInt() == 0) {
            continue
        }
        if (n % digit.digitToInt() == 0) {
            numberOfDivisor++
        }
    }

    return numberOfDivisor
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val result = findDigits(n)

        println(result)
    }
}
