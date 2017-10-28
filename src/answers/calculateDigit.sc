//def calculateDigit(num: Int): Int =
//  if (num<10) num
//else calculateDigit(num.toString.map(_.asDigit))

def calculateDigit(num: Int): Int = {
  if (num <10)
    num
  else
    calculateDigit(num.toString.map(_.asDigit).sum)
}

def calculateDigit2(num: Int): Int = {
  var answer = num
  while (answer > 9)
   answer = answer.toString.map(_.asDigit).sum
  answer
}

def calculateDigit3(num: Int): Int = {
  if (num/10 ==0) num
  else
    calculateDigit3(
      num
        .toString
        .foldLeft(0)((f,s) => f + s.asDigit))

}

def calculateDigit4(num: Int): Int = {
  if (num <10)
    num
  else
    calculateDigit4(num.toString.map(_.toString.toInt).sum)
}


calculateDigit3(338)

