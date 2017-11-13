package com.tree;

public interface Tree<T> {
	public int getSize(TreeNode<T> root);  //返回以root为根节点的二叉树的结点数
	public boolean isEmpty();//二叉树是否为空
	public T getRoot();//返回二叉树的根节点
	public int getHeight(TreeNode<T> root);//返回以root为根节点的二叉树的高度
	public void preOrder();//从根开始前序遍历二叉树
	public void preOrder(TreeNode<T> e);//从当前结点e开始前序遍历二叉树
	public void inOrder();//从根开始中序遍历二叉树
	public void inOrder(TreeNode<T> e);//从当前结点e开始中序遍历二叉树
	public void postOrder();//从根开始后序遍历二叉树
	public void postOrder(TreeNode<T> e);//从当前结点e开始后序遍历二叉树
	public void levelOrder();//按层遍历二叉树
	//public boolean remove(T e);//删除数据元素e
	public TreeNode<T> search(TreeNode T,Object x);//发现数据元素e
	
	
}
