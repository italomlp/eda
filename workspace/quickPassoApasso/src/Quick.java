import java.util.Arrays;
import java.util.Scanner;

class Quick {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] seq = split(scanner.nextLine());
		quick(seq, 0, seq.length-1);
	}
	
	private static void quick(int[] seq, int left, int right){
		if(left >= right)
			return;
		else{
			int pivot = particiona(seq, left, right);
			quick(seq, left, pivot-1);
			quick(seq, pivot+1, right);
		}
	}
	
	private static int particiona(int[] seq, int left, int right){
		int i = left;
		for(int j = left + 1; j <= right; j++){
			if(seq[j] < seq[left]){
				i++;
				int aux = seq[i];
				seq[i] = seq[j];
				seq[j] = aux;
			}
		}
		int aux = seq[left];
		seq[left] = seq[i];
		seq[i] = aux;
		imprimeArray(seq);;
		return i;
	}
	
	private static void imprimeArray(int[] seq){
		String arrayString = "";
		for(int i : seq){
			arrayString += i + " ";
		}
		System.out.println(arrayString.trim());
	}
	
	public static int[] split(String values){
		if(values.trim().equals(""))
			return new int[0];
		String[] val = values.split(" ");
		int[] seq = new int[val.length];
		for(int i = 0; i < val.length; i++){
			seq[i] = Integer.parseInt(val[i]);
		}
		return seq;
	}
	
}
