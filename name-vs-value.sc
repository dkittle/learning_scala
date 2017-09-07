def double(i: Int): Int = {
  println("doubling")
  i * 2
}

def byValue(i: Int): Unit = {
  println("inside byValue")
  println(s"about to double your balance to $i")
  // some business logic here
  println(s"doubled your balance to $i")
}

def byName(i: => Int): Unit = {
  println("inside byName")
  println(s"about to double your balance to $i")
  // some business logic here
  println(s"doubled your balance to $i")
}

byValue(14)

byName(18)

byValue(double(7))

// When you pass a FUNCTION by name, it's evaluated each time it's referenced
byName(double(9))
