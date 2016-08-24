def makeUpper(xs: List[String]) = xs map {
  _.toUpperCase
}

def makeWhatEverYouLike(xs: List[String], sideEffect: String ⇒ String) = {
  xs map sideEffect
}

makeUpper(List("abc", "xyz", "123"))
