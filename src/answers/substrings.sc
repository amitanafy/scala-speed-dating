def substrings(s: String): Set[String] =
  (for { start <- 0 to s.length
         end <- start+1 to s.length
  } yield s.substring(start, end))
    .toSet

def substrings2(s: String): Set[String] =
  s.inits.flatMap(_.tails.toList.init).toSet

def substrings3(s: String): Set[String] = {
  var answer = Set.empty[String]
  for (a <- 0 to s.length) {
    for (b <- a + 1 to s.length) {
      answer = answer + s.substring(a, b)
    }
  }
  answer
}

substrings3("wix")