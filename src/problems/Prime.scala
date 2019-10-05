package problems

object Prime {
  def isPrime(n: Int): Boolean = n match {
    case 2 => true
    case _ => false
  }
}
