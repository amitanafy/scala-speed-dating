

val l = Seq("iphone5", "iphone6")
def f(x: String) = x + "s"

def map[T](seq: Seq[String], fun: String => T) =
  seq.foldLeft(Seq(): Seq[T])(
    (s, v) => s :+ fun(v))

def map2[T](seq: Seq[String], fun: String => T) =
  seq.map(fun)

def map3[T](seq: Seq[String], fun: String => T) =
  for {
    x <- seq
  } yield fun(x)

map3(l,f)