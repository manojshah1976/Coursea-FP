/**
  * Created by Manoj on 25/07/2016.
  */


object xy {
  def flatten(l: List[_]): List[Any] = l match {
    case Nil => Nil
    case (head: List[_]) :: tail => println("Head"+ head , "tail:"+ tail); flatten(head) ::: flatten(tail)
    case head :: tail => println("char level:"+ head); head :: flatten(tail)
  }
  def sum(xs:List[Int]):Int = xs match{
    case Nil=>0
    case head::tail=>head+sum(tail)
  }
}

xy.sum(List(3,5,4,2))

