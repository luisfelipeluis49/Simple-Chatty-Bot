package bot

import java.util.*


val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Inkomodo", "2020") // change it as you need
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is $assistantName.")
    println("I was created in $birthYear.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, $name!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Say me remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val number = scanner.nextInt()
    for (i in 0 .. number) println("$i!")
}

fun test() {
    while (true) {
        println("Let's test your programming knowledge.")
        println("What JVM programming language it's preferred by Google to develop Android applications?")
        println("1. Java")
        println("2. Scala")
        println("3. Kotlin")
        println("4. Clojure")
        if (scanner.nextInt() != 3) println("Please, try again.")
        else return
    }
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}
