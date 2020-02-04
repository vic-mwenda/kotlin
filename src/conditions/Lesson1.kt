package conditions

fun main(args: Array<String>) {
    val x:Int = 3
    val y:Int = 5

//if
if(x < y){
    println("$x is less than $y")
}
//if else
if(x > y){
    println("$x is greater than $y")
}else{
    println("$x is less than $y")
}
//if else if else
    if(x > y){
        println("$x is greater than $y")
    }else if (y >= 5){
        println("$y is greater than or equal to 5")
    }else{
        println("closing the program")
    }
//    when statement
//    when(){
//        state1 -> println("hello world")
//        state2 -> println("hello world")
//        state3 -> println("hello world")
//        state4 -> println("hello world")
//    }
    println("enter your age : ")
    val myAge :String = readLine()!!//ask user to enter age
//    val age:Int = 17
    var age_age_as_Int:Int = myAge.toInt()
    age_age_as_Int %=2
    when(age_age_as_Int){
        12 -> println("join class 6")
        13 -> println("join class 7")
        14 -> println("join class 8")
        15 -> println("join form 1")
        17 -> println("join form 2")
        0 -> println("even")
        1 -> println("odd")
    }
    println("what is your age : ")
    val yourAge :String = readLine()!!//ask user to enter age
    var age_int : Int = yourAge.toInt()
    age_int %= 2
    when (age_int){
        0 -> println("even")
        1 -> println("odd")
    }

}
