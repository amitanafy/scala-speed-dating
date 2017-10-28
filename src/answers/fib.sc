def fib(num: Int) =
  (1 until num)
    .foldLeft((0, 1)) {
      case ((prev,cur), _) => (cur, prev + cur)
    }._2

def fibo(n:Int):Int = n match {
  case 1 | 2 => 1
  case x => fibo(x-1) + fibo(x-2)
}


val fibS: Stream[Int] =
  0 #:: 1 #:: fibS.zip(fibS.tail).map { n => n._1 + n._2 }

val fibs: Stream[Int] = 0 #:: fibs.scanLeft(1)(_ + _)

def fibo2(n:Int):Int = {
  var a:Int = 0
  var b:Int = 1
  for ( i <- 0 until n) {
    val temp = a+b
    a = b
    b = temp
  }
  a
}

fibs(4)