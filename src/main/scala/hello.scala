/**
 * Created by Hugo on 13/10/2014.
 */
object hello {

  def countTo(numberTo : Int): Unit = {
    def count(number : Int):Unit = {
      println(number)
      if(number < numberTo)
        count(number+1)
    }

    count(1)
  }

  def factorial(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  def main(args: Array[String]) {
    println("Hello World, Scala")
    countTo(5)
    println(factorial(5))
  }
}
