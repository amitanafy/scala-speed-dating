def frequencyMap(s: String) =
  s.groupBy(c => c)
    .mapValues(_.length)

def frequencyMap2(str: String) =
  str
    .groupBy(_.toString)
    .map(p => (p._1, p._2.length))

def frequencyMap3(str: String) =
  str.groupBy(identity)
     .mapValues(_.length)



frequencyMap3("letters")