package easy.howManyGames.kotlin.bruteForce.code

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
 * Complete the 'howManyGames' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER p
 *  2. INTEGER d
 *  3. INTEGER m
 *  4. INTEGER s
 */

fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
    // Return the number of games you can buy
    var currentBought = 0
    var currentPrice = p
    var currentPaid = 0

    while((currentPaid + currentPrice) <= s) {
        currentBought++
        currentPaid += currentPrice
        currentPrice = Math.max(m, (currentPrice - d))
    }

    return currentBought
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val p = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val m = first_multiple_input[2].toInt()

    val s = first_multiple_input[3].toInt()

    val answer = howManyGames(p, d, m, s)

    println(answer)
}