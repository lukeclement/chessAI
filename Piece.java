import java.util.*;

class Piece{
  private int type;
  private int x;
  private int y;
  private boolean alive=true;

  public Piece(int t,int x, int y){
    type=t;
    this.x=x;
    this.y=y;
    main.board[x][y]=type;
  }
  //Possible moves
  public List<Integer[]> moves(){
    List<Integer[]> m=new ArrayList<>();
    Movechecker mo=new Movechecker();
    switch(type){
      case 0: for(int i=-1;i<=1;i++){
        for(int j=-1;j<=1;j++){
          if((Math.abs(i)+Math.abs(j)==0)&&x+i>0&&x+i<8&&y+j>0&&y+j<8){
            if(main.board[x+i][y+j]==-1){
              m.add(new Integer[]{x+i,y+j});
            }
          }
        }
      }break;
      case 1: boolean stillGoingX=true;
      boolean stillGoingY=true;
      boolean stillGoingLeft=true;
      boolean stillGoingRight=true;
      for(int i=-7;i<=7;i++){
        for(int j=-7;j<=7;j++){
          if((Math.abs(i))+(Math.abs(j))==0&&x+i==0&&x+i>0&&x+i<8&&y+j>0&&y+j<8&&(Math.abs(j)==Math.abs(i)||i==0||j==0)&&stillGoingY&&stillGoingX){
            if(main.board[x+i][y+j]==-1){
              if(j==0&&x+i-1>0&&x+i-1<8&&i>0){
                if(main.board[x+i-1][y+j]==-1||main.board[x+i-1][y+j]==type){
                  m.add(new Integer[]{x+i,y+j});
                }
              }
              else if(i==0&&y+j-1>0&&y+j-1<8&&j>0){
                if(main.board[x+i][y+j-1]==-1||main.board[x+i][y+j-1]==type){
                  m.add(new Integer[]{x+i,y+j});
                }
              }
              else if(j==0&&x+i+1>0&&x+i+1<8&&i<0){
                if(main.board[x+i+1][y+j]==-1||main.board[x+i+1][y+j]==type){
                  m.add(new Integer[]{x+i,y+j});
                }
              }
              else if(i==0&&y+j+1>0&&y+j+1<8&&j<0){
                if(main.board[x][y+j+1]==-1||main.board[x+i][y+j+1]==type){
                  m.add(new Integer[]{x+i,y+j});
                }
              }
              else if(j<i){

              }
              else if(i==j){

              }
              else{

              }


            }
          }
        }
      }

      break;
      case 2: break;
      case 3: break;
      case 4: break;
      case 5: break;
      case 6: break;
    }
    return m;
  }
  //Change in y+x
  public void moving(int xc,int yc){
    main.board[x][y]=-1;
    x=x+xc;
    y=y+yc;
    main.board[x][y]=type;
    return;
  }
  public void taking(){
    alive=false;
    main.board[x][y]=-1;
    return;
  }
  public void placing(int nx,int ny){
    alive=true;
    main.board[x][y]=-1;
    x=nx;
    y=ny;
    main.board[x][y]=type;;
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
  public boolean isAlive(){
    return alive;
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
