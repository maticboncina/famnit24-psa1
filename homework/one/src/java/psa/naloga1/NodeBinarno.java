package psa.naloga1;

public class NodeBinarno {
	private static int counter;
	private int key;


	
	public int compare(NodeBinarno node) {
		counter++;
		return node.key - this.key;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void resetCounter() {
		counter=0;
	}
}
