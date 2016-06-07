package GraphPackage;

import java.util.ArrayList;
import java.util.List;

public class Node {

	public  Object value;
	
	public List<Node> nextNode  = new ArrayList<Node>(); 
	
	public boolean isVisited =false;
	
	public Node(Object value)
	{
		this.value =  value;
	}
}
