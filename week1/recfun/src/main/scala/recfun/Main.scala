package recfun

object Main {
  def main(args: Array[String]) {
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
    if (c>r) throw new IllegalArgumentException("Column must be greated then row")
    if (c==0|c==r)
    {//Return a 1 if we are on the edges of the triangle
      1
    }
    else
    {
      //Recursive call bases on value in prev row and col and prev row same columns
      pascal(c-1,r-1)+pascal(c,r-1)
    }
  }

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
    //increment at least one char to the list at the end
    //avoids that silly situation when the bracket is the last char
    if (chars.isEmpty) {
      //return true is there are no chars in the list
      true
    }
    else {
      //Increment the list by one char to avoid some silly logic issue
      val myList=chars:+' '
      bracket(myList.head, myList.tail,0)
    }
  }
    def bracket(headChar: Char,tailChar:List[Char],pair:Integer):Boolean =
    {
      //Base condition for exit will be no tail chars in the list
      if ( tailChar.nonEmpty)
      //exit value would be the evaluation
      {//Do we have a bracket
        if (headChar=='(' || headChar ==')')
          {
            //println(headChar+ "pair:"+pair)
            if (pair<0)
              {//exit the condition as bracket balance is incorrect
                 false}
            if (headChar=='(')
              {
                bracket(tailChar.head, tailChar.tail,pair+1)
              }
            else
              {//we have a )
                bracket(tailChar.head, tailChar.tail,pair-1)
              }
          }
        else
        //move on to the next character
        {
          bracket(tailChar.head, tailChar.tail,pair)
        }
      }
      else
      {
        //Based on the value of pair return true or false
        if (pair==0)
          true
        else
          false
      }
    }

  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {

    if (coins.isEmpty) 0
    else if (money - coins.head == 0) 1 //exact match
    else if (money - coins.head < 0) 0  //too much change return 0
    //repeat the loop
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)

  }
  }

