//------------------------------
//Zachary Bennitt
//Programming Fundamentals
//Summer 2020
//PROGRAMMING ASSIGNMENT 4 - SET
//------------------------------

public class Set {
	
	LinkedNode head;
	int count;
	
	//Constructor
	public Set() {
		head = null;
		count = 0;
	}
	
	// Method for "add" command
	void add(int x) {
		
		if (!exists(x)) {
		LinkedNode node = new LinkedNode(x);
		node.next = head;
		head = node;
		
		}
	}
	
	// Method for "del" command
	void del(int x) {
		
		LinkedNode cNode = head;
		LinkedNode pNode = null;
		
		if (cNode == null) {
			return;
		}
		
		if (cNode.x == x) {
			head = cNode.next;
			return;
		}
		
		while (cNode.next != null && cNode.x != x) {
			pNode = cNode;
			cNode = pNode.next;
		}
		
		if (cNode.x == x) {
			pNode.next = cNode.next;
		}
		
	}
	
	// Method for "exists" command
	boolean exists(int x) {
		
		LinkedNode link = head;
		while (link != null) {
			if (link.x == x) {
				return true;
			}
			link = link.next;
		}
		return false;
	}
	
	// Method to return a string
	public String toString() {
		
		String string = "";
		LinkedNode link = head;
		while (link != null) {
			string += link.x + " ";
			link = link.next;
		}
		return string;
	}
	
}
