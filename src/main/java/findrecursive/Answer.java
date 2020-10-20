package findrecursive;

public class Answer {
	public static <T extends Comparable <T>> Node<T> findRecursive(Node<T> root, T findValue)
	{
		if (root == null) {
			return null;
		}
		if (findValue == root.value) {
			return root;
		}

        if(root.value.compareTo(findValue) > 0) {
            return findRecursive(root.left, findValue);
        } else {
            return findRecursive(root.right, findValue);
        }

	}

}
