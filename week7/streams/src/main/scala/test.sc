import scala.collection.immutable.HashMap.HashMap1

// play with recursion using a list

val myList=List(1,3,5,3,5)

println (s" here we go this will work $x")

// insert element after first occurrence of a given value in a list

def listInsert(lst:List[Int],element:Option[Int],after:Int):List[Any]=
lst match
  {
  case Nil=>Nil
  case h::t if h==after=>h::element.getOrElse(0)::t
  case h::t =>h::listInsert(t,element,after)
}

val x=listInsert(myList,Option(7),3)
def toInt(in: String): Option[Int] = {
  try {
    Some(Integer.parseInt(in.trim))
  } catch {
    case e: NumberFormatException => None
  }
}
val y=x.flatMap(x=>toInt(x.toString)).sum

