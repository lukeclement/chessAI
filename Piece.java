class Piece{
  private int type;
  private int x;
  private int y;
  private boolean alive=true;

  public Piece(int t,int x, int y){
    type=t;
    this.x=x;
    this.y=y;
  }
  //Change in y+x
  public void moving(int xc,int yc){
    x=x+xc;
    y=y+yc;
    return;
  }
  public void taking(){
    alive=false;
    return;
  }
  public void placing(int nx,int ny){
    alive=true;
    x=nx;
    y=ny;
    return;
  }
  //Getters
  public int getY(){
    return y;
  }
  public int getX(){
    return x;
  }
  public int getType(){
    return type;
  }
  //Setters
  public void setY(int ny){
    y=ny;
    return;
  }
  public void setX(int nx){
    x=nx;
    return;
  }
  public void setType(int nt){
    type=nt;
    return;
  }
}
