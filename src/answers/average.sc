val l = Seq(3,2,4,6,5,7,8,0,2)

def average(seq: Seq[Int]) =
  seq.sum.toDouble/seq.length


def average2(seq: Seq[Int]) =
  seq.foldLeft(0)(_+_).toDouble/seq.length

def average3(seq: Seq[Int]) =
  seq.foldLeft(0.0)(_+_)/seq.length

average3(l)
