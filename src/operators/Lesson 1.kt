package operators.lesson1

//arithmetic ops
//(+,-,*,/,%)
fun main(){
    var sum:Int //declare empty variable
    var height:Int = 12
    val width:Int = 21
    sum=height + width //addition operation
    println(sum)


    //comparison ops
//(<,<=,>=,!=,==)returm value is always a boolean(true or false)
    val isequal :Boolean = height ==width
    println(isequal)
    if(height > width){
        println("$height is > than $width")
    }else{
        println("$height is < than $width")
    }

//assignment ops
//    (+=,*=,*=,/=,%=)
val newheight :Int= 23
    height += newheight
    println("total height is $height ")
















}
