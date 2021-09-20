fun main(){
/**/

   //Perform a number check inside of a function that verifies the user has entered a number
fun UserNumbers() {
    //Ask the user to enter a number
    print("please  enter your first number: ")
    val num1 = readLine()!!.toInt()
    println("$num1 ")
    //Ask the user to enter an operator
    print("please  enter your operator: ")
    val op = readLine()
    println("$num1 $op ")
    //Ask the user to enter a second number
    print("please  enter your second number: ")
    val num2 = readLine()!!.toInt()

//Create a function that performs addition, subtraction, division, and multiplication
    fun Math_oprations(num1: Int , num2: Int){
        if(op == "+" ){
            var sum = num1 + num2
            println("$num1 $op $num2 = ${sum.toFloat()}")

        } else if (op == "-"){
            var sum = num1 - num2
            println("$num1 $op $num2 = ${sum.toFloat()}")
        } else if (op == "*"){
            var sum = num1 * num2
            println("$num1 $op $num2 = ${sum.toFloat()}")
        } else if (op == "/"){
            //Perform a zero division check
            if (num2 == 0){
println("you cant divide by 0, try another number")
                UserNumbers()
            }else{
                var sum = num1 / num2
                println("$num1 $op $num2 = ${sum.toFloat()}")

            }
        }  else {
            //Verify that the user has entered numbers and a valid operator
            print("Please choose a proper operator ")
        }
}
Math_oprations(num1,num2)
}
    UserNumbers()
}
