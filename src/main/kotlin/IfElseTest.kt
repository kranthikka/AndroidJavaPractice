class IfElseTest {
}

//fun main() {
fun mark() {
    var marks = 105

    if (marks in 70..100) {
        println("Pass")
    } else if (marks in 0..69) {
        println("Fail")
    } else {
        println("Invalid")
    }
}

fun main() {
    val marks = 105

    when {
        marks in 90..100 -> println("$marks Marks - A Grade")
        marks in 80..89 -> println("$marks Marks - B Grade")
        marks in 70..79 -> println("$marks Marks - C Grade")
        marks in 0..69 -> println("$marks Marks - Fail")
        else -> println("$marks Marks - Invalid/Out of range")
    }

}


/*
* open class
* sub class
* */

/*
* inline
* */

/*sealed classes*/
/*check null safety*/

/*Scope functions - very important*/