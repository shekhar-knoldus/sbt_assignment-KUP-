import com.sun.org.apache.xalan.internal.lib.ExsltMath.{abs, power}

import java.lang.invoke.MethodHandles.loop
import scala.util.control.Breaks
//class
class Calculator() {
  //Addition
  def sum(x:Int, y:Int) {
  {
    println("Sum of two no is :"+(x+y))
  }
  //Subtraction
  }

  def diff(x:Int, y:Int)
  {
    println("Subtract of two no is :"+(x-y))
  }


  def multiply(x:Int, y:Int)  //Multiply
  {
    println("Multiply of two no is :"+(x*y))
  }
  def divide(x:Int, y:Int)    //Divide
  {
    if(y<=0)
    {
      print("\nDenominator should be greater the Zero ")
    }
    println("Divide of two no is  \t:"+(x/y))
  }
  def max(x:Int, y:Int)       //Maximum
  {
    if(x>y)
      println("Max of two no is :"+x)
    else
      println("Max of two no is :"+y)

  }
  def min(x:Int, y:Int)     //Minimum
  {
    if(x>y)
      println("Max of two no is :"+y)
    else
      println("Max of two no is :"+x)

  }
  def power(x:Int, y:Int)      //Power
  {
    var ans = scala.math.pow(x,y)
    println("The value of "+x+" to the power of "+y+" is "+ ans)
  }
  def absolute(x:Int, y:Int)    //Absolute
  {
    println("Absolute of two no is :"+abs(x+y))
  }
  def modulus(x:Int, y:Int)      //Modulus
  {
    {
      var s=(x%y)
      println("Modules of two no is :"+s)
    }
    val loop=Breaks
  }
}

//object
object Calc{
  def main(args: Array[String]): Unit = {    //main method
    println("Enter your two numbers: ")
    var  x= scala.io.StdIn.readInt()
    var  y= scala.io.StdIn.readInt()
    val loop= new Breaks
    val calc= new Calculator()
    while(true){
      print("Enter your choice: \n 1.SUM  \n 2. SUBTRACT  \n 3. MULTIPLY \n 4. DIVIDE \n 5. MAXIMUM  \n 6. MINIMUM \n 7. POWER \n 8. ABSOLUTE \n 9. MODULOS \n 10. Exit\n ")
      var ch=scala.io.StdIn.readInt()
      loop.breakable{
        if(ch==10)
        {
          loop.break()
        }
      }
      val description = ch match {
        case 1 => calc.sum(x, y)
        case 2 => calc.diff(x, y)
        case 3 => calc.multiply(x, y)
        case 4 => calc.divide(x, y)
        case 5 => calc.max(x, y)
        case 6 => calc.min(x, y)
        case 7 => calc.power(x, y)
        case 8 => calc.absolute(x, y)
        case 9 => calc.modulus(x, y)
      }
    }
  }
}




















