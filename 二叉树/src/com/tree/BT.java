package com.tree;

public class BT<T> implements Tree<T>{
	private TreeNode<T> root; //创建树的根节点
	private int size;//树的总结点数
	//无参构造   构造空树
	public BT() {
		this(null);
	}
	//有参构造    构造根为root的树    此时节点数为1，树的深度为1.
	public BT(TreeNode<T> r) {
		this.root = r;
		if(r!=null){
			size=1;
		}else{
			size=0;
		}
	}

	//返回二叉树的结点数
	public int getSize(TreeNode<T> root) {
		size=1;
		if(root.getLeft()!=null){
			size=size+getSize(root.getLeft());
		}
		if(root.getRight()!=null){
			size=size+getSize(root.getRight());
		}
		return size;
	}
	//二叉树是否为空
	public boolean isEmpty() {
		return size==0;
	}
	//返回二叉树的根节点
	public T getRoot() {
		if(isEmpty()){
			System.out.println("这是一颗空树");
			return null;
		}else{
			return root.getElement();	
		}
	}
	//返回二叉树的高度
	public int getHeight(TreeNode<T>  root) {
		if(root==null){
			return 0;
		}
		if(root.getLeft()==null&&root.getRight()==null){
			return 1;
		}
		return 1+Math.max(getHeight(root.getLeft()), getHeight(root.getRight()));
	}
	//从当前结点e开始前序遍历二叉树
	public void preOrder(TreeNode<T> e) {
		if(e==null){
			return ;	
		}
		System.out.print(e.getElement());
		preOrder(e.getLeft());
		preOrder(e.getRight());
	}
	//从根开始前序遍历二叉树
	public void preOrder(){
		preOrder(root);
	}
	//前序遍历二叉树（非递归）
	public void preOrderTraverse(){
		TreeNode T=root;
		if(T!=null){
			LinkedStack s=new LinkedStack();
			s.push(T);
			while(!s.isEmpty()){
				T =(TreeNode)s.pop();
				System.out.print(T.getElement());
				while(T!=null){
					if(T.getLeft()!=null)
						System.out.print(T.getLeft().getElement());
					if(T.getRight()!=null)
						s.push(T.getRight());
					T=T.getLeft();
					}
				}
			}
		}
	
	//从当前结点e开始中序遍历二叉树
	public void inOrder(TreeNode<T> e) {
		if(e==null){
			return ;	
		}
		inOrder(e.getLeft());
		System.out.print(e.getElement());
		inOrder(e.getRight());
	}
	//从根开始中序遍历二叉树
	public void inOrder(){
		inOrder(root);
	}
	//中序遍历二叉树（非递归）
	public void inOrderTraverse(){
		TreeNode T=root;
		if(T!=null){
			LinkedStack s=new LinkedStack();
			s.push(T);
			while(!s.isEmpty()){
				while(s.peek()!=null){
					s.push(((TreeNode)s.peek()).getLeft());
				}
				s.pop();
				if(!s.isEmpty()){
					T=(TreeNode)s.pop();
					System.out.print(T.getElement());
					s.push(T.getRight());
				}
			}
		}
	}
	//从当前结点e开始后序遍历二叉树
	public void postOrder(TreeNode<T> e) {
		if(e==null){
			return ;	
		}
		postOrder(e.getLeft());
		postOrder(e.getRight());
		System.out.print(e.getElement());
	}
	//从根开始后序遍历二叉树
	public void postOrder() {
		postOrder(root);
	}
	//后序遍历二叉树（非递归，用栈）
	public void postOrderTraverse(){
		TreeNode T=root;
		boolean flag;
		if(T!=null){
			LinkedStack<TreeNode> s=new LinkedStack<TreeNode>();
			s.push(T);
			TreeNode p=null;
			while(!s.isEmpty()){
				while(s.peek()!=null){
					s.push(((TreeNode)s.peek()).getLeft());
					}
				s.pop();//空结点出栈
				while(!s.isEmpty()){
					T=(TreeNode)s.peek();
					if(T.getRight()==p||T.getRight()==null){//有问题
						System.out.print(T.getElement());
						s.pop();
						p=T;
						flag=true;
					}else{
						s.push(T.getRight());
						flag=false;
					}
					if(!flag){
						break;
						}
					}
				}
			}
		}
	//按层遍历二叉树
	//使用队列
	public void levelOrder() {
		TreeNode T =root;
		if(T!=null){
			LinkedQueue queue=new LinkedQueue();
			queue.enqueue(T);
			while(!queue.isEmpty()){
				T=(TreeNode)queue.dequeue();
				System.out.print(T.getElement());
				if(T.getLeft()!=null){
					queue.enqueue(T.getLeft());
				}
				if(T.getRight()!=null){
					queue.enqueue(T.getRight());
				}
				
			}
		}
	}
	//寻找（发现）数据元素x的结点（利用递归的方法）
	public TreeNode<T> search(TreeNode T,Object x) {//在以T为根结点的树中寻找数据元素x
		TreeNode<T> result = null;   //定义结果结点初始化为null
		if(T!=null){//如果根结点不为空
			if(T.getElement().equals(x)){//判断根结点的数据元素是否等于数据元素x
				return T; //若是，返回根结点
			}else{
				 result= search(T.getLeft(), x);//否则，在树的左子树中寻找
				 if(result==null){ //若没有找到，在树的右子树中找
					 result=search(T.getRight(), x);
				 }
			}
		}
		return result;
	}
	//计算二叉树的节点数
	public int count(TreeNode T){
		int count=0;
		if(T!=null){
			count=count+count(T.getLeft());
			count=count+count(T.getRight());
			count++;
		}
		return count;
	}
	
	//判断两颗树是否相等
	public boolean isEqual(TreeNode t1,TreeNode t2){
		if(t1==null&&t2==null){
			return true;
		}
		if(t1!=null&&t2!=null){
			if(isEqual(t1.getLeft(), t2.getLeft())){
				if(t1.getElement()==t2.getElement()){
					if(isEqual(t1.getRight(), t2.getRight())){
						return true;
					}
				}
			}
		}
		return false;
	}
	
}

