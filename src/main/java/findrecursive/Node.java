package findrecursive;

public class Node<T extends Comparable <T>> {
	public Node(Node<T> l, Node<T> r, T v)
	{
		left = l;
		right = r;
		value = v;
	}
	public Node<T> left;
	public Node<T> right;
	public T value;
}
