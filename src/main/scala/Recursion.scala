package ar.com.huck.helloscala

object Recursion {
  def squareOf(n: Int): Int = n * n

  def pow(v: Long, n: Int): Long = if (n == 0) 1 else v * pow(v, n-1)
}
