import org.scalatest.FunSuite

class RecursionSquareOfTestSuite extends FunSuite {
  import ar.com.huck.helloscala.Recursion.squareOf

  test("squareOf(1) == 1") {
    assertResult(1)(squareOf(1))
  }

  test("squareOf(2) == 4") {
    assertResult(4)(squareOf(2))
  }

  test("squareOf(4) == 16") {
    assertResult(16)(squareOf(4))
  }
}