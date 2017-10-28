def reverseEachWord(s: String) =
  s.split(' ').map(_.reverse).mkString(" ")

def reverseEachWord2(s: String) =
  s.reverse.split(' ').reverse.mkString(" ")


def reverseEachWord3(s: String) =
  s.split(' ').foldLeft("")((ss, n) => ss + n.reverse + " ").init

reverseEachWord2("reverse me") == reverseEachWord3("reverse me")
