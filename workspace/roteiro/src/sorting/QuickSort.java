package sorting;

import util.Util;

public class QuickSort<T extends Comparable<T>> implements Sorting<T> {

	public void quickSort(T[] array,int leftIndex, int rightIndex) {
  		if(leftIndex >= rightIndex){
  			return;
  		} else {
  			int pivot = partition(array, leftIndex, rightIndex);
  			quickSort(array, leftIndex, pivot-1);
  			quickSort(array, pivot+1, rightIndex);
  		}
	}

	private int partition(T[] array, int left, int right){
  		int i = left;
  		for(int j = left + 1; j <= right; j++){
  			if(array[j].compareTo(array[left]) == -1){
  				i++;
  				Util.swap(array, i, j);
  			}
  		}
  		Util.swap(array, left, i);
  		return i;
  		
  	}

	@Override
	public void sort(T[] elements) {
		quickSort(elements, 0, elements.length - 1);
	}
	
}
