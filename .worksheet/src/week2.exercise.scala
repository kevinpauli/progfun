package week2

object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(110); 

  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1);System.out.println("""factorial: (n: Int)Int""");$skip(145); 

  def tailFactorial(n: Int) = {
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)
    loop(1, n)
  };System.out.println("""tailFactorial: (n: Int)Int""");$skip(17); val res$0 = 

  factorial(6);System.out.println("""res0: Int = """ + $show(res$0));$skip(19); val res$1 = 
  tailFactorial(6);System.out.println("""res1: Int = """ + $show(res$1))}
}
