import java.util.*;

public class main{
  public static int[][] board=new int[8][8];
  public static void main(String[] args){
    for(int i=0;i<8;i++){
      for(int j=0;j<8;j++){
        board[i][j]=-1;
      }
    }
    Scanner scan=new Scanner(System.in);
    Player playerOne = new Player(0);
    Player playerTwo = new Player(1);
    //8 is King
    while((playerOne.getPieces()[8].isAlive())&&(playerTwo.getPieces()[8].isAlive())){

    }
  }
}
