public class Main {

	public static void main(String[] args) {
		
		LinkedList linkedlist1 = new LinkedList();
		LinkedList linkedlist1pair = new LinkedList();
		LinkedList linkedlist2 = new LinkedList();
		LinkedList linkedlist2pair = new LinkedList();
		LinkedList linkedlist3 = new LinkedList();
		LinkedList linkedlist3pair = new LinkedList();
		
		String sample1 = "Veriyapilari | yapi";
		String sample2 = "Veriyapilari | Veri";
		String sample3 = "Veriyapilari | BIL";
		
		String newSample1 = sample1.replaceAll(" ", "");
		String newSample2 = sample2.replaceAll(" ", "");
		String newSample3 = sample3.replaceAll(" ", "");
		
		String word1 = newSample1.substring(newSample1.indexOf('|')+1);
		String word2 = newSample2.substring(newSample2.indexOf('|')+1);
		String word3 = newSample3.substring(newSample3.indexOf('|')+1);
		
		for (int i = 0; newSample1.charAt(i) != '|' ; i++) {
			Node newNode = new Node();
			newNode.element = newSample1.charAt(i);
			linkedlist1.insert(newNode);
		}
		for (int i = 0; i < word1.length(); i++) {
			Node newNode = new Node();
			newNode.element = word1.charAt(i);
			linkedlist1pair.insert(newNode);
		}
		
		
		for (int i = 0; newSample2.charAt(i) != '|' ; i++) {
			Node newNode = new Node();
			newNode.element = newSample2.charAt(i);
			linkedlist2.insert(newNode);
		}
		for (int i = 0; i < word2.length(); i++) {
			Node newNode = new Node();
			newNode.element = word2.charAt(i);
			linkedlist2pair.insert(newNode);
		}
		
		
		for (int i = 0; newSample3.charAt(i) != '|' ; i++) {
			Node newNode = new Node();
			newNode.element = newSample3.charAt(i);
			linkedlist3.insert(newNode);
		}
		for (int i = 0; i < word3.length(); i++) {
			Node newNode = new Node();
			newNode.element = word3.charAt(i);
			linkedlist3pair.insert(newNode);
		}
		
		System.out.println("Ornek girdi:\n" + sample1);
		System.out.println("Ornek cikti:\n" + linkedlist1.find(linkedlist1pair) + "\n");
		
		System.out.println("Ornek girdi:\n" + sample2);
		System.out.println("Ornek cikti:\n" + linkedlist2.find(linkedlist2pair) + "\n");
		
		System.out.println("Ornek girdi:\n" + sample3);
		System.out.println("Ornek cikti:\n" + linkedlist3.find(linkedlist3pair) + "\n");
		
	}
}
