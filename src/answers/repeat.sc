val l = List(1,2,3)

def repeat(seq:Seq[Int], repeater:Int) =
  seq.flatMap(Seq.fill(repeater)(_))

def repeatedBy(lst: Seq[Int], n: Int): Seq[Int] =
  for(x <- lst;
      y <- 1 to n) yield x
def repeatedBy3(lst: Seq[Int], n: Int): Seq[Int] =
  lst.flatMap(x => List.tabulate(n)(_ => x))

repeat(l,2)