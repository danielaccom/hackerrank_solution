package easy.Ice_Cream_Parlor.kotlin.src.main.kotlin.brute_force
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'icecreamParlor' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER m
 *  2. INTEGER_ARRAY arr
 */

fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {
    // Write your code here
    for (i in 0..arr.size - 2) {
        for (j in i+1 .. arr.size - 1) {
            if (arr[i] + arr[j] == m) {
                return arrayOf(i+1, j+1)
            }
        }
    }

    return arrayOf()
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val m = readLine()!!.trim().toInt()

        val n = readLine()!!.trim().toInt()

        val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = icecreamParlor(m, arr)

        println(result.joinToString(" "))
    }
}
