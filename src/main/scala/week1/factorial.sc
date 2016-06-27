def factorial(x: Int): Int = {

  def loop(acc: Int, x: Int): Int =
    if (x == 0) acc else loop(acc * x, x - 1)

  loop(1, x)

}

factorial(2)
factorial(3)
factorial(4)

