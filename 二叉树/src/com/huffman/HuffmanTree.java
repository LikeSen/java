package com.huffman;

import java.util.LinkedList;

public class HuffmanTree {
	static  int buildHuffmanTree(HuffmanTreeNode[] nodes){
		int n=nodes.length;//获取节点数
		if(n<2){//如果节点数为1个
			return nodes[0].getWeight();
		}
		//创建存放节点的线性表     weight要从小到大
		LinkedList<HuffmanTreeNode> list=new LinkedList<HuffmanTreeNode>();
		//将所有节点存入线性表
		//将节点按照冲大到小的顺序插入线性表
	    for(int i=0;i<n;i++){
	    	insertToList(list, nodes[i]);
	    }
		//选择weight中最小的两个节点进行合并
		for(int j=1;j<n;j++){
			HuffmanTreeNode minl=list.removeLast();
			HuffmanTreeNode minr=list.removeLast();
			HuffmanTreeNode newRoot=new HuffmanTreeNode(minl.getWeight()+minr.getWeight());
			newRoot.setLchild(minl);
			newRoot.setRchild(minr);
			insertToList(list, newRoot);
		}
		return ((HuffmanTreeNode)list.get(0)).getWeight();
		
	}
	static  void buildHuffmanTree2(HuffmanTreeNode[] nodes){
		int n=nodes.length;//获取节点数
		if(n<2){//如果节点数为1个
			return ;
		}
		//创建存放节点的线性表     weight要从小到大
		LinkedList<HuffmanTreeNode> list=new LinkedList<HuffmanTreeNode>();
		//将所有节点存入线性表
		//将节点按照冲大到小的顺序插入线性表
	    for(int i=0;i<n;i++){
	    	insertToList(list, nodes[i]);
	    }
		//选择weight中最小的两个节点进行合并
		for(int j=1;j<n;j++){
			HuffmanTreeNode minl=list.removeLast();
			HuffmanTreeNode minr=list.removeLast();
			HuffmanTreeNode newRoot=new HuffmanTreeNode(minl.getWeight()+minr.getWeight());
			newRoot.setLchild(minl);
			newRoot.setRchild(minr);
			insertToList(list, newRoot);
		}
		
	}
	private static void insertToList(LinkedList l,HuffmanTreeNode node){
		for(int k=0;k<l.size();k++){
			if(node.getWeight()>((HuffmanTreeNode)l.get(k)).getWeight()){
				l.add(k, node);
				return;
			}
		}
		l.add(l.size(), node);
		
		
	}
	//哈胡曼编码
	static <T> void huffmanCoding(HuffmanTreeNode<T> root,HuffmanTreeNode[] nodes){
		buildHuffmanTree2(nodes);
		if(root==null){return ;}
		if(root.getParent()!=null){//如果有父节点
			if((root.getParent()!=null)&&(root==root.getParent().getLchild())){//该节点是否为左孩子
				root.setCode(root.getParent().getCode()+"0");//向左为0
			}
			if((root.getParent()!=null)&&(root==root.getParent().getRchild())){//该节点是否为右孩子
				root.setCode(root.getParent().getCode()+"1");//向右为0
			}
		}
		huffmanCoding(root.getLchild(),nodes);
		huffmanCoding(root.getRchild(),nodes);
		
	}
	
		
		
	
}
