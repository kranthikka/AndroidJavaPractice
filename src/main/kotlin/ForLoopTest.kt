class ForLoopTest {
}

fun main(args: Array<String>) {
    val names = ArrayList<String>()
    names.add("Kranthi")
    names.add("Kiran")
    names.add("Ada")

    var c = names.get(0)
    //println(c)

    print("Full name: ")
    for(name in names) {
        print(name+" ")
    }
    println()
    println("Size: "+names.size)

}
