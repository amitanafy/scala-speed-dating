val l = Seq(("pickle","rick"), ("morty","jr"))

def sumLength(tuples: Seq[(String, String)]) =
  tuples
    .map(p => p._1.length + p._2.length)
    .sum

def sumLength2(lis: Seq[(String, String)]) =
  lis.map(_.toString().length - 3).sum

def sumLength3(lis: Seq[(String, String)]) =
  lis.foldLeft(0) {
    case (acc, (left, right)) =>
      acc + left.length + right.length
  }

def f(s:Seq[(String,String)]) =
  s.flatMap(_.productIterator)
    .collect {case x:String => x.length}
    .sum

def sumLength4(lis: Seq[(String, String)]) =
  lis.map(_.productIterator.map(_.toString)).sum

sumLength4(l)


