fun main() {


    var numbers:Array<Int> = arrayOf(2,1,4,3,6,8,7,10)
    var sum = 0
    numbers.forEach{ x:Int ->
        if (x % 2 == 0){
            sum+= x
        }
    }
    println(sum)

names("Hannah","Konemi","Pempho", "Tina")

    println(name("Hannah"))

    subtraction(30, 26)

    //Day 2
    temperature(56.7)

    information("Hannah",22, "Pink")

    average(3, 6,9)
    convertTemp(32)
    println(newAge(22))

    myString(("Hannah"))
    }


fun names(nam1:String, nam2:String, nam3:String, nam4:String){
    var name:Array<String> = arrayOf(nam1,nam2,nam3,nam4)
    println(name.contentToString())
}

fun name(word:String):Int{
    var result = word.length
    return result
}

fun subtraction(num1: Int,num2:Int ){
    var difference = num1 - num2
    println(difference)
}

//Day 2
fun temperature(num:Double){
    var message = "The temperature is  $num degree Celcius"
    println(message)
}

fun information(name:String, age:Int, color: String){
    var text = (name) +" "+(age )+" "+ (color)
    println(text)
}
fun average(num1:Int, num2:Int, num3: Int){
    var sum = num1 + num2 + num3
    var avg = sum / 3
    println(avg)
}
fun convertTemp(num : Int){
    var converting = num * 1.8 + 32
    println(converting.toDouble())
}

fun newAge(age:Int):Int{
    return age + 1
}
fun myString(word:String){
    println(word.indexOf("a"))
    println(word.uppercase())
    println(word.startsWith("z"))
}







