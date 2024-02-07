class IteratorTest {
}

fun main() {
    var numbers = listOf(1, 2, 3, 4, 5)
    var iterator = numbers.iterator()

    while (iterator.hasNext()) {
        val element = iterator.next()
        println(element)
    }
}
