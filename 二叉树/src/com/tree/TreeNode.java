package com.tree;
/**
 * 创建二叉树节点
 * */
public class TreeNode<T> {
	private  T element;   // 数据元素域
	private TreeNode<T> left; //指向左孩子域
	private TreeNode<T> right; //指向右孩子域
	
	
	//无参构造函数   空节点
	public TreeNode() {
		this(null);
	}
	//有参构造函数   带一个参数
	//左右孩子域为空的节点
	public TreeNode(T e) {
		this.element = e;
		this.left = null;
		this.right = null;
	}
	//构造中间某个节点
	public TreeNode(T element, TreeNode<T> left, TreeNode<T> right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}
	/**
	 * getXX/setXX方法
	 * 
	 * */
	public T getElement() {
		return element;
	}
	public void setElement(T e) {
		this.element = e;
	}
	public TreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<T> l) {
		this.left = l;
	}
	public TreeNode<T> getRight() {
		return right;
	}
	public void setRight(TreeNode<T> r) {
		this.right = r;
	}
	
	
}
