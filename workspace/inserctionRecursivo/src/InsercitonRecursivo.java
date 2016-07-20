import java.util.Arrays;
import java.util.Scanner;

class InsercitonRecursivo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] seq = split(scanner.nextLine());
		inserction(seq, 0, seq.length - 1);
	}
	
	private static void inserction(int[] seq, int left, int right){
		if(seq == null || seq.length == 0 || left > right || left < 0)
			return;
		
		int eleito = seq[left];
		int j = left;
		
		while(j > 0 && seq[j-1] > eleito){
			int aux = seq[j];
			seq[j] = seq[j-1];
			seq[j-1] = aux;
			j--;
		}
		
		if((right - left + 1) != seq.length)
			System.out.println(Arrays.toString(seq));
		
		inserction(seq, left+1, right);
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
