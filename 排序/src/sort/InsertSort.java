package sort;

public class InsertSort {
	public static void insertSort(int[] array) {
		// ��0λ������Ϊ�������У��ӵ�1λ��ʼ������
		for (int i = 1; i < array.length; i++) {
			// 0~i-1λΪ��������iλС��i-1λ������Ѱλ�����룬������Ϊ0~iλҲ������ģ����Դ˴�ѭ�����൱��continue
				int temp = array[i];// �����iλ��ֵ
				int j;
				for ( j = i - 1; j >= 0 && temp < array[j]; j--) {
					// �ӵ�i-1λ��ǰ��������λ��ֱ���ҵ�С�ڵ�iλֵֹͣ
					array[j+1] = array[j];
				}
				array[j + 1] = temp;// �����iλ��ֵ
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={25,16,28,17,10,20};
		insertSort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}

}
