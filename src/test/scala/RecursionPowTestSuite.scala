import org.scalatest.FunSuite

class RecursionPowTestSuite extends FunSuite {
  import ar.com.huck.helloscala.Recursion.pow

  test("pow(v, 0) == 1") {
    assertResult(1)(pow(1, 0))
    assertResult(1)(pow(2, 0))
    assertResult(1)(pow(3, 0))
    assertResult(1)(pow(4, 0))
    assertResult(1)(pow(5, 0))
    assertResult(1)(pow(6, 0))
  }

  test("pow(1, n) == 1") {
    assertResult(1)(pow(1, 0))
    assertResult(1)(pow(1, 1))
    assertResult(1)(pow(1, 2))
    assertResult(1)(pow(1, 3))
    assertResult(1)(pow(1, 4))
    assertResult(1)(pow(1, 5))
  }

  test("pow(2, 2) == 4") {
    assertResult(4)(pow(2, 2))
  }

  test("pow(2, 3) == 8") {
    assertResult(8)(pow(2, 3))
  }

  test("pow(3, 2) == 9") {
    assertResult(9)(pow(3, 2))
  }
}