package sorting;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> implements Sorting<T>{

	@Override
	public void sort(T[] elements) {
		mergeSort(elements, 0, elements.length - 1);
	}

	public void mergeSort(T[] array,int leftIndex, int rightIndex) {
		if(leftIndex >= rightIndex){
			return;
		} else {
			int med = (leftIndex + rightIndex) / 2;
			mergeSort(array, leftIndex, med);
			mergeSort(array, med+1, rightIndex);
			merge(array, leftIndex, med, rightIndex);
		}
	}

	private void merge(T[] array, int left, int med, int right){
		T[] helper = Arrays.copyOf(array, array.length);
/*		T[] helper = Util.<T>makeArray(array.length);
		for(int x = 0; x < array.length; x++)
			helper[x] = array[x];
*/
		int i = left;
		int j = med + 1;
		int k = left;
		while(i <= med && j <= right){
			if(helper[i].compareTo(helper[j]) == -1){
				array[k] = helper[i];
				i++;
			} else {
				array[k] = helper[j];
				j++;
			}
			k++;
		}
		while(i <= med){
			array[k] = helper[i];
			i++;
			k++;
		}
		while(j <= right){
			array[k] = helper[j];
			j++;
			k++;
		}
	}
}
