import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		LinkedList linkedlist1 = new LinkedList();
		LinkedList linkedlist1pair = new LinkedList();
		
		String sample1 = keyboard.nextLine();
		
		if(sample1.contains("\""))
			sample1 = sample1.replaceAll("\"", "");
		
		String word1 = sample1.substring(sample1.indexOf('|')+2);
		
		for (int i = 0; i < sample1.indexOf('|')-1; i++) {
			Node newNode = new Node();
			newNode.element = sample1.charAt(i);
			linkedlist1.insert(newNode);
		}
		
		for (int i = 0; i < word1.length(); i++) {
			Node newNode = new Node();
			newNode.element = word1.charAt(i);
			linkedlist1pair.insert(newNode);
		}
		
		System.out.println(linkedlist1.find(linkedlist1pair));
	}
}
