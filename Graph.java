package GraphPackage;

import java.util.Currency;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	public static void main(String[] args) {

		Node firstNode = new Node('r');
		Node secondNode = new Node('q');
		Node thirdNode = new Node('m');
		Node fourthNode = new Node('e');
		Node fiveNode = new Node('h');
		Node sixthNode = new Node('l');
		Node seventhNode = new Node('b');
		Node eightNode = new Node('z');
		Node nineNode = new Node('n');

		firstNode.nextNode.add(secondNode);

		secondNode.nextNode.add(thirdNode);
		secondNode.nextNode.add(firstNode);

		thirdNode.nextNode.add(fourthNode);
		thirdNode.nextNode.add(secondNode);

		fourthNode.nextNode.add(fiveNode);
		fourthNode.nextNode.add(thirdNode);
		fourthNode.nextNode.add(eightNode);

		eightNode.nextNode.add(fourthNode);
		eightNode.nextNode.add(seventhNode);
		eightNode.nextNode.add(nineNode);

		fiveNode.nextNode.add(sixthNode);
		fiveNode.nextNode.add(fourthNode);

		sixthNode.nextNode.add(fiveNode);
		sixthNode.nextNode.add(seventhNode);

		seventhNode.nextNode.add(eightNode);
		seventhNode.nextNode.add(sixthNode);

		// ApplyBFS(firstNode);

		ApplyDFS(firstNode);
		//ApplyDFS_nonrecursive(firstNode);

	}

	private static void ApplyDFS(Node currentNode) {
		// TODO Auto-generated method stub
		// Node currentNode = null;

		System.out.print(currentNode.value + " ");

		currentNode.isVisited = true;

		for (Node node : currentNode.nextNode) {
			if (node.isVisited == false) {
				node.isVisited = true;
				ApplyDFS(node);
			}
		}

	}



	private static void ApplyBFS(Node firstNode) {
		// TODO Auto-generated method stub

		LinkedList<Node> queue = new LinkedList<Node>();

		// System.out.println(firstNode.value);
		queue.add(firstNode);

		firstNode.isVisited = true;
		Node currentNode = null;

		while (!queue.isEmpty()) {
			currentNode = queue.remove();
			System.out.println(currentNode.value);
			for (Node node : currentNode.nextNode) {
				if (node.isVisited == false) {
					node.isVisited = true;
					queue.add(node);
				}
			}
		}

	}

}
