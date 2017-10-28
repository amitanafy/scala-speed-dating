val l = "((())())"

def validate(str: String): Boolean =
  validateCharSeq(str.toList, 0)

def validateCharSeq(str: Seq[Char], count: Int): Boolean =
  if (count < 0) false
  else
  str match {
    case Nil =>
      count == 0
    case head :: tail if head == '(' =>
      validateCharSeq(tail, count + 1)
    case head :: tail if head == ')' =>
      validateCharSeq(tail, count - 1)
    case _ :: tail =>
      validateCharSeq(tail, count)}

def validateCharSeq2(str: Seq[Char], count: Int): Boolean = {
  if (count < 0) false
  else if (str.isEmpty) count == 0
  else {
    val openCount = str.takeWhile(_=='(').length
    val cur = str.dropWhile(_=='(')
    val closeCount = cur.takeWhile(_==')').length
    validateCharSeq2(cur.dropWhile(_==')'), count +openCount-closeCount)
  }
}

validate(l)