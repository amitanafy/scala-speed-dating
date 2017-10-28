val l = Seq(0,2,4,5,0,77)

def moveZeros(list: Seq[Int]) =
  list.filter(_!=0) ++ Seq.fill(list.count(_==0))(0)


def zeroEnd(l:Seq[Int]) = l.filterNot(_==0) ++ l.filter(_==0)

def moveZeros2(in: Seq[Int]): Seq[Int] = {
  val (notZeros, zeros) = in.partition(_ != 0)
  notZeros ++ zeros
}

def moveZeros3(x: Seq[Int]): Seq[Int] = {
  x.partition(_ != 0) match { case (a, b) => a ++ b }
}

def endZeros(l: Seq[Int]): List[Int] =
  l match {
    case Nil ⇒ Nil
    case head :: lx ⇒ if (head == 0) {
      endZeros(lx) ++ List(0)
    } else {
      head :: endZeros(lx)
    }
  }


endZeros(l)