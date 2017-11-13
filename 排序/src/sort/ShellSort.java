package sort;

public class ShellSort {
	public static void shellSort(int[] a) {
		int d = a.length;
		while (d != 0) {
			d = d / 2; // �ֵ�����
			// ���е�Ԫ�أ��ӵڶ�������ʼ
			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < a.length; i += d) {
					int j = i - d;// jΪ�����������һλ��λ��
					int temp = a[i];// Ҫ�����Ԫ��
					// �Ӻ���ǰ������
					for (; j >= 0 && temp < a[j]; j -= d) {
						// ����ƶ�dλ
						a[j + d] = a[j];
						}
					a[j + d] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 25, 16, 28, 17, 10, 20 };
		shellSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
