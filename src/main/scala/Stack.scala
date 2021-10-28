trait Stack[A]{
  def push(elem: A): List[A]
  def pop(): List[A]
  def isEmpty(): Boolean
  def top(): A
}
class StackImplement[A](var list: List[A]) extends Stack[A]{

  override def isEmpty: Boolean = list.isEmpty

  override def push(elem: A): List[A] = {
    list = elem :: list
    list
  }

  override def pop: List[A]= {
    if(!isEmpty) {
      list.drop(1)
    }
    else {
      throw new NoSuchElementException("Stack is Empty")
    }
  }

  override def top: A = {
    list.head
  }
}

object StackRun extends App{
  val list = List(12,29,32,42,56,62,75,84,96)
  val myStack = new StackImplement[Int](list)
  println(myStack.push(19))
  println(myStack.push(24))
  println(myStack.pop)
  println(myStack.isEmpty)
  println(myStack.top)

}