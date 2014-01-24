package week2

object exercise {

  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)       //> factorial: (n: Int)Int

  def tailFactorial(n: Int) = {
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)
    loop(1, n)
  }                                               //> tailFactorial: (n: Int)Int

  factorial(6)                                    //> res0: Int = 720
  tailFactorial(6)                                //> res1: Int = 720
}