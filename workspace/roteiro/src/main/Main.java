package main;

import java.io.*;
import java.util.Date;
import java.util.Random;

import sorting.InserctionSort;
import sorting.MergeSort;
import sorting.QuickSort;
import sorting.SelectionSort;
import sorting.Sorting;

public class Main {
	
	private static Random randomGenerator = new Random();
	private static File file;
	private static DataOutputStream dataOut;
	private static Integer[] array;
	private static SelectionSort<Integer> selection = new SelectionSort<>();
	private static InserctionSort<Integer> inserction = new InserctionSort<>();
	private static QuickSort<Integer> quick = new QuickSort<>();
	private static MergeSort<Integer> merge = new MergeSort<>();
	private static final String FIM = System.lineSeparator();
	
	private static void startsOutputVariables(){
		file = new File("sort.data");
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
//				e.printStackTrace();
				System.out.println("Nao foi possivel criar arquivo.");
			}
		}
		
		try {
			dataOut = new DataOutputStream(new FileOutputStream(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public static void main(String[] args){
		startsOutputVariables();
		write("alg time sample" + FIM);
		String data = "";
		for(int i = 20000; i <= 40000; i+= 1000){
			array = makeArray(i);
			long timeSelection = executeSortingAlgorithm(selection);
			array = makeArray(i);
			long timeInserction = executeSortingAlgorithm(inserction);
			array = makeArray(i);
			long timeQuick = executeSortingAlgorithm(quick);
			array = makeArray(i);
			long timeMerge = executeSortingAlgorithm(merge);
			
			data += "selection " + String.valueOf(timeSelection) + " " + i + FIM;
			data += "inserction " + String.valueOf(timeInserction) + " " + i + FIM;
			data += "quick " + String.valueOf(timeQuick) + " " + i + FIM;
			data += "merge " + String.valueOf(timeMerge) + " " + i + FIM;
			
//			write("selection " + String.valueOf(timeSelection) + " " + i + FIM);
//			write("inserction " + String.valueOf(timeInserction) + " " + i + FIM);
//			//write("quick " + String.valueOf(timeQuick) + " " + i);
//			write("merge " + String.valueOf(timeMerge) + " " + i + FIM);
		}
		
		write(data);
		
		try {
			dataOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static long executeSortingAlgorithm(Sorting strategy){
		long lStartTime = new Date().getTime();
		
		strategy.sort(array);
		
		long lEndTime = new Date().getTime();
		
		return lEndTime - lStartTime;
		
	}
	
	private static Integer[] makeArray(int size){
		Integer[] array = new Integer[size];
		for(int i = 0; i < array.length; i++){
			array[i] = randomGenerator.nextInt();
		}
		return array;
	}
	
	private static void write(String data){
		try {
			dataOut.write(data.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
