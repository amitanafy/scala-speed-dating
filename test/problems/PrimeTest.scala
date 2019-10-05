package problems
import org.scalatest.FlatSpec

class PrimeTest extends FlatSpec {

  "number 2" should "be a prime" in {
    assert(Prime.isPrime(2))
  }

  "number 3" should "not be a prime" in {
    assert(!Prime.isPrime(3))
  }



}
