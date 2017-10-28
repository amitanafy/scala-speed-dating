def threeFive(num: Int) =
  (1 until num)
  .filter(x=> (x%3==0) || (x%5==0))
  .sum

def sumAndDivide(num: Int): Int =
  Range(0,num)
    .filter(x => x % 3 == 0 || x % 5 == 0 )
    .sum

sumAndDivide(10)
