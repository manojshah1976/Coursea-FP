
  def play(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */

  def pascal(c: Int, r: Int): Int = {
    //break when c is the same value as r or c has dropped to 0
    if (c==0|c==r)
      {//Return a 1 if we are on the edges of the triangle
        1
      }
    else
      {
        //Recursive call
        pascal(r,c-1)
      }
  }


  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (acc<f) ???
      else loop(???, ???)
    }
    loop(???, ???)
  }
