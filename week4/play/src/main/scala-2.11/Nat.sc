
object nqueens {

  def queens(n:Int): Set [List[Int]]={
    def placeQueens(k:Int): Set[List[Int]]=
      if (k==0) Set(List())
    else
        for {
          queens <- placeQueens(k - 1)
            col <- 0 until n

          if isSafe(col, queens)
        } yield col :: queens
      placeQueens(n)
    }

  def isSafe(col:Int,queens:List[Int]):Boolean=
  {
    val row= queens.length

    true
  }


}

//nqueens.queens(3)
val rows=3
val q=(3-1 to 0 by -1) zip List(1,2,3)
