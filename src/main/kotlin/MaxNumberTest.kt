class MaxNumberTest {
}

fun main() {
    var list = ArrayList<Int>()
    list.add(100)
    list.add(200)
    list.add(300)
    list.add(155)
    list.add(166)
    list.add(1777)

    var maxValue = 0
    val listSize = list.size
    println("List of values: $list")
    println("Total values: $listSize")

    for (i in list.indices) {
        val numbers = list[i]
        if (numbers > maxValue) {
            maxValue = numbers
        }
    }
    println("Max value/number is $maxValue")
}
