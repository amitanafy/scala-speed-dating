val l = Seq(1,2,3)

def smaller(seq:Seq[Int],delim:Int) =
  seq.filter(_<delim)

def smaller2(xs: Seq[Int], number: Int) : Seq[Int] =
  xs.collect {   case x: Int if x < number ⇒ x }

def smaller3 (a:Seq[Int], number: Int) =
  a.flatMap(x => if (x < number) Option(x) else None)


smaller(l,2)
