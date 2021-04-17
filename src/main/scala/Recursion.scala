package ar.com.huck.helloscala

object Recursion {
  /**
   * squareOf receives a numeric argument and returns the square of that number.
   * @param n is the number
   * @return n times n
   */
  def squareOf(n: Int): Int = n * n

  /**
   * pow receives a value and the amount of times it should be multiplied by itself.
   * @param v the value.
   * @param n the number of times v needs to be multiplied.
   * @return v multiplied n times v
   */
  def pow(v: Long, n: Int): Long = if (n == 0) 1 else v * pow(v, n-1)

  /**
   * factorial calculates the factorial of a certain number f.
   * @param f is the number to calculate the factorial.
   * @return the factorial of f.
   */
  def factorial(f: Long): Long = if (f == 0) 1 else f * factorial(f - 1)

  /**
   * fibonacci calculates the fibonacci number of a certain number.
   * @param f is the number to calculate the fibonacci.
   * @return the fibonacci number of f.
   */
  def fibonacci(f: Long): Long = if (f == 0) 0 else if (f == 1) 1 else fibonacci(f-2) + fibonacci(f-1)
}
