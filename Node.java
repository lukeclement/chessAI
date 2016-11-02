import java.util.*;

public class Node{
  private int[] value;
  private ArrayList<Node> edges;

  public Node(int[] setValue){
    value=setValue;
    edges=new ArrayList<Node>();
  }

  public void addEdge(Node target){
    edges.add(target);
  }

  public ArrayList<Node> getEdges(){
    return new ArrayList<Node>(edges);
  }

  public int[] getValue(){
    return value;
  }

}
