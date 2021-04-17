package ar.com.huck.helloscala

object Recursion {
  def squareOf(n: Int): Int = n * n

  def pow(v: Long, n: Int): Long = if (n == 0) 1 else v * pow(v, n-1)

  def factorial(f: Long): Long = if (f == 0) 1 else f * factorial(f - 1)
}
