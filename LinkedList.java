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
		Node prevNode = null;										// Aranacak kelimenin bulunduğu linked list üzerinde gezecek olan gezici node'lar 
		Node currNode = head;
		Node nextNode = head.next;
		Node currNodeOfWord = list.getHead();						// Aranan kelimenin bulunduğu linked list üzerinde gezecek olan gezici node
		
		String first = "", last = "";								// Return edilemsi beklenen karakterler
		
		for (int i = 0; i < size; i++) {
			if(currNode.element == currNodeOfWord.element) {
				if(i==0)											// aranan string; kelimenin başında ise
					first = "$";
				if(currNodeOfWord == list.getHead() && i!=0)		// aranan string; kelimenin başında değilse
					first = "" + prevNode.element;
				if(currNodeOfWord.next != null)						// aranan stringin bulunduğu char linked listinde son node'a gelindiyse currNode güncellenmeyecek
					currNodeOfWord = currNodeOfWord.next;
				currNode = nextNode;
				if(nextNode.next != null) {							
					nextNode = nextNode.next;
				}
				else {												// aranan string; kelimenin sonunda ise
					last = "$";
				}
				
			}
			else if (nextNode.next != null){						// aranan string; kelimenin ortasında ise ve aranacak kelime bittiyse last değişkeninin değeri belirlenir ve döngüden çıkılır
				if(currNodeOfWord.next == null) {
					last = "" + currNode.next.element;
					break;
				}
				else {
					prevNode = currNode;
					currNode = nextNode;
					nextNode = nextNode.next;
				}
			}
			else {													// Stringin bulunamadığı durum
				return "String bulunamadi";
			}
		}
		return first + "-" + last;
	}
}