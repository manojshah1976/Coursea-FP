
//This is a worksheet to help remind me how recursive functions are built up


//Basic Sum Ints formula
def sumInts(a:Int, b:Int):Int=
if(a>b)0 else a+ sumInts(a+1,b)

sumInts(3,4)


