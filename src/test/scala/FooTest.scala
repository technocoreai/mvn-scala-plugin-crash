import org.scalatest.FunSuite

class FooTest extends FunSuite {

  test("foo should foo") {
    assert(Foo.foo(1, 2) === 3)
  }

}
