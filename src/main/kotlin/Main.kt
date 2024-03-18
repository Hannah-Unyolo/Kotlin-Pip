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







