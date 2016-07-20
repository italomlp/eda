package sorting;

public class InserctionSort<T extends Comparable<T>> implements Sorting<T>{
	
	public void insertion(int[] v) {

		for (int j = 1; j < v.length; j++) {
			int key = v[j];
			int i = j-1;
			while(i >= 0 && v[i] > key) {
				v[i+1] = v[i]; 
				i--;
			}
			v[i+1] =key;
		}
	}

	@Override
	public void sort(T[] elements) {
		for (int j = 1; j < elements.length; j++) {
			T key = elements[j];
			int i = j-1;
			while(i >= 0 && (elements[i].compareTo(key) == 1)) {
				elements[i+1] = elements[i]; 
				i--;
			}
			elements[i+1] = key;
		}
	}
	
}
