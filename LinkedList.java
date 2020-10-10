public class LinkedList {
	
	private Node head;
	private long size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public Node getHead() {
		return head;
	}
	
	public long getSize() {
		return size;
	}
	
	public void insert(Node node) {
		Node currNode = head;
		
		if(head == null) {
			head = node;
			node.next = null;
			size++;
		}
		else {
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			node.next = null;
			currNode.next = node;
			size++;
		}
	}
	
	public String find(LinkedList list) {
		boolean flipflop = false;
		Node prevNode = null;
		Node currNode = head;
		Node nextNode = head.next;
		Node currNodeOfWord = list.getHead();
		
		String first = "", last = "";
		
		for(int i=0; i<size; i++) {
			if(currNode.element == currNodeOfWord.element) {
				
				if(i==0)
					first = "$";
				else if(!flipflop)
					first = "" + prevNode.element;
				
				flipflop = true;
				
				if(currNodeOfWord.next != null)
					currNodeOfWord = currNodeOfWord.next;
				else {
					last = "" + nextNode.element;
					break;
				}	
				
				if(nextNode.next != null) {
					prevNode = currNode;
					currNode = nextNode;
					nextNode = nextNode.next;
				}
				else {
					if(currNodeOfWord.element == nextNode.element) {
						last = "$";
						break;
					}
					return "String bulunamadi.";
				}
			}
			else {
				if(flipflop) {
					currNodeOfWord = list.getHead();
					first = "";
				}
				
				flipflop = false;
				
				if(nextNode.next != null) {
					prevNode = currNode;
					currNode = nextNode;
					nextNode = nextNode.next;
				}
				else {
					return "String bulunamadi.";
				}
			}
		}
		return first + "-" + last;
	}
}