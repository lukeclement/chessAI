class Piece{
  private int type;
  private int x;
  private int y;

  public Piece(int t,int x, int y){
    type=t;
    this.x=x;
    this.y=y;
  }

  public int[] possibleX(){
    switch(type){
      case 0:
      int[] moves=new int[8];
      for(int i=0;i<moves.length;i++){
        if(i==3){
          int[i]=x;
        }else if(i==4){
          int[i]=x;
        }else if(i-3<0){
          int[i]=x-1;
        }else{
          int[i]=x+1
        }
      }
      break;
      case 1:
      int[]
      break;
      case 2:
      break;
      case 3:
      break;
      case 4:
      break;
      case 5:
      break;
      case 6:
      break;

    }
  }public int[] possibleY(){
    switch(type){
      case 0:
      int[] moves=new int[8];
      for(int i=0;i<moves.length;i++){
        if(i>4){
          switch(i%3){
            case 0:int[i]=y+1;
            break;
            case 1:int[i]=y;
            break;
            case 2:int[i]=y-1;
            break;
          }
        }else{
          switch(i%3){
            case 0:int[i]=y;
            break;
            case 1:int[i]=y-1;
            break;
            case 2:int[i]=y+1;
            break;
          }
        }

      }
      break;
      case 1:
      break;
      case 2:
      break;
      case 3:
      break;
      case 4:
      break;
      case 5:
      break;
      case 6:
      break;

    }
  }

}
