package com.huffman;


public class HuffmanTreeNode<T>{
	private int weight;//节点权重，数据域
	private int flag;//节点是否加入哈夫曼树的标志
	private HuffmanTreeNode<T> parent;//父节点
	private HuffmanTreeNode<T> lchild;//左孩子节点
	private HuffmanTreeNode<T> rchild;//右孩子节点
	private String code="";//编码
	
	//无参构造
	public HuffmanTreeNode() {
		this(0);
	}
	//有参构造，构造叶节点
	public HuffmanTreeNode(int weight) {
		this.weight = weight;
		flag=0;
		parent=lchild=rchild=null;
		code="0";
	}
	//getxx and setxx
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public HuffmanTreeNode<T> getParent() {
		return parent;
	}
	public void setParent(HuffmanTreeNode<T> parent) {
		this.parent = parent;
	}
	public HuffmanTreeNode<T> getLchild() {
		return lchild;
	}
	public void setLchild(HuffmanTreeNode<T> lchild) {
		this.lchild = lchild;
	}
	public HuffmanTreeNode<T> getRchild() {
		return rchild;
	}
	public void setRchild(HuffmanTreeNode<T> rchild) {
		this.rchild = rchild;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
