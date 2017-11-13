package sort;

public class InsertSort {
	public static void insertSort(int[] array) {
		// 第0位独自作为有序数列，从第1位开始向后遍历
		for (int i = 1; i < array.length; i++) {
			// 0~i-1位为有序，若第i位小于i-1位，继续寻位并插入，否则认为0~i位也是有序的，忽略此次循环，相当于continue
				int temp = array[i];// 保存第i位的值
				int j;
				for ( j = i - 1; j >= 0 && temp < array[j]; j--) {
					// 从第i-1位向前遍历并移位，直至找到小于第i位值停止
					array[j+1] = array[j];
				}
				array[j + 1] = temp;// 插入第i位的值
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
