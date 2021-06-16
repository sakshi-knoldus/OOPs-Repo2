
class Person(val name: String, val age: Int) extends Ordered[Person]{
  def compare(person: Person):Int={
    if(this.name == person.name){
      println("Person name is equal")
      this.age - person.age
    }
    else{
      println("Compare the length of name")
      this.name.length compare person.name.length
    }
  }
}
object Main{
  def main(args: Array[String]){
    val personOne = new Person("Test",24)
    val personTwo = new Person("Test",25)
    val personThree = new Person("TestAgain", 24)
    val personFour = new Person("Test", 25)
    println(personOne > personTwo)
    println(personThree < personFour)
    println(personTwo >= personFour)
  }
}