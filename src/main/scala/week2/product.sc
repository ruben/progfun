def product(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 1
  else f(a) * product(f)(a + 1, b)


def factorial(a: Int): Int = {
  product(x => x)(1, a)
}

factorial(5)

def reduce(g: Int => Int)(acc: Int, f: (Int, Int) => Int)(a: Int, b: Int): Int =
  if (a > b) acc
  else f(g(a), reduce(g)(acc, f)(a + 1, b))

def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  if (a > b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))


reduce(x => x)(0, (x, y) => x + y)(3, 5)
reduce(x => x)(1, (x, y) => x * y)(3, 5)

mapReduce(x => x, (x, y) => x + y, 0)(3, 5)
mapReduce(x => x, (x, y) => x * y, 1)(3, 5)





