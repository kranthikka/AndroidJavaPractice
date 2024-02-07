class ListOfTest {
}

fun main() {
    var numbers = listOf(1, 2, 3, 4, 5)
    println(numbers[0])
    println(numbers[1])
    println(numbers[4])

    print("Numbers available: ")
    for (i in numbers) {
        print("$i ")
    }
}
