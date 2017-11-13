package com.tree;

public class Test {

	public static void main(String[] args) {
		TreeNode<Character> node1=new TreeNode<Character>('A', null, null);
		TreeNode<Character> node2=new TreeNode<Character>('B', null, null);
		TreeNode<Character> node3=new TreeNode<Character>('C', null, null);
		TreeNode<Character> node4=new TreeNode<Character>('D', null, null);
		TreeNode<Character> node5=new TreeNode<Character>('E', null, null);
		TreeNode<Character> node6=new TreeNode<Character>('F', null, null);
		TreeNode<Character> node7=new TreeNode<Character>('G', null, null);
		TreeNode<Character> node8=new TreeNode<Character>('H', null, null);
		TreeNode<Character> node9=new TreeNode<Character>('K', null, null);
		node1.setLeft(node2);
		node1.setRight(node5);
		node2.setRight(node3);
		node3.setLeft(node4);
		node5.setRight(node6);
		node6.setLeft(node7);
		node7.setLeft(node8);
		node7.setRight(node9);
		BT<Character> bt=new BT<Character>(node1);
		System.out.println("树的结点数："+bt.getSize(node1));
		System.out.println("树的深度："+bt.getHeight(node1));
        System.out.println("树的根结点："+bt.getRoot());
        System.out.println("先序递归遍历：");
        bt.preOrder();
        System.out.println("");
        System.out.println("先序非递归（栈）遍历："); 
        bt.preOrderTraverse();
        System.out.println("");
        System.out.println("中序递归遍历：");
        bt.inOrder();
        System.out.println("");
        System.out.println("中序非递归（栈）遍历："); 
        bt.inOrderTraverse();
        System.out.println("");
        System.out.println("后序递归遍历：");
        bt.postOrder();
        System.out.println("");
        System.out.println("后序非递归（栈）遍历："); 
        bt.postOrderTraverse();
        System.out.println("");
        System.out.println("按层非递归遍历（用队列）：");
        bt.levelOrder();
        System.out.println("");
        
       TreeNode t= bt.search(node1,'E');
       System.out.println(t);
       
       System.out.println(bt.count(node9));
       System.out.println(bt.isEqual(node1, node2)); 
		
		
	}

}
