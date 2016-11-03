public class Network{
  private int[] layers;
  private int firstLayer;
  private int lastLayer;
  private int[][][] jeans;
  private int fitness;

  public Network(int depth, int start, int end, int mainSize){
    layers=new int[depth];
    firstLayer=start;
    lastLayer=end;
    layers[0]=start;
    layers[depth-1]=end;
    jeans=new int[depth][mainSize][mainSize];
    //Setting up primary layer of genetics
    for(int x=0;x<start;x++){
      for(int y=0;y<mainSize;y++){
        jeans[0][x][y]=(int)Math.random()*100;
      }
    }
    //Setting up last layer of genetics
    for(int x=0;x<mainSize;x++){
      for(int y=0;y<end;y++){
        jeans[depth-1][x][y]=(int)Math.random()*100;
      }
    }
    //Setting all of the rest of the layers for genetics
    for(int i=1;i<depth-1;i++){
      layers[i]=mainSize;
      for(int x=0;x<mainSize;x++){
        for(int y=0;y<mainSize;y++){
          jeans[i][x][y]=(int)Math.random()*100;
        }
      }
    }
  }

  //getters and setters
  public int[][][] getGenes(){
    return jeans;
  }

  public void setGenes(int[][][] genetics){
      jeans=genetics;
      return;
  }
  //Taking start data and processing it through the brain
  //Size of startData must match start and size of result will be equal to end
  public int[] generate(int[] startData){
    int[] output=new int[lastLayer];
    int[] mainPart=new int[mainSize];
    for(int x=0;x<firstLayer;x++){
      for(int y=0;y<mainSize;y++){
        mainPart[y]=jeans[0][x][y]+startData[x];
      }
    }
    for(int z=1;z<depth-1;z++){
      for(int x=0;x<mainSize;x++){
        for(int y=0;y<mainSize;y++){
          mainPart[y]=jeans[z][x][y]+mainPart[x];
        }
      }
    }
    for(int x=0;x<mainSize;x++){
      for(int y=0;y<lastLayer;y++){
        output[y]=jeans[depth-1][x][y]+mainSize[x];
      }
    }
    return output;
  }
  //Getters and setters, part II: the settening
  public void setScore(int score){
    fitness=score;
    return;
  }

  public int getScore(){
    return fitness;
  }

}
