package com.huffman;

public class Test {

	public static void main(String[] args) {
		HuffmanTreeNode<Integer> node1 =new HuffmanTreeNode<Integer>(5);
		HuffmanTreeNode<Integer> node2 =new HuffmanTreeNode<Integer>(2);
		HuffmanTreeNode<Integer> node3 =new HuffmanTreeNode<Integer>(6);
		HuffmanTreeNode<Integer> node4 =new HuffmanTreeNode<Integer>(9);
		HuffmanTreeNode<Integer> node5 =new HuffmanTreeNode<Integer>(7);
		HuffmanTreeNode[] nodes=new HuffmanTreeNode[5];
		nodes[0]=node1;
		nodes[1]=node2;
		nodes[2]=node3;
		nodes[3]=node4;
		nodes[4]=node5;
		System.out.println(HuffmanTree.buildHuffmanTree(nodes));
		HuffmanTree.huffmanCoding((HuffmanTreeNode)node1,nodes);
		System.out.println(node1.getCode());
//		String s1="0";
//		String s2="1";
//		System.out.println(s1+s2);
				
		

	}

}
