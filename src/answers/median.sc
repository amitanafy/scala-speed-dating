val l = Seq(1,3,6,5,4)

def median(s: Seq[Int]) =
  s.sorted.apply(s.length/2)

def median2(s: Seq[Int]) =
  s.sortWith(_ < _).drop(s.length/2).head

def median3(s: Seq[Int]) =
  s.sortWith(_ < _).take(s.length/2 + 1).last

median3(l)