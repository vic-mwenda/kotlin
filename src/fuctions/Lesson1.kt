package fuctions
//a block of that has a specific task e.g println()
//fun nameoffunction(){
//    code to execute
//}
fun greetings(){
    println("hello world")
}
fun greeting2(name: String){
    println("hello $name")
}
fun greetings3(name:String,age:Int){
    println("hey I am $name $age years old")
}
fun hesabu(name: String){
    val x=name.length
    println(x)
}
fun hesabu2(x:Int,y:Int){
    var
   sum:Int = x + y
    println(sum)
}
fun area_of_circle(pie:Int,radius1:Int,radius2:Int){
    var product:Int = pie*radius1*radius2
    println(product)

}
fun area_of_sufuria(height:Int,radius:Int){
    var pie:Float = 3.142F
    val ans=pie*height*radius*radius
    println(ans)
}
fun even_or_odd(first:Int){
    if (first % 2 ==0 ){
        println("even")

    }else{
        println("odd")
    }

}
//parameter is value put after function name
//arguement
fun main() {
//to call a function use greetings1()
//    MUST be in the main function
    greetings()
    println("hello once again")
    greeting2(name = "john")
    greetings3(name = "john",age = 54)
    hesabu(name = "johnte")
    hesabu2(x = 23,y = 34)
    area_of_circle(pie = 3 ,radius1 = 7,radius2 = 7 )
    even_or_odd(first = 3)
    area_of_sufuria(height = 12,radius = 7)

}
