
class ClassWithValParameter(val name:String) {
}

object ClassWithValue {
  def main(args: Array[String]) {
    val aClass = new ClassWithValParameter("Gandalf")
    println(aClass.name)
  }
}
