fun main(){


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

    //Day 3
    takeMonths(arrayOf("january","june","july") )
    cars("Fortuner","Freed","Benz","Lexus")
    musicArray(arrayOf("Enjoy","Nakupenda","ForeverYoung"))
    ageArray(arrayOf(10,20,30,40,50))

    //Day 4
    var hannah = Myself("Hannah", 22, 56.0, "Brown", 1.6)
    hannah.talk()
    hannah.newAge()

    var person = Human("Hannah",22,52.4)
    person.eat(foodWeight = 67.8)
    person.credintials()

    var number = marks(20,35,90,2.8)
    println(number.lowestMark)
    println(number.highMark)

    //Day 5
    theSentence("Bernie brakes brown bagels and buns")
    println(calculate(arrayOf(3,3,6)).contentToString())
    println(calculatee(arrayOf(20,30,40,50)))
    println(ispalindrome("madam"))
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

//Day 3
fun takeMonths(months:Array<String>){
    months.forEach{month->
        println( month.capitalize())

    }
}
fun cars(firstcar:String,secondcar:String,thirdcar:String,fourthcar:String){
    var car:Array<String> = arrayOf(firstcar,secondcar,thirdcar,fourthcar)
    println(car.contentToString())
    println(car.size)
    println(car[0])
}
fun musicArray(music:Array<String>){
    music.set(1,"On fire")
    println(music.contentToString())


}
fun ageArray(age:Array<Int>){
    age.reverse()
    println(age.contentToString())

    age.sortedArray()
    println(age.contentToString())

    age.sort()
    println(age.contentToString())


    println(age.maxOrNull())

    age.forEach {num->
      println(num*num)

    }
}

//Day 4
class Myself(var name: String, var age: Int,var weight:Double, var complexion:String, var height:Double){
    fun talk(){
        println("Hello")
    }

    fun newAge(){
        println(age++)
    }
}

class Human(var name:String, var age:Int, var weight:Double){
    fun eat(foodWeight:Double){
        println("I am eating $foodWeight kgs of food")
    }
    fun credintials(){
        println("$name is $age years old")
    }
}
data class marks(
    var lowestMark:Int,
    var lowMark:Int,
    var highMark:Int,
    var average:Double
)

//Day 5
fun theSentence(sentence:String){
   println(sentence.replace("b"," "))
}

fun calculate(values:Array<Int>):Array<Any>{
    return arrayOf(values.sum(),values.count(),values.average())
}
data class Calculation(
    var sum:Int,
    var count:Int,
    var average:Double
)
fun calculatee(nums:Array<Int>):Calculation {
    var sum = nums.sum()
    var count = nums.count()
    var average = nums.average()
    var calculatee = Calculation(sum, count, average)
    return (calculatee)
}

fun ispalindrome(word: String):Boolean{
    var text = word.reversed()
    if(word == text){
        return (true)
    }
    else{
        return (false)
    }
}










