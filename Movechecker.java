import java.util.*;

class Movechecker{
  private Node[] moves=new Node[7];
  //0-King
  //1-Queen
  //2-WhitePawn
  //3-Rook
  //4-Knight
  //5-Bishop
  //6-BlackPawn
  public Movechecker(){
    for(int p=0;p<7;p++){
      moves[p]=new Node(new int[]{0,0});
    }

    Node up=new Node(new int[]{0,1});
    Node down=new Node(new int[]{0,-1});
    Node left=new Node(new int[]{-1,0});
    Node right=new Node(new int[]{1,0});
    Node upright=new Node(new int[]{1,1});
    Node upleft=new Node(new int[]{-1,1});
    Node downright=new Node(new int[]{1,-1});
    Node downleft=new Node(new int[]{-1,-1});

    /*Node[] ups=new Node[7];
    Node[] downs=new Node[7];
    Node[] lefts=new Node[7];
    Node[] rights=new Node[7];
    Node[] uprights=new Node[7];
    Node[] uplefts=new Node[7];
    Node[] downrights=new Node[7];
    Node[] downlefts=new Node[7];
    for(int i=1;i<=7;i++){
      ups=new Node(new int[]{0,i});
      downs=new Node(new int[]{0,-i});
      lefts=new Node(new int[]{-i,0});
      rights=new Node(new int[]{i,0});
      uprights=new Node(new int[]{i,i});
      uplefts=new Node(new int[]{-i,i});
      downrights=new Node(new int[]{i,-i});
      downlefts=new Node(new int[]{-i,-i});
    }

    moves[0].addEdge(up);
    moves[0].addEdge(down);
    moves[0].addEdge(left);
    moves[0].addEdge(right);
    moves[0].addEdge(upright);
    moves[0].addEdge(upleft);
    moves[0].addEdge(downright);
    moves[0].addEdge(downleft);

    moves[1].addEdge(ups);
    moves[1].addEdge(downs);
    moves[1].addEdge(lefts);
    moves[1].addEdge(rights);
    moves[1].addEdge(uprights);
    moves[1].addEdge(uplefts);
    moves[1].addEdge(downrights);
    moves[1].addEdge(downlefts);
    */
  }

  public ArrayList<Node> getMoves(int type){
    return moves[type].getEdges();
  }
}
