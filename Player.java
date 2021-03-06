class Player{
  private int piecesLeft=16;
  private int playerColor;
  private Piece[] pieces=new Piece[piecesLeft];

  public Player(int color){
    playerColor=color;
    if(playerColor==0){
      for(int i=0;i<8;i++){
        //Type,x position, y position
        pieces[i]=new Piece(2,i+1,2);
      }
      pieces[8]=new Piece(0,5,1);
      pieces[9]=new Piece(1,4,1);
      pieces[10]=new Piece(3,1,1);
      pieces[11]=new Piece(3,8,1);
      pieces[12]=new Piece(4,2,1);
      pieces[13]=new Piece(4,7,1);
      pieces[14]=new Piece(5,3,1);
      pieces[15]=new Piece(5,6,1);
    }else{
      for(int i=0;i<8;i++){
        pieces[i]=new Piece(6,i+1,7);
      }
      pieces[8]=new Piece(0,5,8);
      pieces[9]=new Piece(1,4,8);
      pieces[10]=new Piece(3,1,8);
      pieces[11]=new Piece(3,8,8);
      pieces[12]=new Piece(4,2,8);
      pieces[13]=new Piece(4,7,8);
      pieces[14]=new Piece(5,3,8);
      pieces[15]=new Piece(5,6,8);
    }

  }

  public Piece[] getPieces(){
    return pieces;
  }
  public void move(int p,int x,int y){
    pieces[p].moving(x,y);
    return;
  }
  public void take(int p){
    pieces[p].taking();
    return;
  }
  public void place(int p,int x,int y){
    pieces[p].placing(x,y);
    return;
  }

}
