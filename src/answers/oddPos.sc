val l = Seq(2,5,3,4,6,7,9)

def oddPos(seq: Seq[Int]) =
  seq
    .zipWithIndex
    .collect {
      case(element, index)
        if index % 2 == 1 => element
    }


def oddPos2(l:Seq[Int]) = {
  l.zipWithIndex
    .filter(_._2 % 2 != 0)
    .map(_._1)
}

def oddPosition(seq: Seq[Int]) =
  (1 until seq.size)
    .filter(n=> n % 2 != 0)
    .map(seq(_))

def oddPos3(list : Seq[Int]): Seq[Int] = {
  for {i <- list.indices if i % 2 == 1}
    yield list(i)
}

def odd2(seq: Seq[Int]): Seq[Int] = {
  //if even continue to the next - odd
  def even(seq: Seq[Int]): Seq[Int] = if(seq.nonEmpty) odd(seq.tail) else Nil
  //if odd take head and continue on to even
  def odd(seq:Seq[Int]): Seq[Int] = if(seq.nonEmpty) seq.head +: even(seq.tail) else Nil
  //zero is even
  even(seq)
}

odd2(l)
