package easy.viralAdvertising.kotlin.linear.code

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
 * Complete the 'viralAdvertising' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun viralAdvertising(n: Int): Int {
    // Write your code here
    var shared = 5
    var cumulative = 0
    var liked = 0

    for (i in 1..n) {
        liked = Math.floor(shared/2.00).toInt()
        shared = liked * 3
        cumulative += liked
    }

    return cumulative
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}
