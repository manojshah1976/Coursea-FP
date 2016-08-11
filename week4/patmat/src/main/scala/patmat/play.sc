import patmat.Huffman
import patmat.Huffman._

import scala.None




def times2(charList:List[(Char)]):List[(Char,Int)]=
{
  def distinctCharList(Lc:List[Char],Acc:List[(Char,Int)]):List[(Char,Int)]= {
    Lc match  {
      case x::y => //filter accumulator
                  if (Acc.exists(char=>char._1==x)) {
                    //map the element and increment
                    val updatedList = Acc.map(e => if (e._1 == x) (e._1, e._2 + 1) else e)
                    distinctCharList(y, updatedList)
                  }
                    else //add it to accumulator with a 1
                    distinctCharList(y,Acc:::List((x,1)))
      case Nil=>Acc
    }
  }
  distinctCharList(charList,Nil)

}
times2(List('a','b','a','f','c','d'))

makeOrderedLeafList(List(('a',3),('b',1),('c',2)))


