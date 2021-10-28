import org.scalatest.funsuite.AnyFunSuite

class StackTest extends AnyFunSuite{

  val alistStack = new StackImplement[Int](List(12,45,78,84,76))
  val emptyStack = new StackImplement[Int](List())

  test("Element should pushed in a Stack"){
    assert(alistStack.push(64).head == 64)
  }

  test("Poped Element should equals to first element of Stack"){
    assert(alistStack.pop.canEqual(12))
  }

  test("Stack is empty"){
    assert(emptyStack.isEmpty === true)
  }

  test("Stack is not empty"){
    assert(alistStack.isEmpty === false)
  }


  test("Top element should be the head of the Stack"){
    assert(alistStack.top == 12)
  }
}

