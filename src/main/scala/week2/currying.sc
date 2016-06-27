// Rewriting sum

// Original version
def sumOld(f: Int => Int, a: Int, b: Int): Int = {
  if (a > b) 0
  else f(a) + sumOld(f, a + 1, b)
}

// New version returning a function type
def sum(f: Int => Int): (Int, Int) => Int = {
  def sumF(a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sumF(a + 1, b)
  }
  sumF
}

// Original version
def sumIntsOld(a: Int, b: Int) = sumOld(x => x, a, b)

// New version
def sumInts = sum(x => x)

sumIntsOld(3, 5)
sumInts(3, 5)

// We can also get rid of the middlemen
def cube(x: Int): Int = x * x * x

sum(cube)(3, 5)

// We can also use parameter lists to shorten
// sum definition

def sumPL(f: Int => Int)(a: Int, b: Int): Int = {
  if (a > b) 0
  else f(a) + sumPL(f)(a + 1, b)
}
