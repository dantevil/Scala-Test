import org.scalatest.{FlatSpec, Matchers}

class Demotest extends FlatSpec with Matchers{

  "MyUtil" should "Divide 2 numbers" in {
    MyUtil.div(10,5) should be (2)
  }

  it should "throw ArithmeticException if attempted to divide by 0" in {
    a[java.lang.ArithmeticException] should be thrownBy{
      MyUtil.div(10,0)
    }
  }
  it should "let adults vote " in{
    MyUtil.Vote(18) should be (true)
  }
  it should "age not reached "in {
    MyUtil.Vote(16) should be (false)
  }

}
