
//This is a worksheet to help remind me how recursive functions are built up


//Basic Sum Ints formula
def sumInts(a:Int, b:Int):Int=
if(a>b)0 else a+ sumInts(a+1,b)

sumInts(3,4)

//Some of cubes
def sumNum(x:Int):Int=x
def cube(x:Int): Int=x*x*x
def sumCubes(a:Int, b:Int):Int=
  if (a>b)0 else cube(a) +sumCubes(a+1,b)
  //notice the pattern... a now becomes cube(a)

def factorial(n:Int): Int= n match {
  case 0 =>1
  case _ =>{

     n * factorial(n-1)}

}
def sumFactorial(a:Int,b:Int):Int=
  if (a>b)0 else factorial(a)+ sumFactorial(a+1,b)

sumFactorial(1,5)
/// Go one step further rather then define each separate function
// we can now pass the function as a parameter

//the Type A=> B is the type of function that takes and argument of
//type A and returns a result of type B
def sum(f:Int=>Int,a: Int,b: Int):Int =
  if (a>b) 0
else f(a)+sum(f,a+1,b)

// so now we can do the following
sum(cube,2,3)
sum(factorial,2,4)
sum(sumNum,1,2)

// Above is great but we have to keep on creating smaller functions
//We can now introduce literals for functions hence annon functions
// An anon cube function (x:Int)=>x * x *x
//or several params (x:Int,y:Int)=>x+y function adds x & y


  def sumf(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }
  sumf( x=>x+x)(3,5)











