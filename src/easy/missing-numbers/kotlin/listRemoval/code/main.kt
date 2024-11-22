package easy.`missing-numbers`.kotlin.hashmap.code


/*
 * Complete the 'missingNumbers' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY arr
 *  2. INTEGER_ARRAY brr
 */

fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Array<Int> {
    // Write your code here
    val listArr = ArrayList(arr.toList())
    val listBrr = ArrayList(brr.toList())

    for(item in listArr) {
        listBrr.remove(item)
    }

    val result = listBrr.toSet().toTypedArray()
    result.sort()

    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val m = readLine()!!.trim().toInt()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = missingNumbers(arr, brr)
    println(result.joinToString(" "))
}
