val l = List(1,2,3)


def multi(list: List[Int], mul:Int) =
  list.map(_ * mul)

def multi2(seq: Seq[Int], mul: Int) =
  seq.collect {
    case n => n * mul
  }

multi(l,2)


