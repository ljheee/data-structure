package com.mashibing.tree;

/**
 * 查找二叉树中某个节点的所有祖先节点
 */
class BinaryTree_Ancestors {
    Node root;

    boolean printAncestors(Node node, int target) {
        if (node == null)
            return false;

        if (node.data == target)
            return true;

        if (printAncestors(node.left, target)
                || printAncestors(node.right, target)) {
            System.out.print(node.data + " ");
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        BinaryTree_Ancestors tree = new BinaryTree_Ancestors();
		
		/* Construct the following binary tree 
				1 
				/ \ 
			2	 3 
			/ \ 
			4 5 
			/ 
		7 
		*/
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);

        tree.printAncestors(tree.root, 7);

    }
} 
