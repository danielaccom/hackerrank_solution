

fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {
    // Write your code here
    val map = HashMap<Int, Int>()

    for (i in 0..arr.size - 1) {
        val target = m - arr[i]
        if (map.containsKey(target)) {
            return arrayOf(map[target]!! + 1, i+1)
        }
        map.put(arr[i], i)
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
