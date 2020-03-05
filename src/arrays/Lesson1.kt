package arrays

//array is a collection of similar data types either of int,string etc.
//array in kotlin is mutable in nature with fixed size which means we can perform
//both read and write operations on elements of array
//you can declare an array explicitly and implicitly
//use the array function to create an array
//
fun main() {
    //declaring an array implicitly
    val country = "kenya"//array declaration implicitly
    val numbers = arrayOf(1,2,3,4,5,6,7,8)
    val names = arrayOf("johnny","kama","paulo","sila")
//declaring an array explicitly
    val county:String ="nai"
    val nums = arrayOf<Int>(1,2,3,4,5,6)
    val majina = arrayOf<String>("john","jo","paul")

//accessing array items
//1.use index numbers
    println(nums[1])
//2.use get(),takes the index number as an argument
    println(majina.get(2))

//creating an array using factory functions
val fruits = intArrayOf(1,2,34,4,5,6)
val isTrue = booleanArrayOf(true,false)

//    changing values in an array:use set() method
//    set() method takes two arguement:one is the index of the value you want to change,
//    the other arguement is the value to replace with
    majina.set(1,"ko")
    println(majina.get(1))

    val num_names:Int = majina.size
    println(num_names)

//    looping through an array
for (i in 0..num_names-1){

    if (majina[i].length<3){//length function:returns no of characters in a string
        println("konny")
    }else{
        println("hello world")
    }

}
















}

