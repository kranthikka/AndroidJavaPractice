import java.util.Scanner

class PalindromeK {
}

fun main() {
    var scanner = Scanner(System.`in`)
    println("Enter text: ")
    var text = scanner.next().lowercase()
    var reversedText = text.reversed()

    if (text.contentEquals(reversedText)) {
        println("$text is a palindrome")
    } else {
        println("$text is not a palindrome")
    }
}