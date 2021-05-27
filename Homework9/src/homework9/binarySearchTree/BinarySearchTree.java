package homework9.binarySearchTree;

public class BinarySearchTree<Key extends Comparable<Key>, Value>  {
	
	private Node<Key, Value> root;
	private int count;
	
	public Value get(Key key) {
		Node<Key, Value> current = root;
		count = 0;
		
		while(current != null) {
			int cmp = key.compareTo(current.key);
			if (cmp < 0) {
				current = current.left;
				count++;
			} else if (cmp > 0) {
				current = current.right;
				count++;
			} else { 
				count++;
				return current.value;
			}
		}
		return null;
	}
	
	public void put(Key key, Value value) {
		root = put(root, key, value);
	}
	
	private Node<Key, Value> put(Node<Key, Value> x, Key key, Value value) {
		if(x == null) {
			return new Node<Key, Value>(key, value);
		}
		
		int cmp = key.compareTo(x.key);
		if(cmp < 0) {
			x.left = put(x.left, key, value);
		} else if(cmp > 0) {
			x.right = put(x.right, key, value);
		} else {
			x.value = x.value;
		}
		
		x.size = 1 + size(x.left) + size(x.right);
		return x;
	}
	
	public int size() {
		return size(root);
	}
	
	private int size(Node<Key, Value> x) {
		if(x == null) {
			return 0;
		}
		return x.size;
	}
	
	public int getCount() {
		return this.count;
	}
}
