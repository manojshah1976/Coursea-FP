/* Playing with scala function calls */

//recursive function that will loop util a val =100
//will take another function as an argument
/*
def play (x:Int, y:(Int,Int) => Boolean):Int={
  if (x<=10) {
    println("hello:"+x +"is even:"+y(x,3))
    play(x+1,y)
  } //call back the funciton with same anon function
  else 0; //need to return the final int
}
//my annon functiont that takes and int and retruns true if even otherwise false
def isEven(x: Int,y:Int):Boolean={
  println("x is "+x)
  println("y is "+y)

  //if the modulus is 0 even number
  if (x % 2==0)  true
  else false
}


play(4,(z,y)=>isEven(z,y))
*/

//Some set play stuff

import funsets.FunSets

val s1=FunSets.singletonSet(5)
val s2=FunSets.singletonSet(2)
val s3=FunSets.singletonSet(3)
val u1=FunSets.union(s1,s3)
val u2=FunSets.range1to100Set()

def from0to50(x:Int):Boolean=
{
  if (x >= 0 && x <= 50) true
  else false
}
def x2(x:Int):Int=
{
  x*2
}
val t1=FunSets.map(Set(1,2,3,5),(x)=>x2(x))
FunSets.toString(t1)



o

//play(1,{()=>{println("do this and return true")
//  true }})

