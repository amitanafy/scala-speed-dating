case class Mappy(a: Int)
case class Classy(b: Int)
case class Sassy(Sassy: String)

val l = Seq(Classy(2), Mappy(1), Sassy("Lassie"))

def mappy(seq: Seq[AnyRef]) =
  seq.collect{
    case _: Mappy => "mappy"
    case v => v
  }

def mappy2(m: Seq[AnyRef]) =
  m.map {
    case Mappy(_) => "mappy"
    case x => x
  }

def mappy3(seq: Seq[AnyRef]) =
  seq.map(i => if (i.isInstanceOf[Mappy]) {"mappy"} else {i})


mappy3(l)

