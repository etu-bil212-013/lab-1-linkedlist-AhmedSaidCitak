import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		LinkedList linkedlist1 = new LinkedList();
		LinkedList linkedlist1pair = new LinkedList();
		
		String sample1 = keyboard.nextLine();
		
		if(sample1.contains("\""))
			sample1 = sample1.replaceAll("\"", "");
		
		String newSample1 = sample1.replaceAll(" ", "");
		
		String word1 = newSample1.substring(newSample1.indexOf('|')+1);
		
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
		
		System.out.println(linkedlist1.find(linkedlist1pair));
	}
}
