// High order functions. Functions that
// take other functions as parameters
// or return other functions

// Example sum (takes function as parameter)
def sum(f: Int => Int, a: Int, b: Int): Int = {
  if (a > b) 0
  else f(a) + sum(f, a + 1, b)
}

def id(a: Int): Int = a
def cube(a: Int): Int = a * a * a
sum(id, 3, 5)
sum(cube, 3, 5)

// Function types

// Int => Int is the type of a function that
// takes an Int as parameter and
// returns an Int

// Anonymous functions
// (x:Int, y:Int) => Int

// Sum example with anonymous functions
sum(x => x, 3, 5)
sum(x => x * x * x, 3, 5)

// Also we can define new functions

def sumInts(a: Int, b: Int): Int = sum(x => x, a, b)
def sumCubes(a: Int, b: Int): Int = sum(x => x * x * x, a, b)

sumInts(3, 5)
sumCubes(3, 5)

