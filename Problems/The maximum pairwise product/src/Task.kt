import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE

    for (i in 1..n) {
        val num = scanner.nextInt()
        if (num > max1) {
            max1 = num
        } else if (num > max2) {
            max2 = num
        }
    }

    if (n > 1) {
        print(max1 * max2)
    } else print(max1)
}