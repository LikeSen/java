package ten_08;

public class TestStackOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOfInteger stack =new StackOfInteger();
		for(int i=0;i<10;i++){
			stack.push(i);
			
		}
		
		while(!stack.empty()){
			System.out.println(stack.pop()+" "+stack.getSize());
			
		}
		
		//Double x =3;
		//Integer x=3;
		//Double x=3.0;
		//int x = new Integer(3)+new Integer(4);
		//Integer x=3+new Integer(4);
		//System.out.println(x);
	}

}
