import java.util.Scanner;

class Stooge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seq = split(sc.nextLine());
		stooge(seq, 0, seq.length-1);
		int i;
		for(i = 0; i < seq.length - 1; i++){
			System.out.print(seq[i] + " ");
		}
		System.out.println(seq[i]);
	}
	
	public static void swap(int[] array, int i, int j) {
		if(array == null)
			throw new IllegalArgumentException();

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void stooge(int[] seq, int ini, int fim){
		if(seq[fim] < seq[ini]){
			int temp = seq[ini];
			seq[ini] = seq[fim];
			seq[fim] = temp;
		}
		if(fim - ini > 1){
			int k = (fim - ini + 1) / 3;
			stooge(seq, ini, fim - k);
			stooge(seq, ini + k, fim);
			stooge(seq, ini, fim - k);
		}
	}
	
	public static int[] split(String values){
		String[] val = values.split(" ");
		int[] seq = new int[val.length];
		
		for(int i = 0; i < val.length; i++){
			seq[i] = Integer.parseInt(val[i]);
		}
		return seq;
	}
	
}
