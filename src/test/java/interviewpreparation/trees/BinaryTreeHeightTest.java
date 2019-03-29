package interviewpreparation.trees;

import org.junit.Test;
import interviewpreparation.trees.BinaryTreeHeight.Node;

import static org.junit.Assert.assertEquals;

/**
 * Simple test case for {@link BinaryTreeHeight} solution
 *
 * @author csantos
 */
public class BinaryTreeHeightTest {

    private Node tree;

    @Test
    public void test_case_0() {
        initializeTree();
        assertEquals(3, BinaryTreeHeight.height(tree));
    }

    private void initializeTree() {
        tree = new Node(3);
        BinaryTreeHeight.insert(tree, 1);
        BinaryTreeHeight.insert(tree, 7);
        BinaryTreeHeight.insert(tree, 5);
        BinaryTreeHeight.insert(tree, 4);
    }
}
