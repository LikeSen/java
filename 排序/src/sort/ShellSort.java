package sort;

public class ShellSort {
	public static void shellSort(int[] a) {
		int d = a.length;
		while (d != 0) {
			d = d / 2; // 分的组数
			// 组中的元素，从第二个数开始
			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < a.length; i += d) {
					int j = i - d;// j为有序序列最后一位的位数
					int temp = a[i];// 要插入的元素
					// 从后往前遍历。
					for (; j >= 0 && temp < a[j]; j -= d) {
						// 向后移动d位
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
