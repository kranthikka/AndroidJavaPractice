import java.util.Scanner

class IncrementTest {
}

fun main() {
    val stringScanner = Scanner(System.`in`)
    val intScanner = Scanner(System.`in`)

    println("Enter number of lines: ")
    var maxNumber = intScanner.nextInt()
    println("Enter a character: ")
    var char = stringScanner.nextLine()
    println("Result: ")

    for (i in 1..maxNumber) {
        for (j in 1..i) {
            print(char)
        }
        println()
    }
}
