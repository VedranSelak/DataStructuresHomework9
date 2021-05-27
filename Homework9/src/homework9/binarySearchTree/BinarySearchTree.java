package homework9.binarySearchTree;

public class BinarySearchTree<Key extends Comparable<Key>, Value>  {
	
	private Node<Key, Value> root;
	
	public Value get(Key key) {
		Node<Key, Value> current = root;
		
		while(current != null) {
			int cmp = key.compareTo(current.key);
			if (cmp < 0) {
				current = current.left;
			} else if (cmp > 0) {
				current = current.right;
			} else {
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
			x.right = put(x.left, key, value);
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
	
	public Key findMin() {
		return findMin(root).key;
	}
	
	private Node<Key, Value> findMin(Node<Key, Value> x) {
		if(x.left == null) {
			return x;
		}
		return findMin(x.left);
	}
	
	public Key findMax() {
		return findMax(root).key;
	}
	
	private Node<Key, Value> findMax(Node<Key, Value> x) {
		if(x.right == null) {
			return x;
		}
		return findMax(x.right);
	}
	
	public int rank(Key key) {
		return rank(root, key);
	}
	
	private int rank(Node<Key, Value> x, Key key) {
		if (x == null) {
			return 0;
		}
		
		int cmp = key.compareTo(x.key);
		if(cmp < 0) {
			return rank(x.left, key);
		} else if(cmp > 0) {
			return 1 + size(x.left) + rank(x.right, key);
		} else {
			return size(x.left);
		}
	}
}
