

public class Node {
	
	public Node leftChild;
	public Node rightChild;
	private String name;
	private int key;
	
	public Node(String name, int key) {
		this.name = name;
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public String getName() {
		return name;
	}
	
	public String getValues() {
		return "The name is :" + name + " and the key is: " + key;
	}
}