
class Person(val name: String, private val superheroName: String)

object Person {
  def showMeInnerSecret(x: Person) = x.superheroName
  def main(args: Array[String]) {
    val clark = new Person("Clark Kent", "Superman")
    val peter = new Person("Peter Parker", "Spider-Man")

    println("clark's secret = " + Person.showMeInnerSecret(clark))
    println("peter's secret = " + Person.showMeInnerSecret(peter))
  }
}
