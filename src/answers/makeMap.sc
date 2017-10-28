val l = Seq("am","b","c", "c")

def makeMap(seq: Seq[String]) =
  seq.map(v => v -> v).toMap

def makeMap2(seq: Seq[String]) =
  seq.zip(seq).toMap

def makeMap3(seq: Seq[String]) =
  seq.groupBy(x => x).mapValues(_.head)

def makeMap4(s: Seq[String]) =
  s.foldLeft(Map.empty[String, String]) {
    (acc, str) => acc + (str -> str)
}

makeMap4(l)
