

def flatten(xs: List[Any]): List[Any] = {

  case x =>print(x)
  case (head: List[_]) :: tail => flatten(List(xs.head)) ::: flatten(xs.tail)
  case head :: tail => head :: flatten(xs.tail)

}

flatten(List(List(1, 1), 2, List(3, List(5, 8))))