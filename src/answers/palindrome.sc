def palindrome(st: String) =
  st.zip(st.reverse)
    .take(st.length/2)
    .forall { case (f, s) => f == s }

def palindrome2(name: String) =
  name.reverse == name

def isPalindrome(input: String): Boolean =
  input.take(input.length / 2) == input.takeRight(input.length / 2).reverse

isPalindrome("hannah")