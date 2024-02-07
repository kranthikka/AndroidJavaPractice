import java.util.Scanner

class SampleTest2 {
}

fun sum() {
    var scanner = Scanner(System.`in`)
    println("Enter A value: ")
    var a=scanner.nextInt()
    println("Enter B value: ")
    var b=scanner.nextInt()
    var c= a+b
    println("Addition: $c")
}

fun main(arg: Array<String>) {
    //var a = 2
    //var b = 2
    //var c = a+b

    //println("Addition of $a and $b is: $c")

    println(sum())
}
