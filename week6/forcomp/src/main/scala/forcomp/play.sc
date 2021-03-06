import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Occurs
import forcomp.Anagrams._
import forcomp._
import org.scalatest.enablers.Length

wordAnagrams("boss").toSet

val allEle=List(('a',2),('b',2),('c',2))
val a1=List(('a','1'))
val unique=allEle.foldLeft(List(allEle.head._1))((b,a)=>{
  if (!b.contains(a._1))
  b:::List(a._1)
  else b})




def combi(occurrences: Occurrences):List[Occurrences]= {

  if (occurrences.isEmpty)
    List(List())
  else
    (for {
      i <- 0 to occurrences.head._2
      oCombi <- combi(occurrences.tail)
    }
      yield
        if (i==0) oCombi
        else
        (occurrences.head._1,i)::oCombi
      ).toList
}

combi(allEle).foreach(x=>println(x))