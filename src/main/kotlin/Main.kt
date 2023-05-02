

fun main(){
    information("Linah",29,"Rwanda")
    var numbers= sum(21,52,83,49)
    println(numbers)
    println(average(79,60,70,75,96))
    var k=personRecords("Linah Wanjiru Mugure",18,"0746852623","wanjirulinahw@gmail.com",30.8F,true or false)

}
//1. Create and invoke a function that takes in a users name, age, and nationality and
// prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy,
// I am 23 years old and I am from Kenya” (2 points)
fun information(userName:String,age:Int,nationality:String){
    println("Hello,my name is ${userName},i am ${age} and I am  from ${nationality}")
}
//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun sum(num4:Int,num5:Int,num6:Int,num7:Int):Int{
    var sum=num4+num5+num6+num7
    return sum
}

//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun average(num1: Int, num2: Int, num3: Int, num4: Int, num5: Int): Int {
    var numbers = 5
    val sum = num1 + num2 + num3 + num4 + num5
    return sum / numbers

}
//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
fun personRecords(fullName:String,age: Int,phoneNumber: String,email:String,weight:Float,citizen:Boolean){
    println("My name is ${fullName},phoneNumber is ${phoneNumber},email is ${email},i have ${weight}kgs and i am a  Kenyan ${citizen}")

}



