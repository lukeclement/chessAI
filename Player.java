class Player{
  private int piecesLeft=16;
  private int playerColor;
  private Piece[] pieces=new Piece[piecesLeft];

  public Player(int color){
    playerColor=color;
    if(playerColor==0){
      for(int i=0;i<8;i++){
        Piece[i]=new Piece(2,i+1,2);
      }
      Piece[8]=new Piece(0,5,1);
      Piece[9]=new Piece(1,4,1);
      Piece[10]=new Piece(3,1,1);
      Piece[11]=new Piece(3,8,1);
      Piece[12]=new Piece(4,2,1);
      Piece[13]=new Piece(4,7,1);
      Piece[14]=new Piece(5,3,1);
      Piece[15]=new Piece(5,6,1);
    }else{
      for(int i=0;i<8;i++){
        Piece[i]=new Piece(2,i+1,7);
      }
      Piece[8]=new Piece(0,5,8);
      Piece[9]=new Piece(1,4,8);
      Piece[10]=new Piece(3,1,8);
      Piece[11]=new Piece(3,8,8);
      Piece[12]=new Piece(4,2,8);
      Piece[13]=new Piece(4,7,8);
      Piece[14]=new Piece(5,3,8);
      Piece[15]=new Piece(5,6,8);
    }
  }

  public int[] getPieces(){
    return pieces;
  }
  public void move(int p,int x,int y){
    pieces[p].moving(x,y);
  }
  public void take(int p){
    pieces[p].taking();
  }
  public void place(int p,int x,int y){
    pieces[p].placing(x,y);
  }

}
