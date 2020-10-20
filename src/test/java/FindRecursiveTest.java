import findrecursive.Answer;
import findrecursive.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindRecursiveTest {
	
	private Node <Integer> n1;
	private Node<Integer> n2;
	private Node<Integer> n3;
	private Node<Integer> n5;
	private Node<Integer> n7;
	private Node<Integer> n8;
	private Node<Integer> n9;

	@Before
	public void setUp() throws Exception {
		n1 = new Node<> (null,null,1);
		n3 = new Node<> (null,null,3);
		n2 = new Node<> (n1,n3,2);
		n7 = new Node<> (null,null,7);
		n9 = new Node<> (null,null,9);
		n8 = new Node<> (n7,n9,8);
		n5 = new Node<> (n2,n8,5);
	}

	@Test
	public void testFindRecursiveLeaf() {
		Node<Integer> result = Answer.findRecursive(n5, 3);
		assertSame(n3,result);
	}
	@Test
	public void testFindRecursiveNonLeaf() {
		Node<Integer> result = Answer.findRecursive(n5, 8);
		assertSame(n8,result);
	}
	@Test
	public void testFindRecursiveRoot() {
		Node<Integer> result = Answer.findRecursive(n5, 5);
		assertSame(n5,result);
	}
	@Test
	public void testFindRecursiveNotThere() {
		Node<Integer> result = Answer.findRecursive(n5, 4);
		assertNull(result);
	}

}
