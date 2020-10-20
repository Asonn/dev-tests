package recursive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    public void Should_ExpectedBehavior_When_Condition() {
        //Arrange
        //Act
        //Assert
        BinaryTree tree = new BinaryTree();
        tree.add(1);

        boolean result = tree.containsNode(1);
        assertThat(result).isTrue();
    }

    @Test
    public void Should_ExpectedBehavior_When_height() {
        //Arrange
        //Act
        //Assert
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);

        int result = tree.calculateHeight();

        assertThat(result).isEqualTo(3);
    }
}