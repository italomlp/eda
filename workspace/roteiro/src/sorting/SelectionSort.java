package sorting;

import util.Util;

public class SelectionSort<T extends Comparable<T>> implements Sorting<T>{

	@Override
	public void sort(T[] elements) {
		
		T menor;
  		int iMenor;
  		for(int i = 0; i < elements.length - 2; i++){
  			menor = elements[i];
  			iMenor = i;
  			for(int j = i + 1; j <= elements.length - 1; j++){
  				if(elements[j].compareTo(menor) == -1){
  					menor = elements[j];
  					iMenor = j;
  				}
  			}
  			
  			Util.swap(elements, i, iMenor);	
  		}
		
	}

}
