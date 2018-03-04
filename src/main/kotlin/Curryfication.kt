package main.kotlin

val sum3 = { a: Int -> { b: Int -> a + b} }

fun sum2(a: Int): (Int) -> Int = { it + a }

fun sum(a: Int) = fun(b: Int) : Int {
    return a + b
}

fun main(args: Array<String>) {
    sum2(5) (6)
    sum3(5)(6)
}
