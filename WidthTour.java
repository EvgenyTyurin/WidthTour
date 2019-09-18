import java.util.LinkedList;

/**
 * Tree tour by width strategy
 * Tree nodes a generic for data type flexibility
 * Sep 2019 EvgenyT
 */

public class WidthTour {
    public static void main(String[] args) {
        // Make a tree
        TreeNode<Character> nodeD = new TreeNode<>('D');
        TreeNode<Character> nodeE = new TreeNode<>('E');
        TreeNode<Character> nodeF = new TreeNode<>('F');
        TreeNode<Character> nodeG = new TreeNode<>('G');
        TreeNode<Character> nodeB = new TreeNode<>('B', nodeD, nodeE);
        TreeNode<Character> nodeC = new TreeNode<>('C', nodeF, nodeG);
        TreeNode<Character> nodeA = new TreeNode<>('A', nodeB, nodeC);
        // Put root into simple FIFO buffer
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(nodeA);
        // Start a tour!
        while (!treeNodes.isEmpty()) {
            // Get first node from buffer and print
            TreeNode node = treeNodes.poll();
            System.out.println(node.getData());
            // Push left node to buffer
            if (node.getLeftNode() != null)
                treeNodes.add(node.getLeftNode());
            // Push right node to buffer
            if (node.getRightNode() != null)
                treeNodes.add(node.getRightNode());
        }
    }
}
