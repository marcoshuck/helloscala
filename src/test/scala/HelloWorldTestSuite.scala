import org.scalatest.FunSuite

class HelloWorldTestSuite extends FunSuite {
  test("HelloWorld.getHelloWorld") {
    import ar.com.huck.helloscala.HelloWorld.getHelloWorld
    assert(getHelloWorld == "hello, world")
  }
}
