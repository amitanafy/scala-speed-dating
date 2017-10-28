def prime(num: Int): Boolean =
  (2 to math.sqrt(num).ceil.toInt)
    .forall(num % _ != 0)

def isPrime(n: Int) =
  Range(2, n-1)
    .filter(i => n % i == 0).length == 0

def isPrime2(n: Int) =
  !Range(2, n - 1).exists(i => n % i == 0)

def isPrime3(n: Int) =
  Range(2, n - 1).forall(i => n % i != 0)

isPrime3(1483)