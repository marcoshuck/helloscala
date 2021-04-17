import org.scalatest.FunSuite

class RecursionFactorialTestSuite extends FunSuite{
  import ar.com.huck.helloscala.Recursion.factorial

  test("factorial(1) == 1") {
    assertResult(1)(factorial(1))
  }

  test("factorial(2) == 2") {
    assertResult(2)(factorial(2))
  }

  test("factorial(3) == 6") {
    assertResult(6)(factorial(3))
  }

  test("factorial(4) == 24") {
    assertResult(24)(factorial(4))
  }

  test("factorial(5) == 120") {
    assertResult(120)(factorial(5))
  }

  test("factorial(6) == 720") {
    assertResult(720)(factorial(6))
  }

  test("factorial(7) == 5040") {
    assertResult(5040)(factorial(7))
  }

  test("factorial(8) == 40320") {
    assertResult(40320)(factorial(8))
  }

  test("factorial(9) == 362880") {
    assertResult(362880)(factorial(9))
  }

  test("factorial(10) == 3628800") {
    assertResult(3628800)(factorial(10))
  }
}
