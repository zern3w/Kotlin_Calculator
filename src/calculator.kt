import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var result: Double? = null

    println("------------ Calculator ------------")
    println("-- Steps: 1.Enter 1st number     ---")
    println("--        2.Enter 2rd number     ---")
    println("--        3.Select the operation ---")
    println("------------------------------------")

    print("Enter 1st number: ")
    val val1 = input.nextDouble()
    print("Enter 2rd number: ")
    val val2 = input.nextDouble()
    print("Select the operation \n(1:add, 2:minus, 3:multiply, 4:divide): ")
    val op = input.nextInt()

    val cal = operation(val1, val2)

    when(op){
        1 -> result = cal.add()
        2 -> result = cal.minus()
        3 -> result = cal.multiply()
        4 -> result = cal.divide()
        else -> println("plz try again")
    }
    println("The result: " + result)
}