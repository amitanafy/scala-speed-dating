

val l = Seq(1,2,3,4)

def numberOfArithmeticSlices(list: Seq[Int]): Seq[Seq[Int]] = {
  for {
    num <- 3 to list.length
    testGroup <- list.sliding(num)
    if testGroup.sliding(2)
      .forall(pair =>
        pair.head - pair(1) == testGroup.head- testGroup(1))
  } yield testGroup}

def numberOfArithmeticSlices2(list: Seq[Int]): Seq[Seq[Int]]  = {
  for {
    size <- 3 to list.length
    b <- list.sliding(size)
  } yield b
}

numberOfArithmeticSlices2(l)
