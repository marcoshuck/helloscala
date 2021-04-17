import org.scalatest.FunSuite

class FibonacciTestSuite extends FunSuite {
  import ar.com.huck.helloscala.Recursion.fibonacci
  test("fibonacci (2): 1 ") {
    assert(fibonacci(2) == 1)
  }

  test("fibonacci (3): 2 ") {
    assert(fibonacci(3) == 2)
  }

  test("fibonacci (4): 3 ") {
    assert(fibonacci(4) == 3)
  }

  test("fibonacci (5): 5 ") {
    assert(fibonacci(5) == 5)
  }

  test("fibonacci (6): 8 ") {
    assert(fibonacci(6) == 8)
  }

  test("fibonacci (7): 13 ") {
    assert(fibonacci(7) == 13)
  }

  test("fibonacci (8): 21 ") {
    assert(fibonacci(8) == 21)
  }

  test("fibonacci (9): 34 ") {
    assert(fibonacci(9) == 34)
  }

  test("fibonacci (10): 55 ") {
    assert(fibonacci(10) == 55)
  }

  test("fibonacci (11): 89 ") {
    assert(fibonacci(11) == 89)
  }

  test("fibonacci (12): 144 ") {
    assert(fibonacci(12) == 144)
  }

  test("fibonacci (13): 233 ") {
    assert(fibonacci(13) == 233)
  }

  test("fibonacci (14): 377 ") {
    assert(fibonacci(14) == 377)
  }

  test("fibonacci (15): 610 ") {
    assert(fibonacci(15) == 610)
  }

  test("fibonacci (16): 987 ") {
    assert(fibonacci(16) == 987)
  }

  test("fibonacci (17): 1597 ") {
    assert(fibonacci(17) == 1597)
  }

  test("fibonacci (18): 2584 ") {
    assert(fibonacci(18) == 2584)
  }

  test("fibonacci (19): 4181 ") {
    assert(fibonacci(19) == 4181)
  }

  test("fibonacci (20): 6765 ") {
    assert(fibonacci(20) == 6765)
  }

  test("fibonacci (30): 832040 ") {
    assert(fibonacci(30) == 832040)
  }

}
