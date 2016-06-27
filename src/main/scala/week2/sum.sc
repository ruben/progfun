def sum(f: Int => Int)(a: Int, b: Int): Int = {

  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, acc + f(a))
  }

  loop(a, 0)

}

def sumInts(a: Int, b: Int): Int = sum(x => x)(a, b)

sumInts(3,5)