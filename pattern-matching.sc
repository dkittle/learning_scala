
trait Person {
  def name: String
}

case class Student(override val name: String, age: Int) extends Person
case class Teacher(override val name: String, salary: Int) extends Person

val avery = Student("Avery", 5)
val hannah = Student("Hannah", 14)
val don = Teacher("Don", 35000)

def greetPerson(p: Person): Unit = p match {
  case Student(n, a) if a < 6 => println(s"Hello $n, you are in kindergarten")
  case Student(n, a) if a < 14 => println(s"Hello $n, you are in elementary school")
  case Student(n, a) if a < 19 => println(s"Hello $n, you are in high school")
  case Teacher(n, _) => println(s"Hello teacher $n")
  case _ => println("Hello unknown person")
}

greetPerson(avery)
greetPerson(hannah)
greetPerson(don)
